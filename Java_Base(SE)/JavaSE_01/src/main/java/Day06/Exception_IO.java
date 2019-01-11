package Day06;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO���ϥβ��`�������
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
			System.out.println("�X���F!");
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
