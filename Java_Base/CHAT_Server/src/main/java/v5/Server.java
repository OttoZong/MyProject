package v5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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
	/*
	 * �s��Ҧ��Ȥ�ݿ�X�y,�Ω�s������.
	 */
	private Collection<PrintWriter> allOut;
	
	public Server() {
		try {
			/*
			  * ��Ҥ�ServerSocket���P�ɥӽЪA�Ⱥݤf.
			  * �Y�Ӻݤf�w�g�Q��L�{�ǥe��,�h�|�ߥX���`.
			 * address already in use
			 */
			System.out.println("�бҰʪA�Ⱥ�...");
			server = new ServerSocket(8088);
			allOut = new ArrayList<PrintWriter>();
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
		//������e�Ȥ�ݪ��a�}�T��.
		private String host;
		
		public ClientHandler(Socket socket) {
			this.socket = socket;
			InetAddress address = socket.getInetAddress();
			host = address.getHostAddress();
		}
		
		public void run() {
			PrintWriter pw = null;
			try {
				System.out.println("�@�ӽu�{�ҰʤF!");
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
				pw = new PrintWriter(osw,true);
				
				//�N�ӫȤ�ݪ���X�y�s�JallOut
//				allOut = Arrays.copyOf(allOut, allOut.length);
//				allOut[allOut.length-1] = pw;
				allOut.add(pw);
				
				String line = null;
				while((line = br.readLine())!=null) {
					System.out.println("�Ȥ�ݻ�:"+line);
					//�^�_�Ҧ��Ȥ��
					for(PrintWriter o:allOut) {
						o.println(host+"��"+line);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				/*
				 * �B�z�Ȥ���_�}�s���᪺�ާ@.
				 */
				System.out.println("�@�ӫȤ���_�u�F");
				
				//�N�ӫȤ�ݪ���X�y�q�@�ɶ��X���R��
				allOut.remove(pw);
//				for(int i=0;i<allOut.length;i++) {
//					if(allOut[i]==pw) {
//						//�P�Ʋժ��̫�@�Ӥ����洫
//						allOut[i] = allOut[allOut.length-1];
//						//�Y�e
//						allOut = Arrays.copyOf(allOut, allOut.length-1);
//						break;
//					}
//				}
				try {
					/*
					 * socket������,��X�y�P��J�y�]�N�����F.
					 */
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
