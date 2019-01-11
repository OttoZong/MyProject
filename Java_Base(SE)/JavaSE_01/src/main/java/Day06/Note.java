package Day06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ²���O�ƥ��{��
 * 
 * �{�Ƕ}�l��,�n�D�Τ��J�@�Ӥ��W
 * �M��w��Ӥ��i��g�ާ@.
 * 
 * ����Τ��J���C�@��r�Ŧ�(scanner.nextLine)
 * �o�쪺�r�Ŧ곣����g�J��Ӥ��
 * ��Τ��J���O"exit",�h�h�X�{��.
 * @author Otto
 *
 */
public class Note {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���W:");
		String fileName = scan.nextLine();
		FileOutputStream fos = new FileOutputStream(fileName);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		/*
		 * ���Ҥ�PrintWriter�b�y�s�����ϥή�,
		 * �Y:�c�y��k�Ĥ@�ӰѼƶǤJ�@�Ӭy.����
		 * �N����t�@�ӭ����c�y��k,�i�H�ǤJ�ĤG��
		 * �Ѽ�,�ӰѼƬ�boolean��,��ӭȬ�true��
		 * ��ePW�㦳�۰ʦ��s�\��.
		 * 
		 * �۰ʦ��s�����O�C��ڭ̨ϥ�println��k
		 * �g�X�@��r�Ŧ��|�۰�flush
		 */
		PrintWriter pw = new PrintWriter(osw,true);	//�۰ʦ��s
		System.out.println("�ж}�l��J���e,���Jexit��,�h�h�X�{��");
		String line = null;
		while(true){
			line = scan.nextLine();
			if("exit".equals(line)) {
				break;
			}
			pw.println(line);
//			pw.flush();
		}
		System.out.println("�A��");
		pw.close();	
	}

}
