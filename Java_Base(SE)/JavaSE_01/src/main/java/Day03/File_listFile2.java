package Day03;

import java.io.File;
import java.io.FileFilter;
/**
 * 過濾器
 * @author Otto
 *
 */

public class File_listFile2 {
	public static void main(String[] args) {
		/*
		 * 獲取當前目錄中所有名子以"."開頭的子項
		 */
		File dir = new File(".");
		FileFilter filter = new FileFilter() {
			/**
			 * 添加過濾條件,只要認為參數給定的file
			 * 滿足要求,則返回true即可
			 */
			public boolean accept(File file) {
				String name = file.getName();
				System.out.println("正在過濾:"+name);
				return name.startsWith(".");
			}
		};
		File[] subs = dir.listFiles(filter);
		for(int i=0;i<subs.length;i++) {
			System.out.println(subs[i].getName());
		}
	}

}
