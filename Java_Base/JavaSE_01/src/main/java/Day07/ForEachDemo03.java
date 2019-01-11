package Day07;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 新循環並非JVM認可.而是編譯器認可.
 * 遍譯器在編譯源程序時,若發現是用新循環遍歷數組,
 * 則會將其改為使用傳統for循環遍歷.
 * 若遍歷的是集合,則會改為使用疊代器遍歷.
 * 
 * 所以在使用新循環遍歷集合時,也不能通過集合的方法增刪元素.
 * 
 * @author Otto
 *
 */
public class ForEachDemo03 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		System.out.println(c);
		for(Object o : c) {
			String str = (String)o;
			if("#".equals(str)) {
				c.remove(str);//不可以
			}
		}
		System.out.println(c);
	}
}
