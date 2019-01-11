package com.tedu.core;

import java.io.File;
import java.net.ServerSocket;
import java.net.Socket;

import com.tedu.http.HttpRequest;
import com.tedu.http.HttpResponse;
import com.tedu.servlets.HttpServlet;
import com.tedu.servlets.LoginServlet;
import com.tedu.servlets.RegServlet;

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
				 * 先判斷用戶請求的是否為業務功能.
				 */
				if(ServerContext.servletMapping.containsKey(request.getRequestLine())){
					System.out.println("請求的是一個Servlet!");
					//通過請求路徑找到對應的Servlet名子.
					String className = ServerContext.servletMapping.get(request.getRequestLine());
					System.out.println("該Serverlet名子:"+className);
					//通過反射機制加載這個類.
					Class cls = Class.forName(className);
					System.out.println("反射完畢");
					//實例化這個Servlet.
					HttpServlet servlet= (HttpServlet)cls.newInstance();
					System.out.println("實例化該Servlet:"+servlet);
					servlet.service(request,response);

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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		private void forward(String path,HttpRequest request,HttpResponse response) {
			try {
				File file = new File("webapps"+path);
				String name = file.getName().substring(
						file.getName().lastIndexOf(".")+1);
				String contentType 
					= HttpContext.getContentTypeByMine(name);
				//设置响应头Content-Type
				response.setContentType(contentType);
				response.setContentLength((int)file.length());
				//设置响应正文
				response.setEntity(file);
				//响应客户端
				response.fiush();
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}