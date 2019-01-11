package Day10;
/**
 * 多線程併發安全問題
 * 當多線程併發操作同一資源時,由於線程切換時機不確定,
 * 可能會導致代碼執行混亂從而導致程序出現錯誤,
 * 嚴重時,可能會導致系統癱瘓.
 * @author Otto
 *
 */
public class SyncDemo {
	public static void main(String[] args) {
		final Table table = new Table();
		Thread t1 = new Thread() {
			public void run() {
				while(true) {
					int bean = table.getbean();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				while(true) {
					int bean = table.getbean();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}
}	

	
	class Table{
		private int beans = 20;
		/**
		 * 當一個方法是用Synchronzed修飾後,這個方法稱為"同步方法".
		 * 
		 * 同步方法多線程不能同時在方法內部運行,
		 * 這就會將多線程"搶"著運行,改為"排隊"運行.
		 * 
		 * 在方法上使用synchronized,那麼上鎖的對象就是當前方法所屬對象,
		 * 即:方法中看到的this.
		 * @return
		 */
		public synchronized int getbean() {
			if(beans==0) {
				throw new RuntimeException("沒有豆子");
			}
			//模擬線程發生切換.
			Thread.yield();//主動讓出CPU時間
			return beans--;
		}
	}

