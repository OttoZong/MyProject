package Day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 使用疊代器遍歷集合過程中刪除元素操作
 * @author Otto
 *
 */
public class Collection_iterator2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		
		Iterator it = c.iterator();
		/*
		 * 疊代器在遍歷集合時要求不能通過集合方法增刪元素,否則會拋出異常.
		 */
		while(it.hasNext()) {
			String str = (String)it.next();
			if("#".equals(str)) {
//				c.remove(str);//不要這樣做.
				/*
				 * 使用疊代器提供的remove
				 * 可以從集合中刪除通過疊代器next取出的元素.
				 */
				it.remove();
			}
		}
		System.out.println(c);
	}
}
