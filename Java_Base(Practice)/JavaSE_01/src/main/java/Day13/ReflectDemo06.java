package Day13;

import java.lang.reflect.Field;

/**
 * �ק��ݩ�
 *	//obj = foo(age=5, name=Tom)
 *	//fld = age;
 *	//value = 10;
 *	//�ˬd�ݩ�  age=10;
 *	String className = in.nextLine();
 *	String name = in.nextLine();
 *	String value = in.nextLine();
 *	//�ʺA�[����
 *	cls = Class.forName(className);
 *	//�ʺA�Ыؤ@�ӹ�H
 *	Object obj = cls.newInstance();
 *	//��������@���ݩʫH��
 *	fld = cls.getDeclaredField(name);
 *
 *
 * 	fld.set(obj, value);
 * 	System.out.println(obj);
 * 
 * ###�g��ר�
 * 
 * �ݨD:�ˬd�@�����O�_�]�t service(Request req, Response res)��k,
 * �p�G�]�t�o�Ӥ�k,�N����o�Ӥ�k. ���]�t�N�ߥX���`.
 * ����: ���W,Request��H,Response��H�@���Ѽƿ�J.
 * 
 * �]�p:
 * 		public void execute(String className, Request req, response res) throw Exception{
 * 		//�ʺA�[����.
 * 		//�ھڤ�kñ�W�d���k "service" Request Response
 * 		//�Ыع�H, �����k.
 * 		}
 * 
 * �o�ӳ]�p���n�B: �ѽ�
 * 
 * ### �ܦh�ج[�ϥΤϮg
 * 
 * �ج[���F�ѨM�良�ӥ����ե�i��ݮe�޲z,�g�`�ϥΤϮgAPI.
 * 
 * @author Otto
 *
 */
public class ReflectDemo06 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		/**
		 * ����r�Ŧꪺchar[] value�ݩ�.
		 * �]���ݩ�value�O�p����,�ҥH�ĥΤϮgAPI�X��.
		 */
		
		String s = "���ѧA�Y�F��?";
		//����ݩʫH��
		Class cls = String.class;
		Field fld = cls.getDeclaredField("value");
		char[] chs = (char[])fld.get(s);
		System.out.println(chs);
		for(char c : chs){
			System.out.println(c);
		}
		//���:�p�U�N�X�O���򵲪G.
		chs[0]='K';
		System.out.println(s);
	}
}
