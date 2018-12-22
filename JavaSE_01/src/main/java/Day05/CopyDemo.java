package Day05;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用文件流複製文件
 * 
 * @author Otto
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws Exception {
		/**低級流輸入與輸出文件**
		 *  
		 * 創建文件輸入流用於讀取原文件
		 * 創建文件輸出流用於寫入待複製文件
		 * 
		 * 順序從原文件中讀取字節寫入到複製
		 * 的文件中完成複製工作
		 */
		FileInputStream fis = new FileInputStream("music.mp3");
		FileOutputStream fos = new FileOutputStream("music_cp.mp3");
		
		byte[] data = new byte[1024*10];
		int len = -1;
		
		while((len = fis.read(data))!=-1) {
			fos.write(data,0,len);
		}
		System.out.println("複製完畢!");
		fis.close();
	}
}
