package Day05;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * 緩衝寫出數據的緩衝區問題
 * @author Otto
 *
 */
public class BOS_flush {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String str = "夜空中最亮的星,是否聽清,";
		byte[] data = str.getBytes("UTF-8");
		
		bos.write(data);
		/*
		 * void flush()
		 * 緩衝流的flush方法可以強制字符串輸出.
		 */
//		bos.flush();	//強制輸出
		
		System.out.println("寫出完畢!");
		bos.close();	//關閉時,緩衝流會flush.
	}
}
