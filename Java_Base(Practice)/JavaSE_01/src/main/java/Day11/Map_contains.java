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
		map.put("�y��", 99);
		map.put("�^��", 97);
		map.put("�ƾ�", 98);
		map.put("���z", 96);
		map.put("�ƾ�", 98);
		
		boolean c = map.containsKey("�^�y");
		System.out.println("�]�tkey:"+c);
		
		c = map.containsValue(96);
		System.out.println("�]�tvalue:"+c);
	}
}
