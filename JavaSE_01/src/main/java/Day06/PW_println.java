package Day06;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *  * �w�Ħr�Ŭy
 * �S�I�O�i�H����Ū�g�r�Ŧ�
 * 
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 
 * PrintWriter�O�̱`�Ϊ��w�Ħr�ſ�X�y,
 * �����@�w�s��BufferedWriter�@���w�ĥ\��,
 * ��PW�����ٴ��ѤF�۰ʦ��s�\��.
 * 
 * @author Otto
 *
 */
public class PW_println {
	public static void main(String[] args) throws IOException {
		/*
		 * PW���ѤF�����g��󪺬����c�y��k
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 * �����g�r�Ū��Ĳv.
		 * 
		 * �p�G�O�����ާ@���,�����٤���������c�y��k:
		 * PrintWriter(String path,String csn)
		 * PrintWriter(File file,String csn)
		 * �ĤG�ӰѼƬ��r�Ŷ�(charset name)
		 */
		PrintWriter pw =new PrintWriter("pw.txt","UTF-8");
		
		pw.println("�A���A�Q�b����R�@�ҩФl.");
		pw.println("�M�i�R������@�_��b����.");
		
		System.out.println("��X����!");
		pw.close();
	}
}
