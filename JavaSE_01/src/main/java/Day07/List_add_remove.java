package Day07;

import java.util.ArrayList;

/**
 * List���ѤF�@�ﭫ����add,remove��k
 * @author Otto
 *
 */
public class List_add_remove {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		
		/*
		 * [one,2,two,three,four]
		 * 
		 * void add(int index,E e)
		 * �N���w���������J����w��l
		 */
		list.add(1,"2");
		System.out.println(list);
		
		/*
		 *  [one,2,two,three,four]
		 *      �R����3�Ӥ���
		 *  [one,2,three,four]
		 *   
		 *   E remove(int index)
		 *   �N���w��m�������q���X���R��
		 *   �ñN���^
		 */
		String str = list.remove(2);
		System.out.println(list);
		System.out.println(str);
	}
}
