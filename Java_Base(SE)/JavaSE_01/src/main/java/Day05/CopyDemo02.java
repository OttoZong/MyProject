package Day05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 緩衝流
 * 緩衝流是一對高級流,作用是加快讀寫效率.
 * @author Otto
 *
 */
public class CopyDemo02 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("music.mp3");
		//接在文件流上用於提高讀取文件的速度
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("music_cp.mp3");
		//接在文件輸出流上用於提高寫出效率
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
		
		System.out.println("複製完畢!");
		bis.close();
		bos.close();
	}
}
