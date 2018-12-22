package Day04;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 完成用戶註冊功能
 * 程序啟動後,要求該用戶輸入註冊訊息
 * 格式如:
 * 劉滄松,55,男,5000,2008-08-04
 * 然後將該用戶訊息寫入到emp.dat文件的最後
 * 
 * @author Otto
 *
 */
public class RandomAccessFile_Register {
	public static void main(String[] args) throws Exception {
		/*
		 * 實現思路:
		 * 
		 * 1:先通過Scanner獲取用戶輸入的一行用戶信息,如:
		 * 	劉滄松,55,男,5000,2008-08-04
		 * 2:按照","拆分該字符串,得到名子等相關的每一項信息
		 * 3:創建RandomAccessFile對emp.dat文件操作
		 * 4:移動指針到文件的末尾(raf.lengtj())
		 * 5:先將名字轉換為字節,然後擴容到32個字節並寫入文件
		 * 	然後將寫入int值,該值是年齡
		 * 	順序將後續幾項寫入.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入註冊信息:");
		String line = scan.nextLine();
//		System.out.println(line);
		
		//將輸入資料按照","拆解
		String[] data = line.split(",");
		System.out.println("len:"+data.length);
		System.out.println(Arrays.toString(data));
		
		RandomAccessFile raf = new RandomAccessFile("emp.dat","rw");
		
		raf.seek(raf.length());
		//寫用戶名
		writeString(raf,data[0],32);
//		byte[] nameArr = data[0].getBytes("UTF-8");
//		nameArr = Arrays.copyOf(nameArr, 32);
//		raf.write(nameArr);
	//	raf.write(data[0].getBytes("UTF-8"));
		
		//寫年齡
		raf.writeInt(Integer.parseInt(data[1]));
		
		//寫性別
		writeString(raf, data[2], 10);
//		byte[] genderArr = data[2].getBytes("UTF-8");
//		genderArr = Arrays.copyOf(genderArr, 10);
//		raf.write(genderArr);
		
		//寫工資
		raf.write(Integer.parseInt(data[3]));
		
		//寫入入職時間
		writeString(raf, data[4], 30);
		
		System.out.println("註冊完畢!");
		raf.close();
	}
	public static void writeString(RandomAccessFile raf,String str,int len) throws IOException {
		byte[] genderArr = str.getBytes("UTF-8");
		genderArr = Arrays.copyOf(genderArr, len);
		raf.write(genderArr);
	}
}
