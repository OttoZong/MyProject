package Day05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * java按照流讀寫數據的單位劃分為:
 * 字節流,字符流
 * 字符流的讀寫單位是字符,但是實際底層還是以
 * 字節為單位讀寫.字符流會負責將字符與字節
 * 之間進行轉換.
 * 由於字符流以字符為單位讀寫,所以它們只適合
 * 讀寫文本數據!
 * 
 * Reader,Writer是所有字符輸入,輸出流的超類
 * 規定了字符流都應當具備的讀寫字符方法.
 * 
 * 轉換流
 * InputStreamReader,OutputStreamWriter
 * 他們之所以叫轉換流,是因為java中其他的字符流
 * 都只能接在其他字符流上,不能直接處理字節流,
 * 而轉換流是可以處理字節流的,他們本身又是字符流,
 * 可以被其他字符流處理.所以它們起到了"轉換器"
 * 的作用,從而實現了其他字符流最終可以連接到自節流
 * 上的目的.
 * 
 * @author Otto
 *
 */
public class OSW_write {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		
		osw.write("好久沒見了,什麼角色呢.");
		osw.write("細心裝扮著,白色襯衫,袖口是你送的.");
		System.out.println("寫出完畢!");
		
		osw.close();
	}
}
