package Day03;

import java.io.File;

/*
 * 使用file建立一個目錄
 */
public class File_mkdir {
	public static void main(String[] args) {
		/*
		 * 在當前目錄下建立一個目錄:demo
		 */
		File dir = new File("demo");
		if(!dir.exists()) {
			dir.mkdir();
			System.out.println("目錄已建立!");
		}else {
			System.out.println("該目錄已存在!");
		}
	}

}
