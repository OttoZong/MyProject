package Day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * ���X�����ާ@
 * @author Otto
 *
 */
public class Collection_all {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		/*
		 * HashSet()����񭫽Ƥ���
		 */
//		Collection c1 = new HashSet();
		c1.add("java");
		c1.add("c++");
		c1.add("c#");
		System.out.println("c1:"+c1);
		
		Collection c2 = new ArrayList();
		c2.add("php");
		c2.add("js");
		c2.add("java");
		System.out.println("c2:"+c2);
		/*
		 * boolean addAll(Collection c)
		 * �N���w���X�����Ҧ������K�[���e���X��.
		 * ��K�[�������e���X�o�ͤF���ܫh��^true.
		 */
		c1.addAll(c2);
//		boolean tf = c1.addAll(c2);
//		System.out.println(tf);//true
		System.out.println("c1:"+c1);
		
		Collection c3 = new ArrayList();
		c3.add("java");
		c3.add("js");
		/*
		 * boolean containsAll(Collection c)
		 * �P�_��e���X�O�_�]�t���w���X�����Ҧ�����.
		 */
		boolean contains = c1.containsAll(c3);
		System.out.println("���]�t:"+contains);
		/*
		 * boolean removeAll(Collection c)
		 * �R����e���X���P���w���X�@��������.
		 */
		c1.removeAll(c3);
		System.out.println("c1"+c1);
	}
}
