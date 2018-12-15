package v4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * ��ѫȤ��
 * @author Otto
 */

public class Client {
	/*
	 * java.net.Socket
	 * �ʸˤFTCP�q�T��w,����½Ķ�O:�M�Y�r,
	 * �ϥ�Socket���j�P�B�J:
	 * 1.��Ҥ�Socket,�P�ɫ��w�s�����A�Ⱥݪ�IP
	 * �M�ݤf�ûP�A�Ⱥݫإ߳s��.
	 * 2.�q�LSocket�гy��Ӭy,�@�ӿ�J�y�@�ӿ�X�y
	 * �q�L��J�yŪ�����ݭp����o�e�L�Ӫ��ƾ�,
	 * �q�L��X�y�N�ƾڵo�e�����p���
	 */
	private Socket socket;
	/**
	 * �Ω��l�ƫȤ��
	 */
	public Client() {
		try {
			/*
			 * ��Ҥ�Socket�ɻݭn�ǤJ��ӰѼ�
			 * 1.IP��},�q�LIP�i�H�������W�����w�p���.
			 * 2.�ݤf,�Ψӳs���ӭp����W���������ε{��.
			 * 
			 * ��Ҥ�Socket�N�O�P�A�Ⱥݳs�����L�{
			 */
			System.out.println("���b�s���A�Ⱥ�....");
			socket = new Socket("localhost",8088);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�P�A�Ⱥݫإ߳s��!");
		}
	}
	
	/*
	 * �{�Ǫ��Ұʤ�k
	 */
	public void start() {
		try {
			//�Ұ�Ū���A�Ⱥݮ������u�{
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.start();
			
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
			PrintWriter pw = new PrintWriter(osw,true);		//true = �۰ʦ��s.
			
			
			System.out.println("�ж}�l��J���e: ");
			Scanner scan = new Scanner(System.in);
			String message = null;
			
			long lastSend = System.currentTimeMillis()-1000;
			while(true) {
				String line = scan.nextLine();
				//���ܥ������j�@����
				if(System.currentTimeMillis()-lastSend>=1000) {
					pw.println(line);
					System.out.println("�g�X����!");
				}else {
					System.out.println("�z���ܳt�פӧ�!");
				}
				lastSend = System.currentTimeMillis();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
		 
	}
	/*
	 * �ӽu�{�Ω�Ū���A�Ⱥݵo�e�L�Ӫ�����,�ÿ�X����x
	 */
	private class ServerHandler implements Runnable{
		public void run() {
			try {
				BufferedReader br = new BufferedReader(
						new InputStreamReader(socket.getInputStream(),"UTF-8")
				);
				String line = null;
				while((line=br.readLine())!=null) {
					System.out.println(line);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
