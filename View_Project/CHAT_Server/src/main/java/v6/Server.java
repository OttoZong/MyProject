package v6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 聊天室服務端
 * @author Otto
 *
 * 如何查看IP,Window、Linux
  * 補充：
 * Window, CMD介面 , ipconfig
 * Linux, 控制台, sbin/ifconfig
 */
public class Server {
	/*
	 * java.net.ServerSocket
	 * 運行在server端的ServerSocket
	 * 
	 * 主要作用有兩個:
	 * 1.向系統申請服務端口,客戶端就是通過這個端口與之連結的.
	 * 2.監聽該服務端口,一旦客戶端通過這個端口請求連結,
	 * 	  則創建一個Socket與該客戶端進行通訊.
	 */
	private ServerSocket server;
	/*
	 * 存放所有客戶端輸出流,用於廣播消息.
	 */
	private Collection<PrintWriter> allOut;
	
	public Server() {
		try {
			/*
			  * 實例化ServerSocket的同時申請服務端口.
			  * 若該端口已經被其他程序占用,則會拋出異常.
			 * address already in use
			 */
			System.out.println("請啟動服務端...");
			server = new ServerSocket(8088);
			allOut = new ArrayList<PrintWriter>();
			System.out.println("服務端啟動完畢!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void start() {
		try {
			/*
			 * ServerSocket提供的方法:
			 * Socket accept()
			 * 	該方法是一個阻塞方法,調用到該方法後程序"卡住",
			 * 	並等待客戶端的連接,一旦一個客戶端連結了,
			 * 	那麼就會返回一個Socket實例,通過該實例即可與
			 * 	連接的客戶端進行通訊.
			 */
			while(true) {
				System.out.println("等待客戶端連接....");
				Socket socket = server.accept();
				System.out.println("一個客戶端連結了!");
				
				//創建線程
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	
	private class ClientHandler implements Runnable{
		
		private Socket socket;
		//紀錄當前客戶端的地址訊息.
		private String host;
		
		public ClientHandler(Socket socket) {
			this.socket = socket;
			InetAddress address = socket.getInetAddress();
			host = address.getHostAddress();
		}
		
		public void run() {
			PrintWriter pw = null;
			try {
				System.out.println("一個線程啟動了!");
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
				pw = new PrintWriter(osw,true);
				
				//將該客戶端的輸出流存入allOut
//				allOut = Arrays.copyOf(allOut, allOut.length);
//				allOut[allOut.length-1] = pw;
				synchronized (allOut) {
					allOut.add(pw);
				}
				
				
				String line = null;
				while((line = br.readLine())!=null) {
					System.out.println("客戶端說:"+line);
					synchronized (allOut) {
						//回復所有客戶端
						for(PrintWriter o:allOut) {
						o.println(host+"說"+line);
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				/*
				 * 處理客戶端斷開連結後的操作.
				 */
				System.out.println("一個客戶端斷線了");
				
				synchronized (allOut) {
					//將該客戶端的輸出流從共享集合中刪除
					allOut.remove(pw);
				}

//				for(int i=0;i<allOut.length;i++) {
//					if(allOut[i]==pw) {
//						//與數組的最後一個元素交換
//						allOut[i] = allOut[allOut.length-1];
//						//縮容
//						allOut = Arrays.copyOf(allOut, allOut.length-1);
//						break;
//					}
//				}
				try {
					/*
					 * socket關閉後,輸出流與輸入流也就關閉了.
					 */
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
