package Day13;

import java.lang.reflect.Field;
import java.util.Scanner;

public class ReflectDemo07 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		/**
		 * �Q�ΤϮgAPI�ʺA�]�m��H���ݩ�
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("���W:");
		String className = in.nextLine();
		System.out.println("�ݩ�:");
		String name = in.nextLine();
		System.out.println("��:");
		String value = in.nextLine();
		Class cls = Class.forName(className);
		Field fld = cls.getDeclaredField(name);
		Object obj = cls.newInstance();
		//�]�mobj��H��fld�ݩʭȬ�valie
		fld.set(obj, value);
		System.out.println(obj);
	}
}
