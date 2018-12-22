package Day04;

import java.io.RandomAccessFile;

public class RandomAccessFile_StringType {
	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		String str = "你在南方的豔陽裡,大雪紛飛.";
		/*
		 * 
		 */
		byte[] data = str.getBytes("utf-8");

		raf.write(data);
		System.out.println("寫出完畢!");
		raf.seek(0);
		//讀取多少字節
		byte[] arr = new byte[100];
		int len = raf.read(arr);
		System.out.println("實際讀取了"+len+"個字節");
		
		String s = new String(arr,0,len,"UTF-8");
		System.out.println(s);
		raf.close();
	}
}
