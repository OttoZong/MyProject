package Day07;

import java.util.ArrayList;
import java.util.Collection;

import Day02.Point;

/**
 * ���X�P�Ʋդ@��,���O�s�񤸯����ޥ�(�ޥ���������)
 * @author Otto
 *
 */
public class Collection_Demo02 {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		Collection c = new ArrayList();
		
		c.add(p);//�Np�s�J���X
		System.out.println("p"+p);//(1,2)
		System.out.println("c"+c);//[(1,2)]
		
		p.setX(2);
		System.out.println("p"+p);//(2,2)
		System.out.println("c"+c);//[(?,2)]
	}
}
