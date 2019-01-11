package Day07;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了可以獲取子集的方法
 * 
 * @author Otto
 *
 */
public class List_subList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		System.out.println(list);
		
		List<Integer> subList = list.subList(3, 8);
		System.out.println("sub:"+subList);
		/*
		 * 將子集元素擴大10倍
		 */
		for(int i=0;i<subList.size();i++) {
			subList.set(i, subList.get(i) * 10);
//			System.out.println(subList.get(i));
		}
		System.out.println("sub"+subList);
		/*
		 * 修改子集元素就是修改原集合對應的元素.
		 */
		System.out.println(list);
		
		/*
		 * 刪除集合元素2-8
		 */
		subList = list.subList(2, 9);
		subList.clear();
//		System.out.println(subList);
		System.out.println(list);

		
	}
}
