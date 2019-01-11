package Day08;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ���ݶ��C java.util.Deque
 * Deque�~�Ӧ�Queue
 * ���ݶ��C�O��ݳ��i�H�i�X�������C
 * @author Otto
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		
		deque.offer("one");
		deque.offer("two");
		
		deque.offerFirst("three");
		
		deque.offerLast("four");
		
		System.out.println(deque);
		
		String str = deque.poll();
		System.out.println(str);
		System.out.println(deque);
		
		str = deque.peekLast();
		System.out.println(str);
		System.out.println(deque);
		
	}
}
