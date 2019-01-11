package Day06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在流的連接中使用PrintWriter
 * @author Otto
 *
 */
public class PW_println2 {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("pw2.txt");
		//若希望指定字符集,需要自行連接轉換流
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		
		PrintWriter pw = new PrintWriter(osw);
		
		pw.print("我");
		System.out.println("寫出完畢!");
		pw.close();
	}
}
