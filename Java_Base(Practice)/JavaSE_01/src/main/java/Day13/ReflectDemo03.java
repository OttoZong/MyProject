package Day13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ###�����ϥΤϮg��{���ר�:
 * 
 * ����@�������������Htest���}�Y����k
 * �o�Ǥ�k���O�D�R�A��k,��k�S����^��,�S���Ѽ�.
 * 
 * �p�W�רҥ����ϥΤϮg��{!
 * 
 * ��{�L�{:
 * 
 * 0.�ʺA��J�@�����W.
 * 1.�ʺA�[������.
 * 2.�ʺA�Ыع�H.
 * 3.�Q�ΤϮg�d�������k�H��.
 * 4.���Htest�}�Y��k.
 * 5.�Q�ΤϮg�ʺA�����H����k.
 * 
 * @author Otto
 *
 */
public class ReflectDemo03 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
		/**
		 *	����@�������������Htest���}�Y����k
		 *	�o�Ǥ�k���O�D�R�A��k,��k�S����^��,�S���Ѽ�.
		 */
		//�ʺA�[����
		Scanner in = new Scanner(System.in);
		System.out.println("��J��:");
		String className = in.nextLine();
		Class cls = Class.forName(className);
		//�ʺA�Ыع�H
		Object obj = cls.newInstance();
		//�ʺA�ˬd������������k�H��
		Method[] methods = cls.getDeclaredMethods();
		/**
		 *###�ʺA�եΦ��Ѽƪ���k
		 * 		
		 * //����k
		 * cls.getDeclaredMethod(��k�W, �Ѽ�����1, �Ѽ�����2...)
		 * //�Ыع�H
		 * obj=cls.newInstance();
		 * //�ǳưѼ�
		 * Object method.invoke(obj, �Ѽ�1, �Ѽ�2, �Ѽ�3...)
		 */
		cls.getDeclaredMethods();
		
		for(Method method : methods){
			//System.out.println(method);
			/*
			 *method �N��@�Ӥ�k�������H��.
			 *method.getName() ��^��k�W.
			 */
			String name = method.getName();
			//System.out.println(name);
			if(name.startsWith("test")){
				System.out.println(method);
				
				/*
				 * Access �X��.
				 * Accessible �i�X��.
				 * �i�H���}�ʸ�,�X�ݤ��i������k.
				 */
				method.setAccessible(true);
			/*
			 * method.invoke()��k�Ω�եΩ�b��H�W�ե�(invoke)
			 * ��emethod��������k,�����ǻ��]�t��k����H�@���Ѽ�!
			 */
				Object val = method.invoke(obj);
				System.out.println(val);
			}
			
		}
	}
}
