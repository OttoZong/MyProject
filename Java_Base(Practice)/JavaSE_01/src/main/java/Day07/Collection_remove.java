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
		 * 從集合中刪除給定元素
		 * 刪除是根據給定元素與集合中元素進行,
		 * equals比較的結果進行的.
		 */
		c.remove(p);
		System.out.println("刪除完畢!");
		System.out.println(c);//?
		
	}
}
