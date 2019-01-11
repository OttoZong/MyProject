package Day08;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * ���C
 * ���C�]�i�H�s�x�@�դ���,���O�s������������`���i���X��h.
 * @author Otto
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		/*
		 * LinkedList���F��{List���f�H�~,�ٹ�{�FQueue���f.
		 * �]��LinkedList�i�H�O�s�@�դ���,�åB�ѩ�䵲�c���S��,
		 * ����W�R�����Ĳv��,�ҥHJava�N���]��{�F���C���f.
		 */
		Queue<String> queue = new LinkedList<String>();
		/*
		 * boolean offer(E e)
		 * �J���ާ@
		 * �����l�[����
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		/*
		 * E poll()
		 * �X���ާ@
		 * �����������,�åB�N�Ӥ����q���C���R��.
		 */
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		/*
		 * E peek()
		 * �ޥζ�������,�����Ӥ������M�b���C��.
		 */
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		

		//�L�k����
//		for(int i=0;i<queue.size();i++) {
//			str = queue.poll();
//			System.out.println(str);
//		}
		/*
		 * �ϥ�poll�M��,�h�u��M���@��. 
		 */
//		while(queue.size()>0) {
//		str = queue.poll();
//		System.out.println(str);
//	}
		
		/*
		 * �|�N���M��������,�����٦b���C��.
		 */
		for(String s : queue) {
			System.out.println(s);
		}
		System.out.println(queue);
	}
}
