package Day11;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Otto
 *
 */
public class Map_Demo {
	public static void main(String[] args) {
		Map<String,Person> map = new HashMap<String,Person>();
		for(int i=0;i<10000000;i++){
			Person p = new Person("�i"+i);
			map.put("�i"+i, p);
		}
		System.out.println("�ƾڥͦ�����");
		long start = System.currentTimeMillis();
		Person p = map.get("�i9998988");
		System.out.println("���F:"+p);
		long end = System.currentTimeMillis();
		System.out.println("�Ӯ�:"+(end-start)+"ms");
		
//		Person[] array = new Person[10000000];
//		for(int i=0;i<10000000;i++){
//			Person p = new Person("�i"+i);
//			array[i]=p;
//		}	
//		System.out.println(array.length);
		
//		System.out.println("�ƾڥͦ�����");
//		//�M��䤤���@�ӤH  �i99989
//		long start = System.currentTimeMillis();
//		Person p = map.get("�i9998988");
//		System.out.println("���F:"+p);

		
//		for(int i=0;i<10000000;i++){
//			Person p = array[i];
//			if("�i99989".equals(p.getName())){
//				System.out.println("���F!");
//				System.out.println(p);
//				break;

	}
}

class Person{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return "�ڬO"+name;
	}
}
