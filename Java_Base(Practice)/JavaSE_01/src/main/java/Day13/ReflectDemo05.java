package Day13;

import java.lang.reflect.Field;
import java.util.Scanner;

public class ReflectDemo05 {
	public static void main(String[] args) throws Exception{
		/**
		 * �Q�ΤϮg����ݩʪ���.
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("���W:");
		String className = in.nextLine();
		System.out.println("�ݩʦW:");
		String name = in.nextLine();
		
		Class cls = Class.forName(className);
		//�ʺA�Ыع�H.
		Object obj = cls.newInstance();
		//�b���W�d����w�����H��.
		Field fld = cls.getDeclaredField(name);
		//�����Hobj�W��fld�ݩʫH��.
		Object value = fld.get(obj);
		//��X�ݩʪ���.
		System.out.println(value);
		
	}
}
