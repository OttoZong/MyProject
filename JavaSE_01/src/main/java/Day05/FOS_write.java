package Day05;

import java.io.FileOutputStream;
import java.io.RandomAccessFile;

/**
 * java標準IO input output
 * Java將流分為兩類:
 * 輸入流:輸入流用來讀取數據
 * 輸出流:用來將數據寫出
 * 
 * java將流分為兩類:
 * 節點流:節點流又稱為低級流,是建立在程序
 * 		   與數據源之間的"管道",負責實際搬運數據的流
 * 		   讀寫一定是建立在節點流基礎上的.
 * 處理流:處理流又稱為高級流,特點是不能獨立存在(沒有意義),
 * 		   必須處理其他流,處理的目的是通過它可以簡化我們讀寫
 * 		   操作.
 * 
 * java.io.InputStream
 * java.io.OutputStream
 * 以上兩個流是所有字節流的父類,定義了輸入與輸出流必須具備
 * 相關讀寫方法,但他們本身是抽象類,所以不能直接使用
 * 
 * 文件流
 * 文件流是用來讀寫文件的流.
 * java.io.FileInputStream
 * 文件輸入流,用來讀取文件數據的流
 * 
 * java.io.FileOutputStream
 * 文件輸出流,用來向文件中寫出數據的流
 * 
 * @author Otto
 *
 */
public class FOS_write {
	public static void main(String[] args) throws Exception {
		/*
		 * FileOutputStream與RandomAccessFile
		 * 兩者有很大本質上的區別.功能一樣,使用時機不同.
		 * 
		 * RandomAccessFile,Random可以複寫.
		 * FileOutputStream,流是一次性,不可編輯文件.
		 * 
		 * 
		 * FileOutputStream的常用構造方法:
		 * 
		 * FileOutputStream(String path)
		 * FileOutputStream(File file)
		 * 打開一個對給定文件進行寫操作的文件輸出流
		 * 這種創建方法為:覆蓋寫操作.
		 * 即:若給定的文件存在,則會先將該文件所有內容
		 * 清除.然後將通過當前流寫出的數據寫入該文件.
		 * 
		 * FileOutputStream(String path,boolean append)
		 * FileOutputStream(File file,boolean append)
		 * 當調用上述兩個構造方法時,若第二個參數傳入的為true,
		 * 則當前文件輸出流為追加寫模式.
		 * 即:文件原有數據都保留,通過該流寫出的數據會被追加到文件末尾.
		 * 
		 * 流只能追加,不具有編輯文件的能力.
		 * 
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt",true);
//		RandomAccessFile fos = new RandomAccessFile("fos.txt","rw");
		
		
		String str = "她不在和誰談論相逢的孤島.";
		fos.write(str.getBytes("UTF-8"));
		System.out.println("寫出完畢!");
		fos.close();
		
	}
}
