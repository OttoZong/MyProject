package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/**
 * 1.�~��
 * 2.�h��
 * 3.����
 * 4.�ʸ�
 * 5.���X
 * 6.�ۭq
 * 7.�ϥ�
 * 
 * 1.���X�u��Ѧҫ��A
 * @author Otto
 *
 */


public class CollectionDemo {
	public void getA1(){
	
	Collection<Object> col = new ArrayList();
	col.add(10);
	col.add(new Integer(10));
	col.add(new String("aaa"));
	
	}
	
	public void getA2(){
		List<Integer> col1 = new ArrayList<>();
		col1.add(10);
	}
	
	public void getA3(){
		List<String> list = new LinkedList<>();
		list.add("AAA");
	}
	public void getA4(){
		Collection<Boolean> coll = new HashSet<>();
		coll.add(true);
	}
	public void getA5(){
		Set<Integer> set = new HashSet<>();
		set.add(new Integer(10));
	}
}