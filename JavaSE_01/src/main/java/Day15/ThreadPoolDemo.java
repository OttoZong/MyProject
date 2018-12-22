package Day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ExecutorService 有以下幾種實現策略:
 * 1.Executors.newCashedThreadPool()
 * 	創建一個可根據需要創建新線程的線程池,但是在以前構造的線程可用時將重用它們.
 *
 * 2.Executors.newFixedThreadPool(int nThreads) //最常使用
 * 	創建一個可重用固定線程集合的線程池,以共享的無界隊列方式來運行這些線程.
 * 3.Executors.newScheduledThreadPool(int corePoolSize)
 * 	創建一個線程池,它可安排在給定延遲後運行命令或者定期的執行
 * 4.Executors.newSingleThreadExecutor()
 * 	創建一個使用單個worker線程的Executor,以無界對列方式來運行該線程.
 * 
 * 線程池
 * 線程池主要解決兩個問題:
 * 1.重用線程.
 * 2.控制線程數量.
 * 
 * 當同時併發運行的任務過多時,若對應的創建了相應數量的線程會引發諸多不利的問題.
 * 1.CPU過度切換,由於所有線程都是CPU執行的,那麼線程過多,會導致CPU輪詢執行效率下降,
 * 出現"卡頓"現象
 * 2.每條線程都需要占用一定的內存,那麼線程過多可能會導致內存溢出.
 * 3.頻繁的創建及銷毀線程還會給線程調度帶來負擔,拖慢系統.
 * 
 * @author Otto
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		/*
		 * 創建一個固定大小的線程池.
		 */
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++){
			Runnable runn = new Runnable() {
				public void run() {
					try {
						Thread t = Thread.currentThread();
						System.out.println(t.getName()+":正在執行任務...");
						/*
						 * 當一個線程正處於阻塞狀態時被中斷,會拋出中斷異常.
						 * InterruptedException
						 */
						Thread.sleep(5000);
						System.out.println(t.getName()+":執行任務完畢!!!");
					} catch (Exception e) {
						System.out.println("線程被中斷了!");
					}
					
				}
			};
			
			/*
			 * 將任務指派給線程池運行.
			 */
			threadPool.execute(runn);
			System.out.println("將任務交給了線程池");
		}//for end
		/*
		 * 阻止線程池有兩個方法:
		 * shutdown,shutdownNow
		 * shutdown:當線程池所有任務執行完畢後停止調用該方法後,線程池不再接受新的任務.
		 * shutdownNow:立刻停止線程池,線程池會將內部所有線程強制中斷.
		 */
		threadPool.shutdown();
//		threadPool.shutdownNow();
		System.out.println("線程池已經結束!");
		
	}
}
