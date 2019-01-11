package com.tedu.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

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

		public void run() {
			try {
				System.out.println("處理客戶端請求!");
				// 獲取輸入流
				InputStream in = socket.getInputStream();
				
				
				StringBuilder builder = new StringBuilder();
				int d = -1;
				char c1=0,c2=0;//c1表示上次讀到的字節,c2表示本次讀到的字節
				while((d=in.read())!=-1) {
					c2 = (char)d;
					if(c1==13&&c2==10) {
						break;
					}
					builder.append(c2);
					c1 = c2;
				}
				System.out.println(builder.toString().trim());
//				while ((d = in.read()) != -1) {
//					System.out.print((char)d);
//				}

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
