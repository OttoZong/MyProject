package Day06;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *  * 緩衝字符流
 * 特點是可以按行讀寫字符串
 * 
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 
 * PrintWriter是最常用的緩衝字符輸出流,
 * 內部一定連接BufferedWriter作為緩衝功能,
 * 而PW本身還提供了自動行刷新功能.
 * 
 * @author Otto
 *
 */
public class PW_println {
	public static void main(String[] args) throws IOException {
		/*
		 * PW提供了直接寫文件的相關構造方法
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 * 提高寫字符的效率.
		 * 
		 * 如果是直接操作文件,那麼還支持重載的構造方法:
		 * PrintWriter(String path,String csn)
		 * PrintWriter(File file,String csn)
		 * 第二個參數為字符集(charset name)
		 */
		PrintWriter pw =new PrintWriter("pw.txt","UTF-8");
		
		pw.println("你說你想在海邊買一所房子.");
		pw.println("和可愛的海獅一起住在那裏.");
		
		System.out.println("輸出完畢!");
		pw.close();
	}
}
