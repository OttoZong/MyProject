package com.tedu.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.tedu.http.HttpRequest;
import com.tedu.http.HttpResponse;

/**
 * Web服務端主類
 * 
 * @author Otto
 *
 */
public class WebServer {
	private ServerSocket server;

	public WebServer() {
		try {
			System.out.println("正在初始化服務端...");
			server = new ServerSocket(8080);
			System.out.println("服務端初始化完畢...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		try {
			while (true) {
				// System.out.println("等待客戶端連接...");
				Socket socket = server.accept();
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
				// System.out.println("一個客戶端連接了!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		WebServer server = new WebServer();
		server.start();
	}

	/**
	 * 處理客戶端請求並完成響應.
	 * 
	 * @author Otto
	 *
	 */
	private class ClientHandler implements Runnable {
		private Socket socket;

		public ClientHandler(Socket socket) {
			this.socket = socket;
		}
		/*
		 * v5課程內容 輸出流解析請求
		 */
		public void run() {
			try {
				System.out.println("處理客戶端請求!");
				//根據輸入流解析請求
				HttpRequest request = new HttpRequest(socket.getInputStream());
				//根據輸出流創建響應對象
				HttpResponse response = new HttpResponse(socket.getOutputStream());
				
				//打樁 localhost:8080//myweb/index.html
				System.out.println("requestLine:"+request.getRequestLine());
				/**
				 * 先判斷用戶請求的是否為業務功能
				 */
				//是否請求註冊功能
				if("/myweb/reg".equals(request.getRequestLine())){
					System.out.println("開始註冊!");

					/*
					 * 首先獲取用戶輸入的註冊訊息.
					 * 將用戶註冊訊息用下面的格式按行寫入到user.txt文件中保存.
					 * 格式:username,password,nickname
					 * 例如:fancq,123456,fanfan
					 */
					String username = request.getParameter("username");
					String password = request.getParameter("password");
					String nickname = request.getParameter("nickname");
					System.out.println(username+","+password+","+nickname);
					PrintWriter pw = null;
					try{
						pw = new PrintWriter(
								new OutputStreamWriter(
										new FileOutputStream("user.txt",true)
								)
						);
						pw.println(username+","+password+","+nickname);
					}catch(Exception e){
						e.printStackTrace();
					}finally{
						if(pw!=null){
							pw.close();
						}
					}
					System.out.println("註冊完畢!");
					forward("/myweb/reg_success.html", request, response);
					
					
				}else if("/myweb/login".equals(request.getRequestLine())){
					System.out.println("處理登入資訊!");
					String username = request.getParameter("username");
					String password = request.getParameter("password");
					System.out.println(username+":"+password);
					BufferedReader br = null;
					try {
						br = new BufferedReader(
								new InputStreamReader(
										new FileInputStream("user.txt")
								)
						);
						//按行讀取每個用戶的信息.
						String line = null;
						boolean login = false;//默認登錄失敗!
						while((line = br.readLine())!=null){
							//按照","拆分用戶信息
							String[] infos = line.split(",");
							String user = infos[0];
							String pwd = infos[1];
							System.out.println("正在比對的用戶:"+user);
							if(username.equals(user)&&password.equals(pwd)){
								login = true;
								break;
							}
						}
						if(login){
							System.out.println("登錄成功");
							forward("/myweb/login_success.html", request, response);
						}else{
							System.out.println("登錄失敗");
							forward("/myweb/login_error.html", request, response);
						}
						
					} catch (Exception e) {
						e.printStackTrace();
					} finally{
						if(br != null){
							br.close();
						}
					}
				}else{

					/*
					 * v6課程 
					 * 查看請求的該頁面是否存在
					 */
					File file = new File("webapps"+request.getRequestLine());
					if(file.exists()) {
						//System.out.println("1");
						System.out.println("該文件存在!");
						/*
						 * 響應客戶端
						 */ 
						//String name = file.getName().substring(file.getName().lastIndexOf(".")+1);
						//String contentType = HttpContext.getContentTypeByMine(name);
						//response.setContentType(contentType);
						//	▼▼▼
						//response.setContentType(HttpContext.getContentTypeByMine(file.getName().substring(file.getName().lastIndexOf(".")+1)));

						
						//設置響應頭信息.
						forward(request.getRequestLine(), request, response);
					} else {
						System.out.println("該文件不存在!");
					}
				}
				

			} catch (Exception e) {
					e.printStackTrace();
			} finally{
				// 處理客戶端斷開連接後的操作
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		/**
		 * 跳轉頁面
		 */
		private void forward(String path,HttpRequest request,HttpResponse response){
			try {
				File file = new File("webapps"+path);
				String name = file.getName().substring(file.getName().lastIndexOf(".")+1);
				//根據後餟找到對應的Content-Type值.
				String contentType = HttpContext.getContentTypeByMine(name);

				//設置響應頭Content-Type
				response.setContentType(contentType);
				response.setContentLength((int)file.length());
				
				//設置響應正文.
				response.setEntity(file);
				//響應客戶端.
				response.fiush();
			} catch (Exception e) {
				
			}
		}
	}
}
