package Day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合間的操作
 * @author Otto
 *
 */
public class Collection_all {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		/*
		 * HashSet()不能放重複元素
		 */
//		Collection c1 = new HashSet();
		c1.add("java");
		c1.add("c++");
		c1.add("c#");
		System.out.println("c1:"+c1);
		
		Collection c2 = new ArrayList();
		c2.add("php");
		c2.add("js");
		c2.add("java");
		System.out.println("c2:"+c2);
		/*
		 * boolean addAll(Collection c)
		 * 將給定集合中的所有元素添加到當前集合中.
		 * 當添加完畢後當前集合發生了改變則返回true.
		 */
		c1.addAll(c2);
//		boolean tf = c1.addAll(c2);
//		System.out.println(tf);//true
		System.out.println("c1:"+c1);
		
		Collection c3 = new ArrayList();
		c3.add("java");
		c3.add("js");
		/*
		 * boolean containsAll(Collection c)
		 * 判斷當前集合是否包含給定集合中的所有元素.
		 */
		boolean contains = c1.containsAll(c3);
		System.out.println("全包含:"+contains);
		/*
		 * boolean removeAll(Collection c)
		 * 刪除當前集合中與給定集合共有的元素.
		 */
		c1.removeAll(c3);
		System.out.println("c1"+c1);
	}
}
