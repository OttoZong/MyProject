package Day07;

import java.util.ArrayList;
import java.util.Collection;

import Day02.Point;

public class Collection_remove {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(2,3));
		c.add(new Point(4,5));
		c.add(new Point(6,7));
		c.add(new Point(1,2));
		System.out.println(c);
		
		Point p = new Point(1,2);
		/*
		 * boolean remove(E e)
		 * �q���X���R�����w����
		 * �R���O�ھڵ��w�����P���X�������i��,
		 * equals��������G�i�檺.
		 */
		c.remove(p);
		System.out.println("�R������!");
		System.out.println(c);//?
		
	}
}
