package Day13;

import java.lang.reflect.Field;
import java.util.Scanner;

public class ReflectDemo07 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		/**
		 * 利用反射API動態設置對象的屬性
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("類名:");
		String className = in.nextLine();
		System.out.println("屬性:");
		String name = in.nextLine();
		System.out.println("值:");
		String value = in.nextLine();
		Class cls = Class.forName(className);
		Field fld = cls.getDeclaredField(name);
		Object obj = cls.newInstance();
		//設置obj對象的fld屬性值為valie
		fld.set(obj, value);
		System.out.println(obj);
	}
}
