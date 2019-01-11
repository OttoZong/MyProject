package Day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * java.util.Collection
 * ���X�ج[
 * ���X�P�Ʋե\������,�Ω�O�s�@�ռƾ�.
 * ���X���ѤF���@�����������ާ@,�ϥΤ�K.
 * 
 * Collection�O�Ҧ����X�����ű��f,�W�w�F�Ҧ����X���㦳���\���k.
 * 
 * Collection�U������ӱ`�Ϊ��l���f:
 * java.util.List:�i���ƶ�,�åB����.
 * java.util.set:���i���ƶ�.
 * �����O�_�i���ƬO�ھڤ����ۨ�equals��������G�өw.
 * equals�����true,�h�{���O���Ƥ���.
 * 
 * @author Otto
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * HashSet()����񭫽Ƥ���
		 */
//		Collection c = new HashSet();
		System.out.println(c);
		/*
		 * boolean add(E e)
		 * �V��e���X���K�[���w����,
		 * �����s�J���X���^true,�s�J���Ѫ�^false.
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
//		c.add("four");
		
		System.out.println(c);
		
		//���X�S��leneng,���X�u���ߤ����Ӽ�
		/*
		 *int size()
		 *��^��e���X�������ӯ� 
		 */
		int size = c.size();
		System.out.println("size:"+size);
		/*
		 * boolean isEmpty()
		 * �P�_��e���X�O�_���Ŷ�(���t������)
		 */
		boolean isEmpty = c.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		/*
		 * void clear()
		 * �M�Ŷ��X
		 */
		c.clear();
		System.out.println("���X�w�M��");
		
		System.out.println("size:"+c.size());
		System.out.println("isEmpty:"+c.isEmpty());
	}
}
