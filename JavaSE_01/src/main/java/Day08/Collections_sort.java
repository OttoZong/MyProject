package Day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �ƧǦ۩w�q��������
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
		 * ��k�n�D���X����������{Comparable���f.
		 */
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
