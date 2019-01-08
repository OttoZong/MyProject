package tw.com.lccnet.uinfo;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

public class TestLambda {
	
	public void test1(){
		
		Comparator<Integer> com = new Comparator<Integer>(){
			
			public int compare(Integer o1,Integer o2){
				
				return Integer.compare(o1, o2);
			}
		};
		TreeSet<Integer> ts = new TreeSet<>(com);
	}
	
	
	//Lambda
	@Test
	public void test2(){
		Comparator<Integer> com = (x,y)->Integer.compare(x, y);
		TreeSet<Integer> ts = new TreeSet<>(com);
//		ts.forEach(System.out::println);
	}
}
