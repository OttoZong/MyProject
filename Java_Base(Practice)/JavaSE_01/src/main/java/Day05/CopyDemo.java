package Day05;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * �ϥΤ��y�ƻs���
 * 
 * @author Otto
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws Exception {
		/**�C�Ŭy��J�P��X���**
		 *  
		 * �Ыؤ���J�y�Ω�Ū������
		 * �Ыؤ���X�y�Ω�g�J�ݽƻs���
		 * 
		 * ���Ǳq����Ū���r�`�g�J��ƻs
		 * ����󤤧����ƻs�u�@
		 */
		FileInputStream fis = new FileInputStream("music.mp3");
		FileOutputStream fos = new FileOutputStream("music_cp.mp3");
		
		byte[] data = new byte[1024*10];
		int len = -1;
		
		while((len = fis.read(data))!=-1) {
			fos.write(data,0,len);
		}
		System.out.println("�ƻs����!");
		fis.close();
	}
}
