package Day07;

import java.util.ArrayList;
import java.util.Collection;

import Day02.Point;

/**
 * 集合與數組一樣,都是存放元素的引用(引用類型元素)
 * @author Otto
 *
 */
public class Collection_Demo02 {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		Collection c = new ArrayList();
		
		c.add(p);//將p存入集合
		System.out.println("p"+p);//(1,2)
		System.out.println("c"+c);//[(1,2)]
		
		p.setX(2);
		System.out.println("p"+p);//(2,2)
		System.out.println("c"+c);//[(?,2)]
	}
}
