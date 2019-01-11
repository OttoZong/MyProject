package Day07;

import java.awt.List;
import java.util.ArrayList;

/**
 * java.util.List
 * List���f�~�Ӧ�Collection
 * List�O�i���ƶ��åB����,
  * �S�I�O���ѤF�@�եi�H�q�L�U�оާ@��������k.
  * 
  * �`�ι�{��:
  * java.util.ArrayList:�Ʋչ�{
  * java.util.LinkedList:����{
  * 
 * @author Otto
 *
 */
public class List_set_get {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		/*
		 * E get(int index)
		 * ������w�U�гB����������
		 */
		//���"two"
		String str = list.get(1);
		System.out.println(str);
		
		for(int i=0;i<list.size();i++) {
			str = list.get(i);
			System.out.println(str);
		}
		
		/*
		 * E set(int index,E e)
		 * �N���w�������]�m����w����l�W
		 * ��^�Ȭ����l����������
		 * 
		 * [one,two,three,four]
		 */
		str = list.set(1, "2");
		System.out.println(list);//[one,2,three]
		System.out.println(str);//two
	}
}
