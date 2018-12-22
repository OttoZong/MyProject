package Day07;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 使用新循環遍歷集合
 * @author Otto
 *
 */
public class ForEachDemo02 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		
		for(Object o : c) {
			String str = (String)o;
			System.out.println(str);
		}
	}
}
