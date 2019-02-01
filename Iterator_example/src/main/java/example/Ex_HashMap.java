package example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex_HashMap {
	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(12, "John");
		hmap.put(9, "Neck");
		hmap.put(4, "Amy");
		hmap.put(6, "Otto");

		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			
			
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}
		
		/**
		 * Get values
		 */
		String var = hmap.get(6);
		System.out.println("Value at index 6 is: " + var);
		
		
		
	}
}
