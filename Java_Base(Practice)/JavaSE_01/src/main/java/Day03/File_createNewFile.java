package Day03;

import java.io.File;
import java.io.IOException;

/*
 * 使用file建立一個新文件
 */
public class File_createNewFile {
	public static void main(String[] args) throws IOException {
		File file = new File("."+File.separator+"Test.txt");
		/*
		 * boolean exists()
		 * 判斷當前file表示文件或目錄是否真實存在
		 */
		if(!file.exists()) {
//			將它創立出來
			file.createNewFile();
			System.out.println("文件創建完畢!");
		}else {
			System.out.println("該文件已經存在!");
		}
	}
}
