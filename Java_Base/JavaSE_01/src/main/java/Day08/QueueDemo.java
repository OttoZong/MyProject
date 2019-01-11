package Day08;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * 隊列
 * 隊列也可以存儲一組元素,但是存取元素必須遵循先進先出原則.
 * @author Otto
 *
 */
public class QueueDemo {
	public static void main(String[] args) {
		/*
		 * LinkedList除了實現List接口以外,還實現了Queue接口.
		 * 因為LinkedList可以保存一組元素,並且由於其結構的特性,
		 * 首位增刪元素效率高,所以Java將它也實現了隊列接口.
		 */
		Queue<String> queue = new LinkedList<String>();
		/*
		 * boolean offer(E e)
		 * 入隊操作
		 * 末尾追加元素
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		/*
		 * E poll()
		 * 出隊操作
		 * 獲取隊首元素,並且將該元素從隊列中刪除.
		 */
		String str = queue.poll();
		System.out.println(str);
		System.out.println(queue);
		/*
		 * E peek()
		 * 引用隊首元素,獲取後該元素仍然在隊列中.
		 */
		str = queue.peek();
		System.out.println(str);
		System.out.println(queue);
		

		//無法取完
//		for(int i=0;i<queue.size();i++) {
//			str = queue.poll();
//			System.out.println(str);
//		}
		/*
		 * 使用poll遍歷,則只能遍歷一次. 
		 */
//		while(queue.size()>0) {
//		str = queue.poll();
//		System.out.println(str);
//	}
		
		/*
		 * 疊代器遍歷完畢後,元素還在隊列中.
		 */
		for(String s : queue) {
			System.out.println(s);
		}
		System.out.println(queue);
	}
}
