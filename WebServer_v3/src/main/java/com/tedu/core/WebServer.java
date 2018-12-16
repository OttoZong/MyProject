package com.tedu.core;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.tedu.http.HttpRequest;

/**
 * Web�A�ȺݥD��
 * 
 * @author Otto
 *
 */
public class WebServer {
	private ServerSocket server;

	public WebServer() {
		try {
			System.out.println("���b��l�ƪA�Ⱥ�...");
			server = new ServerSocket(8080);
			System.out.println("�A�Ⱥݪ�l�Ƨ���...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		try {
			while (true) {
				// System.out.println("���ݫȤ�ݳs��...");
				Socket socket = server.accept();
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
				// System.out.println("�@�ӫȤ�ݳs���F!");
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
	 * �B�z�Ȥ�ݽШD�ç����T��.
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
				System.out.println("�B�z�Ȥ�ݽШD!");
				//�ھڿ�J�y�ѪR�ШD
				HttpRequest request = new HttpRequest(socket.getInputStream());
				//����
				System.out.println("method:"+request.getMethod());
				System.out.println("uri"+request.getUri());
				System.out.println("protocol:"+request.getProtocl());

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// �B�z�Ȥ���_�}�s���᪺�ާ@
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
