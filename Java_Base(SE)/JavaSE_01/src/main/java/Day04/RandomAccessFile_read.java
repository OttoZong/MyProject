package Day04;

import java.io.RandomAccessFile;

public class RandomAccessFile_read {
	public static void main(String[] args) throws Exception{
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		/*
		 * int read()
		 * 讀取一個字節,並以10進制的int值返回.
		 * 若返回值為-1則表示讀取到了末尾
		 */
		int d = raf.read();
		System.out.println(d);
		
		raf.close();
	}
}
