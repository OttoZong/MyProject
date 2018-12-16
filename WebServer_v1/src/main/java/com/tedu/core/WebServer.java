package com.tedu.core;

import java.io.IOException;
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
