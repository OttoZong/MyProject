package Day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Collection提供了一個重載的sort方法
 * 允許我們再傳入一個參數:
 * static void sort(List list,Compartor com)
 * 第二個參數為比較器,可以使用它來定義針對集合排序時的比較元素大小的規則.
 * 使用這種方式時,sort方法不要求集合元素必須實現Comparable接口,
 * 因為不會使用元素自身的比較規則.
 * @author Otto
 *
 */
public class Collections_sort2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
			
			//英文排序
//			list.add("Tom");
//			list.add("jerry");
//			list.add("jack");
//			list.add("rose");
//			list.add("jackson");
//			list.add("Andy");
//			list.add("tim");
//			list.add("wang");
		
			//中文排序
			list.add("蒼老師");
			list.add("小澤老師");
			list.add("范老師");
			System.out.println(list);
			Comparator<String> com = new Comparator<String>(){
				public int compare(String o1,String o2) {
					return o1.length()-o2.length();
				}
			};
//			MyComparator com = new MyComparator();
			Collections.sort(list,com);
			System.out.println(list);
	}
}

class MyComparator implements Comparator<String>{
	public int compare(String o1,String o2) {
		
		return o1.length();
	}
}
