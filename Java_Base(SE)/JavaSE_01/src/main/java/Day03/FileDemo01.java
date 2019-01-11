package Day03;

import java.io.File;

/**
 * java.io.File input output File用於表示操作系統中
 * 文件系統裡的一個文件或目錄 
 * 使用File可以:
 * 查看該文件或目錄的屬性訊息(名子,大小等) 
 * 操作文件或目錄(創建,刪除等) 
 * 但是不能使用File訪問文件的數據
 * 
 * 寫路徑的時候，建議使用相對路徑，
 * 因為不同的操作系統絕對位置不一致，
 * 會導致跨平台出現問題，
 * File支持一個常量Separator,
 * 它表示一個當前系統支持的目錄層級分隔符
 * 
 * @author Otto
 *
 */
public class FileDemo01 {
	public static void main(String[] args) {
		File file = new File("." + File.separator + "demo.txt");
		/*
		 * 返回當前File表示的文件或目錄的名子
		 */
		String name =  file.getName();
		System.out.println(name);
		/*
		 * 返回當前文件的大小(字節量)
		 */
		long length = file.length();
		System.out.println(length);
		
		boolean canRead = file.canRead();
		boolean canWrite = file.canWrite();
		
		/*
		 * 查詢文檔是否可讀、可寫
		 */
		System.out.println("是否可讀:"+canRead);
		System.out.println("是否可寫:"+canWrite);
		
		/*
		 * 查詢文檔是否隱藏
		 */
		boolean isHidden = file.isHidden();
		System.out.println("是否隱藏:"+isHidden);
		/*
		 * 查詢目錄
		 */
		String path = file.getAbsolutePath();
		System.out.println(path);
	
	}
}
