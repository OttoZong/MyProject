package Day06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * �b�y���s�����ϥ�PrintWriter
 * @author Otto
 *
 */
public class PW_println2 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("pw2.txt");
		//�Y�Ʊ���w�r�Ŷ�,�ݭn�ۦ�s���ഫ�y
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		
		PrintWriter pw = new PrintWriter(osw);
		
		pw.print("��");
		System.out.println("�g�X����!");
		pw.close();
	}
}
