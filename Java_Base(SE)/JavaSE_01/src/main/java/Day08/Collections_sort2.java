package Day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Collection���ѤF�@�ӭ�����sort��k
 * ���\�ڭ̦A�ǤJ�@�ӰѼ�:
 * static void sort(List list,Compartor com)
 * �ĤG�ӰѼƬ������,�i�H�ϥΥ��өw�q�w�ﶰ�X�ƧǮɪ���������j�p���W�h.
 * �ϥγo�ؤ覡��,sort��k���n�D���X����������{Comparable���f,
 * �]�����|�ϥΤ����ۨ�������W�h.
 * @author Otto
 *
 */
public class Collections_sort2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
			
			//�^��Ƨ�
//			list.add("Tom");
//			list.add("jerry");
//			list.add("jack");
//			list.add("rose");
//			list.add("jackson");
//			list.add("Andy");
//			list.add("tim");
//			list.add("wang");
		
			//����Ƨ�
			list.add("�a�Ѯv");
			list.add("�p�A�Ѯv");
			list.add("�S�Ѯv");
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
