package Day04;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * 使用RandomAccessFile可以根據指針位置
 * 寫操作來覆蓋原有數據
 * @author Otto
 *
 */

public class RandomAccessFile_editFile {
	public static void main(String[] args) throws IOException {
		/*
		 * 將emp.dat文件中張小花的性別改為女
		 */
		RandomAccessFile raf = new RandomAccessFile("emp.dat","rw");
		//將指針移動到張小花性別的位置
//		raf.seek(36);
//		//寫字符串"女"
//		byte[] data ="女".getBytes("UTF-8");
//		raf.write(data);
//		System.out.println("修改完畢!");
//		raf.close();
		
		//移動到第二個人名字的第一個字節
		raf.seek(80);
		byte[] data = "aaa".getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
//		raf.write("a".getBytes("UTF-8"));
		raf.write(data);
		System.out.println("修改完畢!");
	}
}
