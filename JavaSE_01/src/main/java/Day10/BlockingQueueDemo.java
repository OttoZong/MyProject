package Day10;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * 雙緩衝隊列
 * 雙緩衝隊列是一個線程安全的隊列,並且由於內部使用兩條線程交替完成存取元素工作,
 * 實際上解決了併發存取元素的互斥問題.更高效.
 * 
 * @author Otto
 *
 */
public class BlockingQueueDemo {
	public static void main(String[] args) {
//		BlockingQueue<String> queue = new LinkedBlockingDeque<String>();
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(100);
		queue.size();
		
//		queue.offer("one", 5 , TimeUnit.SECONDS);
//		queue.offer("one");
//		queue.offer("two");
//		queue.offer("three");
//		queue.size();
		

	}
}
