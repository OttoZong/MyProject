package Day05;
/**
 * 
 * @author Otto
 *
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class TestList {
	
	@Test
	public void testList() {
		List list = new ArrayList();
		list.add("123");
		list.add("456");
		list.add("abc");
		list.set(1, 789);
		System.out.println(list.get(2));
		
		list.add(1, "VV");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
//		for(Object obj:list) {
//			System.out.println(obj);
		}
	}	
}
