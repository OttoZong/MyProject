package v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ��ѫǪA�Ⱥ�
 * @author Otto
 *
 * �p��d��IP,Window�BLinux
  * �ɥR�G
 * Window, CMD���� , ipconfig
 * Linux, ����x, sbin/ifconfig
 */
public class Server {
	/*
	 * java.net.ServerSocket
	 * �B��bserver�ݪ�ServerSocket
	 * 
	 * �D�n�@�Φ����:
	 * 1.�V�t�ΥӽЪA�Ⱥݤf,�Ȥ�ݴN�O�q�L�o�Ӻݤf�P���s����.
	 * 2.��ť�ӪA�Ⱥݤf,�@���Ȥ�ݳq�L�o�Ӻݤf�ШD�s��,
	 * 	  �h�Ыؤ@��Socket�P�ӫȤ�ݶi��q�T.
	 */
	private ServerSocket server;
	
	public Server() {
		try {
			/*
			  * ��Ҥ�ServerSocket���P�ɥӽЪA�Ⱥݤf.
			  * �Y�Ӻݤf�w�g�Q��L�{�ǥe��,�h�|�ߥX���`.
			 * address already in use
			 */
			System.out.println("�бҰʪA�Ⱥ�...");
			server = new ServerSocket(8088);
			System.out.println("�A�ȺݱҰʧ���!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void start() {
		try {
			/*
			 * ServerSocket���Ѫ���k:
			 * Socket accept()
			 * 	�Ӥ�k�O�@�Ӫ����k,�եΨ�Ӥ�k��{��"�d��",
			 * 	�õ��ݫȤ�ݪ��s��,�@���@�ӫȤ�ݳs���F,
			 * 	����N�|��^�@��Socket���,�q�L�ӹ�ҧY�i�P
			 * 	�s�����Ȥ�ݶi��q�T.
			 */
			while(true) {
				System.out.println("���ݫȤ�ݳs��....");
				Socket socket = server.accept();
				System.out.println("�@�ӫȤ�ݳs���F!");
				
				//�Ыؽu�{
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
		public ClientHandler(Socket socket) {
			this.socket = socket;
		}
		
		public void run() {
			try {
				System.out.println("�@�ӽu�{�ҰʤF!");
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				
				while(true) {
					String line = br.readLine();
					System.out.println("�Ȥ�ݻ�:"+line);
				}
			} catch (Exception e) {
				
			}
		}
	}
}
