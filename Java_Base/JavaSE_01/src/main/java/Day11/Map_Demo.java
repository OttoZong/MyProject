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
			Person p = new Person("張"+i);
			map.put("張"+i, p);
		}
		System.out.println("數據生成完畢");
		long start = System.currentTimeMillis();
		Person p = map.get("張9998988");
		System.out.println("找到了:"+p);
		long end = System.currentTimeMillis();
		System.out.println("耗時:"+(end-start)+"ms");
		
//		Person[] array = new Person[10000000];
//		for(int i=0;i<10000000;i++){
//			Person p = new Person("張"+i);
//			array[i]=p;
//		}	
//		System.out.println(array.length);
		
//		System.out.println("數據生成完畢");
//		//尋找其中的一個人  張99989
//		long start = System.currentTimeMillis();
//		Person p = map.get("張9998988");
//		System.out.println("找到了:"+p);

		
//		for(int i=0;i<10000000;i++){
//			Person p = array[i];
//			if("張99989".equals(p.getName())){
//				System.out.println("找到了!");
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
		
		return "我是"+name;
	}
}
