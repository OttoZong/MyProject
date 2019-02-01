package example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex_ListArray {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		Integer Result = 0;
		
		list.add(3);
		list.add(5);
		list.add(7);
		
		
		Iterator<Integer> it = list.iterator();
			while(it.hasNext()){
				Result += it.next();
			}
		
			
			
//		for(int i = 0; i < list.size(); i++) {			
//				Result+=list.get(i);
//		}
		System.out.println("Result: "+Result);
	}
}
