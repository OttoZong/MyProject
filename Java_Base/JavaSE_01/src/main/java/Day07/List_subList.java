package Day07;

import java.util.ArrayList;
import java.util.List;

/**
 * List���ѤF�i�H����l������k
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
		 * �N�l�������X�j10��
		 */
		for(int i=0;i<subList.size();i++) {
			subList.set(i, subList.get(i) * 10);
//			System.out.println(subList.get(i));
		}
		System.out.println("sub"+subList);
		/*
		 * �ק�l�������N�O�ק�춰�X����������.
		 */
		System.out.println(list);
		
		/*
		 * �R�����X����2-8
		 */
		subList = list.subList(2, 9);
		subList.clear();
//		System.out.println(subList);
		System.out.println(list);

		
	}
}
