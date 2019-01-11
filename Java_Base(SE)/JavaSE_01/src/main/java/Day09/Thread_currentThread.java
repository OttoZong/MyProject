package Day09;
/**
 * 線程提供了一些API
 * 
 * 其中提供了一個靜態的方法:
 * static Thread currentThread()
 * 該方法可以獲取運行該方法的線程
 * @author Otto
 *
 */
public class Thread_currentThread {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("運行main方法的線程是:"+main);
		dosome();
		
		Thread t = new Thread() {
			public void run() {
				Thread t = Thread.currentThread();
				System.out.println("自定義線程:"+t);
				dosome();
			}
		};
		t.start();
	}
	
	public static void dosome() {
		Thread t = Thread.currentThread();
		System.out.println("運行dosome方法的線程是:"+t);
	}
}