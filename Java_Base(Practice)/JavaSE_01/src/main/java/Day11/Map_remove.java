package Day11;

import java.util.HashMap;
import java.util.Map;

/**
 * �R��Map��������
 * @author Otto
 *
 */
public class Map_remove {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("�y��", 99);
		map.put("�^��", 97);
		map.put("�ƾ�", 98);
		map.put("���z", 96);
		map.put("�ƾ�", 98);
		System.out.println(map);
		/*
		 * V remove(K k)
		 * �N���w��key�ҹ�����key-value��qMap���R��.��^�Ȭ���key������value.
		 * 
		 * �Y���w��key�bMap�����s�b,�h��^�Ȭ�null.
		 */
//		Integer num =  map.remove("��|");
		Integer num =  map.remove("�y��");
		System.out.println(num);
		System.out.println(map);
		
		
	}
}
