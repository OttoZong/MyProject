package v3;

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
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
			PrintWriter pw = new PrintWriter(osw,true);		//true = �۰ʦ��s.
			
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("�ж}�l��J���e: ");
			Scanner scan = new Scanner(System.in);
			String message = null;
			while(true) {
				String line = scan.nextLine();
				pw.println(line);
				System.out.println("�g�X����!");
				message = br.readLine();
				System.out.println("�A�Ⱥݻ�:"+message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
		 
	}
}
