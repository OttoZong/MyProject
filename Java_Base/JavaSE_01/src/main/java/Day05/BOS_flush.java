package Day05;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * �w�ļg�X�ƾڪ��w�İϰ��D
 * @author Otto
 *
 */
public class BOS_flush {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = "�]�Ť��̫G���P,�O�_ť�M,";
		byte[] data = str.getBytes("UTF-8");
		
		bos.write(data);
		/*
		 * void flush()
		 * �w�Ĭy��flush��k�i�H�j��r�Ŧ��X.
		 */
//		bos.flush();	//�j���X
		
		System.out.println("�g�X����!");
		bos.close();	//������,�w�Ĭy�|flush.
	}
}
