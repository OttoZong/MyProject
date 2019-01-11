package Day10;
/**
 * �R�A��k�W�ϥ�Synchronized,����Ӥ�k�@�w�㦳�P�B�ĪG.
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
		System.out.println(t.getName()+":���b�B��dosome��k");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println(t.getName()+":�B��dosome��k");
	}
}
