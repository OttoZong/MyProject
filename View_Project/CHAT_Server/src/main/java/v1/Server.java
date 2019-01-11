package v1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 聊天室服務端
 * @author Otto
 *
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
	
	public Server() {
		try {
			/*
			  * 實例化ServerSocket的同時申請服務端口.
			  * 若該端口已經被其他程序占用,則會拋出異常.
			 * address already in use
			 */
			System.out.println("請啟動服務端...");
			server = new ServerSocket(8088);
//			System.out.println("構造方法：server:"+server);
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
	//			System.out.println("server:"+server);
				Socket socket = server.accept();
	//			System.out.println("socket:"+socket);
				System.out.println("一個客戶端連結了!");
			}
//			InputStream in = socket.getInputStream();
//			InputStreamReader isr = new InputStreamReader(in,"UTF-8");
//			BufferedReader br = new BufferedReader(isr);
//			
//			while(true) {
//				String line = br.readLine();
//				System.out.println("客戶端說:"+line);
//			}
			
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
	/*
	 * 如何查看IP,Window、Linux
	  * 補充：
	 * Window, CMD介面 , ipconfig
	 * Linux, 控制台, sbin/ifconfig
	 */
}
