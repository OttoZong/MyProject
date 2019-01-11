package Day11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * �M��Map
 * �M��Map���T�ؤ�k:
 * 1.�M���Ҧ���key
 * 2.�M���C�@����ȹ�Entry
 * 3.�M���Ҧ���value(�۹藍�`��)
 * 
 * @author Otto
 *
 */
public class Map_iterate {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("�y��", 99);
		map.put("�^��", 97);
		map.put("�ƾ�", 98);
		map.put("���z", 96);
		map.put("�ƾ�", 98);
		/*
		 * Set<K> keySet()
		 * �N��eMap���Ҧ���key�s�J�@��Set.
		 * ���X��N���^.�M���Ӷ��X����M���F�Ҧ���key.
		 */
		Set<String> keySet = map.keySet();
		for(String key : keySet){
			System.out.println("key:"+key);
		}
		
		/*
		 * Set<Entry> entrySet()
		 * java.util.Map.Entry
		 * Entry���C�@�ӹ�ҥΩ���Map��
		 * ���@����ȹ�Entry����ӱ`�Τ�k:
		 * K getKey():���key.
		 * V getValue():���value.
		 * 
		 * entrySet��k�|�N��eMap���C�@����ȹ�(�Y�zEntry)��Ҧs�J
		 * �@��Set���X�ñN���^.
		 */
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		
		for(Entry<String,Integer> entry : entrySet){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+":"+value);
		}
		/*
		 * �M���Ҧ���value
		 * Collection<V> values()
		 */
		Collection<Integer> values = map.values();
		for(Integer value : values){
			System.out.println("value:"+value);
		}
		
	}
}
