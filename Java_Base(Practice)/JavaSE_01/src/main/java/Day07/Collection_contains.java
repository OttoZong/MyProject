package Day07;

import java.util.ArrayList;
import java.util.Collection;

import Day02.Point;

/**
 * 判斷集合是否包含給定元素
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
		 * 判斷當前集合是否包含給定元素
		 * 若包含則判斷返回true.
		 * 判斷包含時仍然是根據元素equals
		 * 比較的結果進行的.
		 */
		boolean contains = c.contains(p);
		System.out.println("包含:"+contains);
		
	}
}
