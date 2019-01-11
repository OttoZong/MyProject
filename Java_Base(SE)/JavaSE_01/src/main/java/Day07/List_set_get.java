package Day07;

import java.awt.List;
import java.util.ArrayList;

/**
 * java.util.List
 * List接口繼承自Collection
 * List是可重複集並且有序,
  * 特點是提供了一組可以通過下標操作元素的方法.
  * 
  * 常用實現類:
  * java.util.ArrayList:數組實現
  * java.util.LinkedList:鏈表實現
  * 
 * @author Otto
 *
 */
public class List_set_get {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		/*
		 * E get(int index)
		 * 獲取給定下標處對應的元素
		 */
		//獲取"two"
		String str = list.get(1);
		System.out.println(str);
		
		for(int i=0;i<list.size();i++) {
			str = list.get(i);
			System.out.println(str);
		}
		
		/*
		 * E set(int index,E e)
		 * 將給定的元素設置到指定的位子上
		 * 返回值為原位子對應的元素
		 * 
		 * [one,two,three,four]
		 */
		str = list.set(1, "2");
		System.out.println(list);//[one,2,three]
		System.out.println(str);//two
	}
}
