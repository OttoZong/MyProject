package Day13;
/**
 *	�Ϯg
 *java���ʺA����,�Ω�b�B������ˬd��H������,
 *�ˬd��H�������c(�ݩ�,��k��),�٥i�H�ʺA�[����,�ʺA�Ыع�H,�ʺA�X���ݩʩM��k��...
 *
 * �Ϯg�O java �� api
 * public void print(Object obj){
 * //�Q�ΤϮgAPI,�ʺA�ˬdobj�ޥΪ���H����
 * Class cls = obj.getClass();
 * System.out.println(obj);
 * }
 * �g�孱���D��:Eclipse ���ֱ����ΤF����޳N��{
 * ����: ��M�O�Ϯg�޳N,�ϮgAPI
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo01 {
	/**
	 * �ϮgAPI.
	 * �ʺA�ˬd��H������.
	 * @param args
	 */
	public static void main(String[] args) {
		print(1);
		print("1");
		print('1');
	}
	public static void print(Object obj){

		/**
		 *�ʺA�ˬdobj��H������.
		 *getClass��k�bObject���W�w�q,
		 *�Q�Ҧ���H�~��,������H�W��������k.
		 */
		Class cls = obj.getClass();
		/*
		 * class���ѤF��[�Ժɪ������ԲӫH��.
		 * �ˬd��k:�ˬd�ݩ�,�ˬd��k,�ˬd�c�y��...
		 * �ʺA�ˬd Integer���������ݩ�.
		 * 
		 * Declared: �n��
		 * Field:	�l�q,�ݩ�
		 */
		Field[] fields = cls.getDeclaredFields();
		for(Field field : fields){
			System.out.println(field);
		}
		//�����e�����W�n����������k�H��
		//getDeclaredMethods
		Method[] methods = cls.getDeclaredMethods();
		
		for(Method method : methods){
			System.out.println(method);
		}
		
		System.out.println(cls);
		System.out.println(obj);
	}
}
