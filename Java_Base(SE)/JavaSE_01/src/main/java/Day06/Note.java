package Day06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 簡易記事本程序
 * 
 * 程序開始後,要求用戶輸入一個文件名
 * 然後針對該文件進行寫操作.
 * 
 * 之後用戶輸入的每一行字符串(scanner.nextLine)
 * 得到的字符串都按行寫入到該文件中
 * 當用戶輸入的是"exit",則退出程序.
 * @author Otto
 *
 */
public class Note {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文件名:");
		String fileName = scan.nextLine();
		FileOutputStream fos = new FileOutputStream(fileName);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		/*
		 * 當實例化PrintWriter在流連接中使用時,
		 * 即:構造方法第一個參數傳入一個流.那麼
		 * 就支持另一個重載構造方法,可以傳入第二個
		 * 參數,該參數為boolean值,當該值為true時
		 * 當前PW具有自動行刷新功能.
		 * 
		 * 自動行刷新指的是每當我們使用println方法
		 * 寫出一行字符串後會自動flush
		 */
		PrintWriter pw = new PrintWriter(osw,true);	//自動行刷新
		System.out.println("請開始輸入內容,當輸入exit時,則退出程序");
		String line = null;
		while(true){
			line = scan.nextLine();
			if("exit".equals(line)) {
				break;
			}
			pw.println(line);
//			pw.flush();
		}
		System.out.println("再見");
		pw.close();	
	}

}
