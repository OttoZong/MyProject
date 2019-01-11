package Day03;

import java.io.File;

public class File_delete2 {
	public static void main(String[] args) {
		/*
		 * 刪除當前目錄下名為demo的目錄
		 */
		File dir = new File("a");
		if(dir.exists()) {
			/*
			 * delete方法刪除目錄要求該目錄
			 * 必須是一個空目錄
			 */
			dir.delete();
			System.out.println("該目錄已刪除");
		}else {
			System.out.println("該目錄不存在!");
		}
	}

}
