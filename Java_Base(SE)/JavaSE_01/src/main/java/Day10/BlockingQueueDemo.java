package Day10;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * ���w�Ķ��C
 * ���w�Ķ��C�O�@�ӽu�{�w�������C,�åB�ѩ󤺳��ϥΨ���u�{��������s�������u�@,
 * ��ڤW�ѨM�F�ֵo�s���������������D.�󰪮�.
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
