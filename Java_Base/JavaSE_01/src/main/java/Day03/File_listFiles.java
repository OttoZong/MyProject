package Day03;

import java.io.File;

public class File_listFiles {
	public static void main(String[] args) {
		/*
		 * 查看當前目錄中的所有內容
		 */
		File dir = new File(".\\a");
		
		/*
		 * boolean isFile()
		 * 判斷當前File表示的是否為文件
		 * 
		 * boolean isDirectory()
		 * 判斷當前File表示的是否為目錄
		 */
		//判斷是否為目錄
		if(dir.isDirectory()) {
			//獲取所有子項
			File[] subs = dir.listFiles();
			for(int i=0;i<subs.length;i++) {
				System.out.println(subs[i].getName());
			}
		}
	}
}
