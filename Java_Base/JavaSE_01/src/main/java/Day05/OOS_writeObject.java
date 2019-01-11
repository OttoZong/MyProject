package Day05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 * 對象流
 * 對象流是一對高級流,可以讀寫java中任何對象
 * 
 * java.io.ObjectOutputStream
 * 對象輸出流,可以將給定的對象轉換為一組字節後寫出
 * 
 * java.io.ObjectInputStream
 * 對象輸入流,可以讀取一組字節並抓換位對應的對象,
 * 前提是該組字節必須對象輸出流寫出的一個對象所轉換的字節.
 * 
 * oos 負責對象序列化,fos 負責數據持久化.
 * oos 將給定對象轉化為一組字節,fos 將字節寫入到文件中.
 *
 * @author Otto
 *
 */
public class OOS_writeObject {
	public static void main(String[] args) throws IOException {
		Object_Person person = new Object_Person();
		person.setName("蒼老師");
		person.setAge(18);
		person.setGender("女");
		person.setOtherInfo(new String[] {
				"是一名演員","愛好寫大字","促進中日文化交流","廣大男性同胞啟蒙老師"
		});

		
		System.out.println(person);
		
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * 對象輸出流提供寫出對象方法:
		 * writeObject(Object obj)
		 * 該方法會將給定對象按照其結構轉換為
		 * 一組字串後,再通過其處理的流將之寫出.
		 * 
		 * 需要注意,給定的對象所屬類必須實現
		 * 可序列化接口,否則會拋出異常.
		 * 
		 * 這裡將對象寫入文件經歷兩個步驟:
		 * 1:通過對象輸出流將person先轉換
		 * 	 為一組字節,這個過程稱為:
		 * 	 對象序列化.
		 * 2:將序列化後的字節再通過fos寫入
		 * 	  到文件中(in disk)做長久保存的
		 * 	 過程稱為:數據持久化.
		 * 
		 */
		oos.writeObject(person);
		
		System.out.println("寫出完畢!");
		oos.close();
	}

}
