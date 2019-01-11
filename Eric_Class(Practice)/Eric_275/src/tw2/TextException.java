package tw2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/**
 * �B�zexception����k
 * 1-1��:���A�ߥX��
 * 1-2��
 * @author Otto
 *
 */
public class TextException {
	@Test //�B��ɲ��`
	public void test1() {
		try {
			String str = new String("AA");
			str = null;
			str.length();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	@Test //�sĶ�ɲ��`
	public void test2() {
		FileInputStream fi = null;
		int b;
		try {
			while((b=fi.read())!=-1) {
				System.out.println();
			}
			fi.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
