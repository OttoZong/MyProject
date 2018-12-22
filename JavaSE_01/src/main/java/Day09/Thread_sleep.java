package Day09;

/**
 * sleep阻塞
 * 
 * 線程提供了一個方法: 
 * void sleep(long ms) 
 * 可以讓運行到該方法的線程阻塞指定毫秒,
 * 當超時後,線程會自動回到Runnable狀態等候,
 * 再次被分配時間片併發運行.
 * 
 * @author Otto
 *
 */
public class Thread_sleep {
	public static void main(String[] args) {
		//100秒倒計時
		System.out.println("程序開始了!");
		
		try {
			for(int i=100;i>=0;i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("程序結束了!");
	}
}
