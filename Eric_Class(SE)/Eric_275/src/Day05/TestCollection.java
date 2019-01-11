package Day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class TestCollection {
	@Test
	public void testCollection03() {
		Collection coo = new ArrayList<>();
		coo.add("123");
		coo.add(123);
		coo.add(23.6);
		Object[] obj = coo.toArray();
		/*
		 * 列印集合的方法
		 * 1.
		 */
		for(Object k : obj) {
			System.out.println(k);
		}
		/*
		 * 2.使用率較高
		 */
		Iterator ff = coo.iterator();
		while(ff.hasNext()) {
			System.out.println(ff.next());
		}
	}
	@Test
	public void getboolean() {
		Object a = new Object();
		Object b = new Object();
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		a=b;
		System.out.println(a==b);
		
		System.out.println("-------------------");
		String vv = "1234";
		String bb = "1234";
		System.out.println(vv==bb);
		System.out.println(vv.equals(bb));
		System.out.println("======================");
		String ss = new String("123");
		String gg = new String("123");
		System.out.println(ss==gg);
		System.out.println(ss.equals(gg));
	}
	
	@Test
	public void testCollection2() {
		Collection c01 = new ArrayList<>();
		c01.add(123);
		c01.add(new String("AA"));
		
		Collection c02 = new ArrayList();
		c02.add(123);
		c02.add(new String("AA"));
		System.out.println(c01.equals(c02));
		
		System.out.println(c01==c01);
		/*
		 * ==
		 * 當兩個參考指向同一個物件,==運算子的結果為true.
		 * 
		 * equals
		 * 比較兩個物件是否為相同類型後,再比較其內容值是否相同,是的話就回傳true.
		 */

	}
	
	@Test
	public void  testCollection1() {
		//Collection 方法
		Collection coll = new ArrayList<>();
		//返回集合中的個數
		System.out.println(coll.size());
		//加入物件
		coll.add(123);
	}
}
