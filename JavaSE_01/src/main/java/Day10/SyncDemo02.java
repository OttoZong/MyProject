package Day10;
/**
 * ���Ī��Y�p�P�B�d��i�H�b�O�Ҩֵo�w�����e���U�����ֵo�Ĳv.
 * 
 * @author Otto
 *
 */
public class SyncDemo02 {
	public static void main(String[] args) {
		final Shop shop = new Shop();
		Thread t1 = new Thread() {
			public void run() {
				shop.buy();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}

class Shop{

/**
  * �P�B��
 * synchronized(�P�B�ʵ�����H / �W���H){
 * 		�ݭn�P�B�B�檺�N�X���q
 * }
 */
//	public synchronized void buy() {
	public void buy() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":���b���A...");
			Thread.sleep(5000);
			
			/*
			 * �Y�Ʊ�h�u�{�i�H�P�B�B��,
			 * �����O�ҦP�B�ʵ�����H(�W�ꪺ��H)�O�P�@��.
			 */
			
			synchronized (this) {
				System.out.println(t.getName()+":���b�զ�A....");
				Thread.sleep(5000);
			}

			System.out.println(t.getName()+":���b���}.");
		} catch (Exception e) {
			
		}

	}
}
