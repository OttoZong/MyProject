package Day07;

import java.util.ArrayList;

/**
 * List提供了一對重載的add,remove方法
 * @author Otto
 *
 */
public class List_add_remove {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		/*
		 * [one,2,two,three,four]
		 * 
		 * void add(int index,E e)
		 * 將給定的元素插入到指定位子
		 */
		list.add(1,"2");
		System.out.println(list);
		
		/*
		 *  [one,2,two,three,four]
		 *      刪除第3個元素
		 *  [one,2,three,four]
		 *   
		 *   E remove(int index)
		 *   將給定位置的元素從集合中刪除
		 *   並將其返回
		 */
		String str = list.remove(2);
		System.out.println(list);
		System.out.println(str);
	}
}
