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
	 * Vector ���@�ӥi�m�J"���N����"�ʺA�}�C(�i���N���ܪ���)
	 */
	@Test
	public void testVector() {
		//�O����}�l���γ̤p��10.
		Vector v = new Vector();
		//�N���w�������K�[�즹�V�q�������A�N��j�p�W�[1.
		v.addElement(new Integer(121));
		v.addElement(new Float(35.2));
		v.add(new String("fff"));
		//��^���V�q����e�e�q.
		System.out.println(v.capacity());
		
		System.out.println(v.elements());
		
		for(int i=0;i<v.size();i++) {
			Object obj = v.elementAt(i);
			System.out.println(obj);
		}
	}
}
