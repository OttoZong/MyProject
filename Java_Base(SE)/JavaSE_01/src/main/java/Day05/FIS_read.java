package Day05;

import java.io.FileInputStream;


/**
 * 文件流是節點流(低級流)
 * java.io.FileInputStream
 * 文件輸出流
 * 用於從文件中讀取字節
 * 
 * @author Otto
 *
 */
public class FIS_read {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("raf.txt");
		/*
		 * 以流的方式讀取文件.
		 */
		byte[] data = new byte[100];
		int len = fis.read(data);
		String str = new String(data,0,len,"UTF-8");
		System.out.println(str);
		fis.close();
	}
}
