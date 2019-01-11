package Day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型
 * 泛型是JDK1.5之後推出的一個特性,
 * 泛型在集合框架中應用是最多的.
 * 在集合中泛型用來規定元素的類型.
 * 泛型是編譯器認可的,泛型的原型是Object,
 * 使用泛型是告知編譯器應當將Object當作類型看待,
 * 以便於編譯器檢查類型匹配以及自動造型.
 * 
 * 泛型用於規定元素的類型.
 * 
 * @author Otto
 *
 */
public class Collection_type {
	public static void main(String[] args) {
		//不指定泛型默認就是原型Object
		Collection<String> c = new ArrayList<String>();
		/*
		 * 編譯器會檢查實際傳入的數據類型是否滿足泛型要求.
		 */
		c.add("one");//必須傳入String
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
		Iterator<String> it = c.iterator();
		while(it.hasNext()) {
			/*
			 * 疊代器指定泛型後,編譯器就知道.
			 * 遍歷的集合元素的實際類型,編譯器會自動造型.
			 */
			String str = it.next();
			System.out.println(str);
		}
//		for(String str : c) {
//			System.out.println(str);
//		}
		
	}
}
