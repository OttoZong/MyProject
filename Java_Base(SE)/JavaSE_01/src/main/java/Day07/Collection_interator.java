package Day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 集合提供了統一的遍歷集合元素的方法:
 * 疊代器
 * 
 * java.util.Iterator
 * 該接口是疊代器的接口,規定了遍歷元素的相關操作.
 * 
 * Collection提供了用於遍歷結合的方法:
 * Iterator iterator()
 * 該方法可以獲取一個用遍歷當前集合的疊代器實現類實例.
 * 
 * 疊代器遍歷集合遵循:
 * 問,取,刪(刪除不是必要操作)
 * 
 * @author Otto
 *
 */
public class Collection_interator {
	public static void main(String[] args) {
		Collection c = new ArrayList();
//		Collection c = new HashSet();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
		Iterator it = c.iterator();
		/*
		 * Iterator遍歷集合的相關方法:
		 * boolean hasNext()
		 * 判斷集合是否還有元素可以遍歷.
		 * 
		 * E next()
		 * 遍歷取出下一個元素.
		 */
		while(it.hasNext()) {
			
			String str = (String)it.next();
			System.out.println(str);
		}
		System.out.println(c);
	}
}
