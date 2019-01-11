package Day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 數組轉換為集合
 * 數組轉換為集合需要使用多組的工具類Arrays
 * 提供的方法asList
 * 而該方法只能將數組轉換為List集合
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array= {"one","two","three","four"};
		
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		//修改集合元素就是修改原數組對應元素
		list.set(1, "2");
		System.out.println(list);
		for(String str : array) {
			System.out.println(str);
		}
		/*
		 * 添加新元素會拋出異常,因為添加新元素會導致原數組擴容,
		 * 但是擴容就不再是源數組了,所以不允許這樣的操作.
		 */
//		list.add("five");
		/*
		 * 所有集合都支持一個構造方法
		 * 可以傳入另一個集合,作用是在創建當前集合,
		 * 同時包含給定集合中的所有元素.
		 */
		List<String> list1 = new ArrayList<String>();
		list1.addAll(list);
		list1.add("five");
		System.out.println(list1);
	}
}
