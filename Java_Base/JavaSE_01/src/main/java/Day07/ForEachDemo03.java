package Day07;

import java.util.ArrayList;
import java.util.Collection;

/**
 * �s�`���ëDJVM�{�i.�ӬO�sĶ���{�i.
 * �MĶ���b�sĶ���{�Ǯ�,�Y�o�{�O�ηs�`���M���Ʋ�,
 * �h�|�N��אּ�ϥζǲ�for�`���M��.
 * �Y�M�����O���X,�h�|�אּ�ϥ��|�N���M��.
 * 
 * �ҥH�b�ϥηs�`���M�����X��,�]����q�L���X����k�W�R����.
 * 
 * @author Otto
 *
 */
public class ForEachDemo03 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		System.out.println(c);
		for(Object o : c) {
			String str = (String)o;
			if("#".equals(str)) {
				c.remove(str);//���i�H
			}
		}
		System.out.println(c);
	}
}
