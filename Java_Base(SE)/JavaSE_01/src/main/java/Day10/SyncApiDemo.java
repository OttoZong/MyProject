package Day10;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * String Buffer�O�u�{�w����,��StringBuilder�ä��O.
 * �h�u�{�U�ק�r�Ŧ�n��StringBuffer.
 * 
 * ��󶰦X�Ө�,�`�Ϊ�:ArrayList,LinkedList�H��HashSet.
 * ���̳����O�u�{�w��.
 * ���O�i�H�q�LCollections����k�N�����ഫ���u�{�w��.
 * @author Otto
 *
 */
public class SyncApiDemo {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println(list);
		
		//�u�{�w�w��
		list = Collections.synchronizedList(list);
		System.out.println(list);
		/*
		 * �N���w��Set���X�ഫ���u�{�w��.
		 */
		Set<String> set = new HashSet<String>(list);
		set = Collections.synchronizedSet(set);
		System.out.println(set);
		
		/*
		 * HashMap���O�u�{�w����
		 */
		Map<String,String> map = new HashMap<String,String>();
		//�ഫ���u�{�w��
		map = Collections.synchronizedMap(map);
	}  
}
