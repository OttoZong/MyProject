package com.tedu.core;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

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
				// �����J�y
				InputStream in = socket.getInputStream();
				
				
				StringBuilder builder = new StringBuilder();
				int d = -1;
				char c1=0,c2=0;//c1��ܤW��Ū�쪺�r�`,c2��ܥ���Ū�쪺�r�`
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
