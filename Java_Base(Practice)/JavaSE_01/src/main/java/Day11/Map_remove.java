package Day11;

import java.util.HashMap;
import java.util.Map;

/**
 * 刪除Map中的元素
 * @author Otto
 *
 */
public class Map_remove {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("語文", 99);
		map.put("英文", 97);
		map.put("數學", 98);
		map.put("物理", 96);
		map.put("化學", 98);
		System.out.println(map);
		/*
		 * V remove(K k)
		 * 將給定的key所對應的key-value對從Map中刪除.返回值為該key對應的value.
		 * 
		 * 若給定的key在Map中不存在,則返回值為null.
		 */
//		Integer num =  map.remove("體育");
		Integer num =  map.remove("語文");
		System.out.println(num);
		System.out.println(map);
		
		
	}
}
