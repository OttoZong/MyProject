package Day04;

import java.io.RandomAccessFile;

public class RandomAccessFile_read {
	public static void main(String[] args) throws Exception{
		RandomAccessFile raf = new RandomAccessFile("raf.dat","r");
		/*
		 * int read()
		 * Ū���@�Ӧr�`,�åH10�i�int�Ȫ�^.
		 * �Y��^�Ȭ�-1�h���Ū����F����
		 */
		int d = raf.read();
		System.out.println(d);
		
		raf.close();
	}
}
