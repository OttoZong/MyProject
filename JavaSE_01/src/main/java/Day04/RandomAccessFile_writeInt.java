package Day04;

import java.io.RandomAccessFile;

/**
 * RAF讀寫基本類型數據以及針對指針的操作
 * 
 * @author Otto
 *
 */
public class RandomAccessFile_writeInt {
	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = new RandomAccessFile("type.dat", "rw");
		raf.seek(0);
		System.out.println("pos:" + raf.getFilePointer());
		//連續讀取4個字節並還原為int值返回
		int d = raf.readInt();
		System.out.println(d);
		
		System.out.println("pos:" + raf.getFilePointer());
		/*
		 * 將給定的int值寫入文件 連續寫出4個字節
		 */
		
		//讀long值,一次讀八個字節
		raf.seek(8);
		long l = raf.readLong();
		System.out.println(l);
		
		double dou = raf.readDouble();
		System.out.println(dou);
		System.out.println("pos:" + raf.getFilePointer());
		/*
		 * 當調用readInt方法在實際讀取時
		 * 發現達到文件末尾時,會拋出:
		 * EOFExceoption EOF end of file
		 */
		d = raf.readInt();
		
		raf.close();
	}
}
