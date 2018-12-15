package v0;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ��ѫǪA�Ⱥ�
 * @author Otto
 *
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
//			System.out.println("�c�y��k�Gserver:"+server);
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
	//			System.out.println("server:"+server);
				Socket socket = server.accept();
	//			System.out.println("socket:"+socket);
				System.out.println("�@�ӫȤ�ݳs���F!");
			}
//			InputStream in = socket.getInputStream();
//			InputStreamReader isr = new InputStreamReader(in,"UTF-8");
//			BufferedReader br = new BufferedReader(isr);
//			
//			while(true) {
//				String line = br.readLine();
//				System.out.println("�Ȥ�ݻ�:"+line);
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
	 * �p��d��IP,Window�BLinux
	  * �ɥR�G
	 * Window, CMD���� , ipconfig
	 * Linux, ����x, sbin/ifconfig
	 */
}
