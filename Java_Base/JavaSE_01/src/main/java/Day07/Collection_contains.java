package Day07;

import java.util.ArrayList;
import java.util.Collection;

import Day02.Point;

/**
 * �P�_���X�O�_�]�t���w����
 * @author Otto
 *
 */
public class Collection_contains {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(2,3));
		c.add(new Point(4,5));
		c.add(new Point(6,7));
		
		Point p = new Point(1,2);
		/*
		 * boolean contains(E e)
		 * �P�_��e���X�O�_�]�t���w����
		 * �Y�]�t�h�P�_��^true.
		 * �P�_�]�t�ɤ��M�O�ھڤ���equals
		 * ��������G�i�檺.
		 */
		boolean contains = c.contains(p);
		System.out.println("�]�t:"+contains);
		
	}
}
