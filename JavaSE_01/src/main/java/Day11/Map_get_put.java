package Day11;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * Map 查找表
 * Map的樣子看起來像是一個多行兩列的表格
 * 由key-value對的形式存放的元素
 * 
 * Map有一個要求,即:key不允許重複.(equals)
 * 
 * Map是一個接口,規定Map操作元素的相關方法
 * 常用實現類:java.util.HashMap
 * 
 * HashMap,又稱為散列表,哈希表.使用散列算法
 * 實現的Map.查詢速度最快的數據結構.
 * 
 * 
 * @author Otto
 *
 */
public class Map_get_put {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		/*
		 * V put(K k,V v)
		 * 將給定的key-value對存入到Map中
		 * 
		 * 由於Map中key不允許重複,所以若使用一個Map中,
		 * 已經存在的key存放元素時,是替換value操作.
		 * 那麼返回值為該key原來的對應元素.
		 * 
		 * 若給定的key在map中不存在,則返回值為null.
		 * 
		 * 若value是包裝類的類型時,避免在調用put方法時,
		 * 使用對應的基本類型變量去接收返回值.
		 * 因為會觸發自動拆箱,若put方法返回值為null,自動拆箱時會引發空指針異常.
		 * 
		 */
//		System.out.println(map.put("語文", 99));
		Integer num = map.put("語文", 99);
		System.out.println(num);
		map.put("語文", 99);
		map.put("英文", 97);
		map.put("數學", 98);
		map.put("物理", 96);
		map.put("化學", 98);
		
		System.out.println(map);
		/*
		 * 使用Map已有的key是替換value操作.
		 */
		Integer num1 = map.put("語文", 60);
		System.out.println("被替換的value:"+num1);
		System.out.println(map);
		
		/*
		 * V get(K k)
		 * 根據給定的key獲取Map中對應的value.
		 * 若當前Map中不含有給定的key,那麼返回值為null.
		 */
		num = map.get("語文");
		System.out.println(num);
		
		num = map.get("體育");
		System.out.println(num);
		
		int size = map.size();
		System.out.println("size:"+size);
		
		boolean isEmpty = map.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
	}
}
