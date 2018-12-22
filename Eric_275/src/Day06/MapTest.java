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
		System.out.println(map.isEmpty());	//�O�_����
		System.out.println(map.size());
		System.out.println(map.containsKey("B")); //���S�����s��
		System.out.println(map.containsValue(300)); //���S��300��
		System.out.println("A���Ȭ�:"+map.get("A"));	//����
		
		Map<String,Integer> map1 = new HashMap<>();
		map.put("E", 200);
		map.put("F", 300);
		map.put("G", 400);
		map.put("H", 500);
		System.out.println("map:"+map);
		
		//map1�Ҧ�������Jmap
		map.putAll(map1);
//		System.out.println("map1:"+map1);
//		System.out.println("map1.size:"+map1.size());
		System.out.println("map.size:"+map.size());
	}
}
