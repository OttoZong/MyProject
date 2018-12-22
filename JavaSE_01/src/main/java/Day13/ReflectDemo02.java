package Day13;

import java.util.Scanner;

/**
 * ##�R�A�ե�
 * �p�U�{����H��N�w�g�T�w�F���榸��,����������ӽsĶ�ɭԽT�w�����涶�ǰ���,�o�ر��p�٬��R�A����.
 * Foo foo = new Foo();
 * foo.test();
 * 
 * ##�ʺA����
 * Java �ϮgAPI���ѤF�ʺA�������
 * 1.�ʺA�[����.
 * 2.�ʺA�Ыع�H.
 * 3.�ʺA�ե��ݩʩM��k.
 * 
 * ##�ʺA�[����
 * 
 * �b�{�ǹB�椧�e�����D���W,�b�B������ʺA�ھ����W�[�����D���s(��k��)
 * Class cls = Class.forName(���W);
 * 
 * ##�ʺA�Ыع�H
 * 
 * �p�U��i�H�ʺA�Ы������@�ӹ��
 * Object obj = cls.newInstance();
 * 
 * �ϥΫe��:cls�N���������s�b�L�Ѽƺc�y��!
 * �p�G�S���L�Ѽƺc�y���h�ߥX���`.�Ϯg���i�H�եΦ��Ѽƺc�y��(��).
 * 
 * @author Otto
 *
 */
public class ReflectDemo02 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		/**
		 * �Q�ΤϮgAPI�ʺA�[�������k��
		 * Class cls = class.forName(���W)
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("��J���W:");
		String className = in.nextLine();
		/*
		 * �ʺA�[�������k��,�p�G���W���~,
		 * �h�ߥX"���S����쪺�B�沧�`"
		 */
		Class cls = Class.forName(className);
		System.out.println(cls);
		//�i�@�B�ˬd�����ԲӫH��...
		
		/*
		 * �Q�ΤϮgAPI�ʺA�Ыع�H
		 */
		Object obj = cls.newInstance();
		System.out.println(obj);
	}
}
