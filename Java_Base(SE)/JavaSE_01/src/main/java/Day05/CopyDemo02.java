package Day05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * �w�Ĭy
 * �w�Ĭy�O�@�ﰪ�Ŭy,�@�άO�[��Ū�g�Ĳv.
 * @author Otto
 *
 */
public class CopyDemo02 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("music.mp3");
		//���b���y�W�Ω󴣰�Ū����󪺳t��
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("music_cp.mp3");
		//���b����X�y�W�Ω󴣰��g�X�Ĳv
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		
		
		
//		byte[] data = new byte[1024*10];
//		int len = -1;
//		
//		while((len = fis.read(data))!=-1) {
//			fos.write(data,0,len);
//		}
		
		int d = -1;
		
		while((d = bis.read()) != -1) {
			bos.write(d);
		}
		
		System.out.println("�ƻs����!");
		bis.close();
		bos.close();
	}
}
