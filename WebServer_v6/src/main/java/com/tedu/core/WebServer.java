package com.tedu.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
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
				//打樁 localhost:8080//myweb/index.html
				System.out.println("uri:"+request.getUri());
				HttpResponse response
				= new HttpResponse(socket.getOutputStream());
				/*
				 * v6課程 
				 * 查看請求的該頁面是否存在
				 */
				File file = new File("webapps"+request.getUri());
				if(file.exists()) {
					//System.out.println("1");
					System.out.println("該文件存在!");
					/*
					 * 響應客戶端
					 */ 
					OutputStream out = socket.getOutputStream();
					String statusLine = "HTTP/1.1 200 OK";
					out.write(statusLine.getBytes("UTF8"));
					out.write(13);	//written CR
					out.write(10);	//written LF
					//System.out.println("狀態行發送完畢!");
					//System.out.println("2");
					//發送響應頭
					out.write("Content-Type:text/html".getBytes("UTF8"));
					out.write(13);	//written CR
					out.write(10);	//written LF
					out.write(("Content-Length:"+file.length()).getBytes("UTF8"));
					out.write(13);	//written CR
					out.write(10);	//written LF
					out.write(13);	//written CR
					out.write(10);	//written LF
					//System.out.println("所有頭發送完畢!");
					//發送響應正文(將頁面數據發送)
					//System.out.println("3");
					
					FileInputStream fis = new FileInputStream(file);
					byte[] data = new byte[1024*10];
					int len = -1;
					while((len = fis.read(data))!=-1) {
						out.write(data, 0, len);
					}
					//System.out.println("4");
					//System.out.println("正文發送完畢!");
					fis.close();
				} else {
					System.out.println("該文件不存在!");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// 處理客戶端斷開連接後的操作
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
