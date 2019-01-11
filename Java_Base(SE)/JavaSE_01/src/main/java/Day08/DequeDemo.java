package Day08;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 雙端隊列 java.util.Deque
 * Deque繼承自Queue
 * 雙端隊列是兩端都可以進出隊的隊列
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
