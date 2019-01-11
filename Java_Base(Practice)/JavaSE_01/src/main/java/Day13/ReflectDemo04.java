package Day13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ###�X�ݤ��i����k
 * Java�����X�ݭ׹����Ω󱱨�,��k�M�ݩʪ��i���d��.�٬��ʸ˯S��.
 * 
 * �ϮgAPI�i�H���}�p�W�ʸ�,��{�X�ݤ��i������k�M�ݩ�!
 * 
 * 		method.setAccessible(true);
 * 
 * ###�ʺA�եΦ��Ѽƪ���k
 * 		
 * 		//����k
 * 			cls.getDeclaredMethod(��k�W, �Ѽ�����1, �Ѽ�����2...)
 * 		//�Ыع�H
 * 			obj=cls.newInstance();
 * 		//�ǳưѼ�
 * 			Object method.invoke(obj, �Ѽ�1, �Ѽ�2, �Ѽ�3...)
 * 
 * ### �ѽ�
 * �Ѱ����X��: ��C/�Ѱ� ��q�N�X(��ղի�)���������X���Y.
 * 
 * 		public void test(){
 * 			Foo foo = new Foo();
 * 			foo.test();
 * 		}
 * 
 * �Q�ΤϮgAPI,�i�H��{�@�ղե�P���Ӫ��@�Ӳե��P�����X,
 * �Ʀܥi�H�b�����D���W�B�����D��k�W�����p�U��{�ե�
 * 
 * ###�ʺA�X�ݹ�H���ݩ�
 * 
 * 		Field �N���������ݩʫH��
 * 
 * 			//Ū����Hobj�����w�ݩ�,��^�ݩʪ���
 * 			Object Files.get(obj)
 * 			//�]�m�ݩʪ���
 * 			void Filed.set(obj,valiue);
 * 
 * �ר�: �ϮgŪ����H���@���ݩ�
 * 
 * 		String class = in.newxLine();
 * 		String name = in.nextLine();
 * 		//�ʺA�[����
 * 		Class cls =class.forName(className);
 * 		//�ʺA�Ыؤ@�ӹ�H
 * 		Object obj = cls.newInsstance();
 * 		//��������@���ݩʫH��
 * 		fld = cls.getDeclaredField(name);
 * 		Object val = fld.get(obj);
 * 		System.out.println(val);
 * 
 * @author Otto
 *
 */
public class ReflectDemo04 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/**
		 * �Q�ΤϮg�ʺA�եΤ�k
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("��J��:");
		String className = in.nextLine();
		System.out.println("��k�W:");
		String methodName = in.nextLine();
		System.out.println("�Ѽ�����:");
		String typeName = in.nextLine();
		System.out.println("�Ѽƭ�:");
		String paramValue = in.nextLine();
		
		//�ʺA�[����
		Class cls=Class.forName(className);
		//�Ѽ������ഫ
		Class type = null;//��k���Ѽ�����.
		Object param=null;//�եΤ�k�ɭԹ�ڰѼ�.
		if(typeName.equals("int")){
			//Java��int��������ܬ�: int.class
			type = int.class;
			param = Integer.parseInt(paramValue);
			
		}else if(typeName.equals("double")){
			type = double.class;
			param =Double.parseDouble(className);
		}else if(typeName.equals("string")){
			type = String.class;
			param = paramValue;
		}
		//���@�ӳQ���檺��k�H��
		Method method=cls.getDeclaredMethod(methodName, type);
		
		System.out.println(method);
		
		//�ʺA�Ыع�H
		Object obj = cls.newInstance();
		/*
		 * �����k
		 * obj�N��]�t��k����H.
		 * param�N������k�ɭԪ���ڰѼ�.
		 * param���ƾ������n�P type�@�P.
		 */
		Object value = method.invoke(obj, param);
		System.out.println(value);
		
	}
}


