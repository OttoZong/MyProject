package Day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;


/**
 * 
 * @author Otto
 *
 */
public class Colllect_Demo {
	public void testCollection01() {
		//Collection
		Collection coll = new ArrayList<>();
		//��^���X�����Ӽ�
		System.out.println(coll.size());		//0
		coll.add("1");
		coll.add("2");
		coll.add("3");
		coll.add(new Integer(10));
		coll.add(new String("TTT"));
		coll.add(new Date());
		System.out.println(coll.size());		//6
		Collection coll1=Arrays.asList(1,2,3);	
		//�[�J�t�@�� Collection
		boolean b = coll.contains("TTT");
		System.out.println(b);
		//�O�_���ۦP����(����)�A���P�_�ݭn�ۦ歫�gequal()��k
		coll.add(new Person("Eric",36));
		boolean p = coll.contains(new Person("Eric",36));
		System.out.println(p);
		System.out.println("--------------------------");
		
		Arrays.asList(1,2,3);
		//�[�J�t�@��Collection
		coll.addAll(coll1);
		System.out.println(coll.size());		//9
		//�P�_�O�_���ŭ�
		System.out.println(coll.isEmpty());
	}
}
