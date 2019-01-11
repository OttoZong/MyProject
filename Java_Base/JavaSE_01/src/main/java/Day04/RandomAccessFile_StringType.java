package Day04;

import java.io.RandomAccessFile;

public class RandomAccessFile_StringType {
	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		String str = "�A�b�n�誺�v����,�j���ɭ�.";
		/*
		 * 
		 */
		byte[] data = str.getBytes("utf-8");

		raf.write(data);
		System.out.println("�g�X����!");
		raf.seek(0);
		//Ū���h�֦r�`
		byte[] arr = new byte[100];
		int len = raf.read(arr);
		System.out.println("���Ū���F"+len+"�Ӧr�`");
		
		String s = new String(arr,0,len,"UTF-8");
		System.out.println(s);
		raf.close();
	}
}
