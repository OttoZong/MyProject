package Day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * java.util.Collection
 * 集合框架
 * 集合與數組功能類似,用於保存一組數據.
 * 集合提供了維護元素的相關操作,使用方便.
 * 
 * Collection是所有集合的頂級接口,規定了所有集合都具有的功能方法.
 * 
 * Collection下面有兩個常用的子接口:
 * java.util.List:可重複集,並且有序.
 * java.util.set:不可重複集.
 * 元素是否可重複是根據元素自身equals比較的結果而定.
 * equals比較為true,則認為是重複元素.
 * 
 * @author Otto
 *
 */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		/*
		 * HashSet()不能放重複元素
		 */
//		Collection c = new HashSet();
		System.out.println(c);
		/*
		 * boolean add(E e)
		 * 向當前集合中添加給定元素,
		 * 當元素存入集合後返回true,存入失敗返回false.
		 */
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
//		c.add("four");
		
		System.out.println(c);
		
		//集合沒有leneng,集合只關心元素個數
		/*
		 *int size()
		 *返回當前集合的元素個素 
		 */
		int size = c.size();
		System.out.println("size:"+size);
		/*
		 * boolean isEmpty()
		 * 判斷當前集合是否為空集(不含有元素)
		 */
		boolean isEmpty = c.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
		/*
		 * void clear()
		 * 清空集合
		 */
		c.clear();
		System.out.println("集合已清空");
		
		System.out.println("size:"+c.size());
		System.out.println("isEmpty:"+c.isEmpty());
	}
}
