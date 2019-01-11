package Day10;
/**
 * 互斥鎖
 * 當使用Synchronized控制多段代碼,而同步監視器對象相同時,
 * 這些代碼之間就形成了互斥關係.
 * 
 * 多線程不能同時在這些代碼間同時運行.
 * @author Otto
 *
 */
public class SyncDemo04 {
	public static void main(String[] args) {
		final Boo boo = new Boo();
		Thread t1 = new Thread() {
			public void run() {
				boo.methodA();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				boo.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}

class Boo{
	public synchronized void methodA() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在執行A方法...");
			Thread.sleep(5000);
			System.out.println(t.getName()+":執行A方法完畢...");
		} catch (Exception e) {
		}
	}
	public synchronized void methodB() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在執行B方法...");
			Thread.sleep(5000);
			System.out.println(t.getName()+":執行B方法完畢...");
		} catch (Exception e) {
		}
	}
}