package Day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * �ϥ��|�N���M�����X�L�{���R�������ާ@
 * @author Otto
 *
 */
public class Collection_iterator2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		
		Iterator it = c.iterator();
		/*
		 * �|�N���b�M�����X�ɭn�D����q�L���X��k�W�R����,�_�h�|�ߥX���`.
		 */
		while(it.hasNext()) {
			String str = (String)it.next();
			if("#".equals(str)) {
//				c.remove(str);//���n�o�˰�.
				/*
				 * �ϥ��|�N�����Ѫ�remove
				 * �i�H�q���X���R���q�L�|�N��next���X������.
				 */
				it.remove();
			}
		}
		System.out.println(c);
	}
}
