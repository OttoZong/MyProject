package Day04;

import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF專門設計用來讀寫文件數據.
 * RAF是基於指針對文件數據進行讀寫的,
 * 即:總是在指針指向位置讀或寫字節.
 * 
 * @author Otto
 *
 */
public class RandomAccessFile_write {
	public static void main(String[] args) throws Exception{
		/*
		 * RAF的常用構造方法:
		 * RandomAccessFile(String path,String mode)
		 * RandomAccessFile(File file,String mode)
		 * 第一個參數指定要讀寫的文件
		 * 第二個參數為模式:
		 * "r":只讀模式
		 * "rw":只寫模式
		 */
		RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
		
		/*
		 * void write(int d)
		 * 寫出一個字節
		 * 將給定的int值所對應的2進制
		 * 的"低8位"寫出
		 * 
		 * byte
		 */
		raf.write(1);
		System.out.println("寫出完畢!");
		
		raf.close();
	}
}
