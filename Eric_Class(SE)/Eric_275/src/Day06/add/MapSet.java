package Day06.add;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapSet {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		map.put(4,"D");
		
		Set<Integer> ks=map.keySet();
		Iterator<Integer> it = ks.iterator();
		while(it.hasNext()){
			Integer key = it.next();
			String val = map.get(key);
			System.out.println("KEY:"+key+"="+"VAL:"+val);
		}
		
		Set<Map.Entry<Integer, String>> es =map.entrySet();
		Iterator<Map.Entry<Integer, String>> itt=es.iterator();
		while(itt.hasNext()){
			Map.Entry<Integer, String> en = itt.next();
			Integer key1 = en.getKey();
			String val1 = en.getValue();
			System.out.println("KEY:"+key1+"="+"VAL1:"+val1);
		}
	}

}
