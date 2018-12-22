package Day03;
/**
 * 1:編寫一段程序，完成1+2+3+4...100,
 * 並輸出結果.
 * 整段代碼中不得出現for,while關鍵字
 * 
 * 2.買汽水,1塊錢1瓶,2個空瓶可以換一瓶汽水,
 * 	3個瓶蓋可以換一瓶汽水,編寫程序計算20塊錢
 * 	總共買到多少瓶汽水.
 */
import java.io.File;

public class File_deleteDemo {
	public static void main(String[] args) {
		File dir = new File("a");
		delete(dir);
	}
	/*
	 * 將給定的File表示的文件或目錄刪除
	 * @param file
	 */
	public static void delete(File file) {
		if(file.isDirectory()) {
			//將該目錄子項全部清除
			File[] subs = file.listFiles();
			for(int i=0;i<subs.length;i++) {
				//遞歸調用
				delete(subs[i]);
			}
		}
		file.delete();
	}

}
