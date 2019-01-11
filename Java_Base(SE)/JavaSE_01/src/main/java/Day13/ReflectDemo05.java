package Day13;

import java.lang.reflect.Field;
import java.util.Scanner;

public class ReflectDemo05 {
	public static void main(String[] args) throws Exception{
		/**
		 * 利用反射獲取屬性的值.
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("類名:");
		String className = in.nextLine();
		System.out.println("屬性名:");
		String name = in.nextLine();
		
		Class cls = Class.forName(className);
		//動態創建對象.
		Object obj = cls.newInstance();
		//在類上查找指定的類信息.
		Field fld = cls.getDeclaredField(name);
		//獲取對象obj上的fld屬性信息.
		Object value = fld.get(obj);
		//輸出屬性的值.
		System.out.println(value);
		
	}
}
