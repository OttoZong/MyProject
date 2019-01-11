package Day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序自定義類型元素
 * @author Otto
 *
 */
public class Collections_sort {
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(3,4));
		list.add(new Point(2,9));
		list.add(new Point(7,2));
		list.add(new Point(5,1));
		System.out.println(list);
		/*
		 * Collections.sort(List list)
		 * 方法要求集合元素必須實現Comparable接口.
		 */
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
