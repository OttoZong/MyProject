package Day03;

import java.io.File;

public class File_delete {
	public static void main(String[] args) {
		/*
		 * 當前目錄中的test.txt文件刪除
		 * 
		 * ./是可以不寫,不寫就默認就在當前目錄
		 */
		File file = new File("Test.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("刪除完畢!");
		}else {
			System.out.println("此文件不存在!");
		}
		
	}
}
