package Day10;
/**
 * ������
 * ��ϥ�Synchronized����h�q�N�X,�ӦP�B�ʵ�����H�ۦP��,
 * �o�ǥN�X�����N�Φ��F�������Y.
 * 
 * �h�u�{����P�ɦb�o�ǥN�X���P�ɹB��.
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
			System.out.println(t.getName()+":���b����A��k...");
			Thread.sleep(5000);
			System.out.println(t.getName()+":����A��k����...");
		} catch (Exception e) {
		}
	}
	public synchronized void methodB() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":���b����B��k...");
			Thread.sleep(5000);
			System.out.println(t.getName()+":����B��k����...");
		} catch (Exception e) {
		}
	}
}