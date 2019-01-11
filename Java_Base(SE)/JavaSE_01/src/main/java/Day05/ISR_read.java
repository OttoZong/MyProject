package Day05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author Otto
 *
 */
public class ISR_read {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		
		int d = -1;
		while((d = isr.read())!=-1) {
			System.out.println((char)d);
		}
		isr.close();
	}
}
