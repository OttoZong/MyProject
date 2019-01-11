package Day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * ���X���ѤF�Τ@���M�����X��������k:
 * �|�N��
 * 
 * java.util.Iterator
 * �ӱ��f�O�|�N�������f,�W�w�F�M�������������ާ@.
 * 
 * Collection���ѤF�Ω�M�����X����k:
 * Iterator iterator()
 * �Ӥ�k�i�H����@�ӥιM����e���X���|�N����{�����.
 * 
 * �|�N���M�����X��`:
 * ��,��,�R(�R�����O���n�ާ@)
 * 
 * @author Otto
 *
 */
public class Collection_interator {
	public static void main(String[] args) {
		Collection c = new ArrayList();
//		Collection c = new HashSet();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
		Iterator it = c.iterator();
		/*
		 * Iterator�M�����X��������k:
		 * boolean hasNext()
		 * �P�_���X�O�_�٦������i�H�M��.
		 * 
		 * E next()
		 * �M�����X�U�@�Ӥ���.
		 */
		while(it.hasNext()) {
			
			String str = (String)it.next();
			System.out.println(str);
		}
		System.out.println(c);
	}
}
