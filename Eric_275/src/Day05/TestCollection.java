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
		 * �C�L���X����k
		 * 1.
		 */
		for(Object k : obj) {
			System.out.println(k);
		}
		/*
		 * 2.�ϥβv����
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
		 * ���ӰѦҫ��V�P�@�Ӫ���,==�B��l�����G��true.
		 * 
		 * equals
		 * �����Ӫ���O�_���ۦP������,�A����䤺�e�ȬO�_�ۦP,�O���ܴN�^��true.
		 */

	}
	
	@Test
	public void  testCollection1() {
		//Collection ��k
		Collection coll = new ArrayList<>();
		//��^���X�����Ӽ�
		System.out.println(coll.size());
		//�[�J����
		coll.add(123);
	}
}
