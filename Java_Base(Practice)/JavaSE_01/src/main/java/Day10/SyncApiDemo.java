package Day10;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * String Buffer是線程安全的,而StringBuilder並不是.
 * 多線程下修改字符串要用StringBuffer.
 * 
 * 對於集合而言,常用的:ArrayList,LinkedList以及HashSet.
 * 它們都不是線程安全.
 * 但是可以通過Collections的方法將它們轉換為線程安全.
 * @author Otto
 *
 */
public class SyncApiDemo {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println(list);
		
		//線程已安全
		list = Collections.synchronizedList(list);
		System.out.println(list);
		/*
		 * 將給定的Set集合轉換為線程安全.
		 */
		Set<String> set = new HashSet<String>(list);
		set = Collections.synchronizedSet(set);
		System.out.println(set);
		
		/*
		 * HashMap不是線程安全的
		 */
		Map<String,String> map = new HashMap<String,String>();
		//轉換為線程安全
		map = Collections.synchronizedMap(map);
	}  
}
