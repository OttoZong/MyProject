package Day11;
/**
 * 
 */
import java.util.HashMap;
import java.util.Map;
/*
 * 
 */
public class Map_contains {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("語文", 99);
		map.put("英文", 97);
		map.put("數學", 98);
		map.put("物理", 96);
		map.put("化學", 98);
		
		boolean c = map.containsKey("英語");
		System.out.println("包含key:"+c);
		
		c = map.containsValue(96);
		System.out.println("包含value:"+c);
	}
}
