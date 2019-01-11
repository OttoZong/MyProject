package tw2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/**
 * 處理exception的方法
 * 1-1抓:抓到你拋出來
 * 1-2拋
 * @author Otto
 *
 */
public class TextException {
	@Test //運行時異常
	public void test1() {
		try {
			String str = new String("AA");
			str = null;
			str.length();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	@Test //編譯時異常
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
