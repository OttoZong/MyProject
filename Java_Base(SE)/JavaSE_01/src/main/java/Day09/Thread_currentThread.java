package Day09;
/**
 * �u�{���ѤF�@��API
 * 
 * �䤤���ѤF�@���R�A����k:
 * static Thread currentThread()
 * �Ӥ�k�i�H����B��Ӥ�k���u�{
 * @author Otto
 *
 */
public class Thread_currentThread {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("�B��main��k���u�{�O:"+main);
		dosome();
		
		Thread t = new Thread() {
			public void run() {
				Thread t = Thread.currentThread();
				System.out.println("�۩w�q�u�{:"+t);
				dosome();
			}
		};
		t.start();
	}
	
	public static void dosome() {
		Thread t = Thread.currentThread();
		System.out.println("�B��dosome��k���u�{�O:"+t);
	}
}