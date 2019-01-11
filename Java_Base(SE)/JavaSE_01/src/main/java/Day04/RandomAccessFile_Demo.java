package Day04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 讀取項目目錄下的emp.dat文件 將10個員工的信息讀取出來並輸出到控制台 格式如下: 張小花,22,女,3500,2008-08-06
 * 
 * 該文件共800字節,每個員工占用80字節. 員工有5個信息,字符串類型編碼為:UTF-8.
 * 分別是:name,age,gemder,salary,hiredate 占用的長度與類型參看emp.jpg圖片
 * 
 * @author Otto
 *
 */
public class RandomAccessFile_Demo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("emp.dat", "r");

		for (int i = 0; i < raf.length() / 80; i++) {
			// 讀取用戶名 代碼重用
			String name = readString(raf, 32);
			System.out.println(name);

//		byte[] data = new byte[32];
//		raf.read(data);
//		String name = new String(data,"UTF-8").trim();
//		System.out.println(name);

			// 讀取年紀 代碼重用
			int age = raf.readInt();
			System.out.println(age);
//		int age = raf.readInt();
//		System.out.println(age);

			// 讀取性別 代碼重用
			String gender = readString(raf, 10);
			System.out.println(gender);
//		byte[] data1 = new byte[10];
//		raf.read(data1);
//		String gender = new String(data1,"UTF-8").trim();
//		System.out.println(gender);

			// 讀取工資 代碼重用
			int salary = raf.readInt();
			System.out.println(salary);

			// 讀取入職時間
			String hiredate = readString(raf, 30);
			System.out.println(name + "," + age + "," + gender + "," + salary + "," + hiredate);
		}
	}

	public static String readString(RandomAccessFile raf, int len) throws IOException {
		byte[] data = new byte[len];
		raf.read(data);
		String str = new String(data, "UTF-8").trim();
		return str;
	}
}
