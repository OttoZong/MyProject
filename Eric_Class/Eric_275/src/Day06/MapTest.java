package Day06;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap
 * Hashtable
 * LinkedHashMap
 * TreeSet
 * @author Otto
 *
 */
public class MapTest {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("A", 200);
		map.put("B", 300);
		System.out.println(map);
//		map.remove("C");
//		map.clear();
		System.out.println(map.isEmpty());	//是否為空
		System.out.println(map.size());
		System.out.println(map.containsKey("B")); //有沒有此編號
		System.out.println(map.containsValue(300)); //有沒有300值
		System.out.println("A的值為:"+map.get("A"));	//取值
		
		Map<String,Integer> map1 = new HashMap<>();
		map.put("E", 200);
		map.put("F", 300);
		map.put("G", 400);
		map.put("H", 500);
		System.out.println("map:"+map);
		
		//map1所有元素放入map
		map.putAll(map1);
//		System.out.println("map1:"+map1);
//		System.out.println("map1.size:"+map1.size());
		System.out.println("map.size:"+map.size());
	}
}
