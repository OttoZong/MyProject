package Day05;

import java.io.FileInputStream;


/**
 * ���y�O�`�I�y(�C�Ŭy)
 * java.io.FileInputStream
 * ����X�y
 * �Ω�q���Ū���r�`
 * 
 * @author Otto
 *
 */
public class FIS_read {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("raf.txt");
		/*
		 * �H�y���覡Ū�����.
		 */
		byte[] data = new byte[100];
		int len = fis.read(data);
		String str = new String(data,0,len,"UTF-8");
		System.out.println(str);
		fis.close();
	}
}
