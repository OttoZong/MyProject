package Day06;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO中使用異常捕獲機制
 * @author Otto
 *
 */
public class Exception_IO {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		try {
//			FileOutputStream fos = new FileOutputStream("fos.dat");
			fos = new FileOutputStream("fos.dat");
			fos.write(1);
		} catch (Exception e) {
			System.out.println("出錯了!");
		} finally {
			try {
				if(fos!=null) {
					fos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
