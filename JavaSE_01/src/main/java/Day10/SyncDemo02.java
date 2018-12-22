package Day10;
/**
 * 有效的縮小同步範圍可以在保證併發安全的前提下提高併發效率.
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
  * 同步塊
 * synchronized(同步監視器對象 / 上鎖對象){
 * 		需要同步運行的代碼片段
 * }
 */
//	public synchronized void buy() {
	public void buy() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在選衣服...");
			Thread.sleep(5000);
			
			/*
			 * 若希望多線程可以同步運行,
			 * 必須保證同步監視器對象(上鎖的對象)是同一個.
			 */
			
			synchronized (this) {
				System.out.println(t.getName()+":正在試衣服....");
				Thread.sleep(5000);
			}

			System.out.println(t.getName()+":結帳離開.");
		} catch (Exception e) {
			
		}

	}
}
