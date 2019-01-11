package Day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * 集合的排序
 */
public class Collections_sort {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		Random random = new Random();
		for(int i=0;i<10;i++) {
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		/*
		 * Collections集合的工具類,它裡面提供了很多靜態方法,
		 * 是用於便於我們操作集合的.
		 */
		Collections.sort(list);
		
		System.out.println(list);
	}
}
