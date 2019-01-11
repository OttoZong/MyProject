package Day11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 遍歷Map
 * 遍歷Map有三種方法:
 * 1.遍歷所有的key
 * 2.遍歷每一組鍵值對Entry
 * 3.遍歷所有的value(相對不常用)
 * 
 * @author Otto
 *
 */
public class Map_iterate {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("語文", 99);
		map.put("英文", 97);
		map.put("數學", 98);
		map.put("物理", 96);
		map.put("化學", 98);
		/*
		 * Set<K> keySet()
		 * 將當前Map中所有的key存入一個Set.
		 * 集合後將其返回.遍歷該集合等於遍歷了所有的key.
		 */
		Set<String> keySet = map.keySet();
		for(String key : keySet){
			System.out.println("key:"+key);
		}
		
		/*
		 * Set<Entry> entrySet()
		 * java.util.Map.Entry
		 * Entry的每一個實例用於表示Map中
		 * 的一組鍵值對Entry的兩個常用方法:
		 * K getKey():獲取key.
		 * V getValue():獲取value.
		 * 
		 * entrySet方法會將當前Map中每一組鍵值對(若干Entry)實例存入
		 * 一個Set集合並將其返回.
		 */
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		
		for(Entry<String,Integer> entry : entrySet){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+":"+value);
		}
		/*
		 * 遍歷所有的value
		 * Collection<V> values()
		 */
		Collection<Integer> values = map.values();
		for(Integer value : values){
			System.out.println("value:"+value);
		}
		
	}
}
