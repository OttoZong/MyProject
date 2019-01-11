package Day03;

import java.io.File;

public class File_mkdirs {
	public static void main(String[] args) {
		/*
		 * 在當前目錄下創建目錄:
		 * a/b/c/d/e/f
		 */
		File dir = new File(
				"a"+File.separator+
				"b"+File.separator+
				"c"+File.separator+
				"d"+File.separator+
				"e"+File.separator+"f"		
		);
		if(!dir.exists()) {
			/*
			 * mkdirs在創立當前File表示的目錄時
			 * 會將所有不存在的父目錄一同創建出來.
			 * 而mkdir不具有這樣子的功能.
			 */
			dir.mkdirs();
			System.out.println("目錄已創立!");
		}else {
			System.out.println("目錄已存在!");
		}
	}
}
