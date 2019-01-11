package Day10;
/**
 * 靜態方法上使用Synchronized,那麼該方法一定具有同步效果.
 * @author Otto
 *
 */
public class SyncDemo03 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				Foo.dosome();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				Foo.dosome();
			}
		};
		t1.start();
		t2.start();
	}
}

class Foo{
	public synchronized static void dosome() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":正在運行dosome方法");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(t.getName()+":運行dosome方法");
	}
}
