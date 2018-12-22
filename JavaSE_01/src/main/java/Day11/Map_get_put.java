package Day11;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * Map �d���
 * Map���ˤl�ݰ_�ӹ��O�@�Ӧh���C�����
 * ��key-value�諸�Φ��s�񪺤���
 * 
 * Map���@�ӭn�D,�Y:key�����\����.(equals)
 * 
 * Map�O�@�ӱ��f,�W�wMap�ާ@������������k
 * �`�ι�{��:java.util.HashMap
 * 
 * HashMap,�S�٬����C��,���ƪ�.�ϥδ��C��k
 * ��{��Map.�d�߳t�׳̧֪��ƾڵ��c.
 * 
 * 
 * @author Otto
 *
 */
public class Map_get_put {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		/*
		 * V put(K k,V v)
		 * �N���w��key-value��s�J��Map��
		 * 
		 * �ѩ�Map��key�����\����,�ҥH�Y�ϥΤ@��Map��,
		 * �w�g�s�b��key�s�񤸯���,�O����value�ާ@.
		 * �����^�Ȭ���key��Ӫ���������.
		 * 
		 * �Y���w��key�bmap�����s�b,�h��^�Ȭ�null.
		 * 
		 * �Yvalue�O�]������������,�קK�b�ե�put��k��,
		 * �ϥι������������ܶq�h������^��.
		 * �]���|Ĳ�o�۰ʩ�c,�Yput��k��^�Ȭ�null,�۰ʩ�c�ɷ|�޵o�ū��w���`.
		 * 
		 */
//		System.out.println(map.put("�y��", 99));
		Integer num = map.put("�y��", 99);
		System.out.println(num);
		map.put("�y��", 99);
		map.put("�^��", 97);
		map.put("�ƾ�", 98);
		map.put("���z", 96);
		map.put("�ƾ�", 98);
		
		System.out.println(map);
		/*
		 * �ϥ�Map�w����key�O����value�ާ@.
		 */
		Integer num1 = map.put("�y��", 60);
		System.out.println("�Q������value:"+num1);
		System.out.println(map);
		
		/*
		 * V get(K k)
		 * �ھڵ��w��key���Map��������value.
		 * �Y��eMap�����t�����w��key,�����^�Ȭ�null.
		 */
		num = map.get("�y��");
		System.out.println(num);
		
		num = map.get("��|");
		System.out.println(num);
		
		int size = map.size();
		System.out.println("size:"+size);
		
		boolean isEmpty = map.isEmpty();
		System.out.println("isEmpty:"+isEmpty);
	}
}
