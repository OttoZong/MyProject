package Day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * �x��
 * �x���OJDK1.5������X���@�ӯS��,
 * �x���b���X�ج[�����άO�̦h��.
 * �b���X���x���ΨӳW�w����������.
 * �x���O�sĶ���{�i��,�x�����쫬�OObject,
 * �ϥΪx���O�i���sĶ������NObject��@�����ݫ�,
 * �H�K��sĶ���ˬd�����ǰt�H�Φ۰ʳy��.
 * 
 * �x���Ω�W�w����������.
 * 
 * @author Otto
 *
 */
public class Collection_type {
	public static void main(String[] args) {
		//�����w�x���q�{�N�O�쫬Object
		Collection<String> c = new ArrayList<String>();
		/*
		 * �sĶ���|�ˬd��ڶǤJ���ƾ������O�_�����x���n�D.
		 */
		c.add("one");//�����ǤJString
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
		Iterator<String> it = c.iterator();
		while(it.hasNext()) {
			/*
			 * �|�N�����w�x����,�sĶ���N���D.
			 * �M�������X�������������,�sĶ���|�۰ʳy��.
			 */
			String str = it.next();
			System.out.println(str);
		}
//		for(String str : c) {
//			System.out.println(str);
//		}
		
	}
}
