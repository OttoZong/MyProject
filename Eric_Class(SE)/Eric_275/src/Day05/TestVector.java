package Day05;

import java.util.List;
import java.util.Vector;

import org.junit.Test;

/**
 * 
 * @author Otto
 *
 */
public class TestVector {
	/*
	 * Vector 為一個可置入"任意物件"動態陣列(可任意改變長度)
	 */
	@Test
	public void testVector() {
		//記憶體開始切割最小為10.
		Vector v = new Vector();
		//將指定的元素添加到此向量的末尾，將其大小增加1.
		v.addElement(new Integer(121));
		v.addElement(new Float(35.2));
		v.add(new String("fff"));
		//返回此向量的當前容量.
		System.out.println(v.capacity());
		
		System.out.println(v.elements());
		
		for(int i=0;i<v.size();i++) {
			Object obj = v.elementAt(i);
			System.out.println(obj);
		}
	}
}
