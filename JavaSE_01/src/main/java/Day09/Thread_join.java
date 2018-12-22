package Day09;
/**
 * 線程提供了一個方法:
 * void join()
 * 該方法允許一個線程在另一個線程上等待,
 * 直到該線程工作完畢後才繼續後續工作.
 * 
 * join常用在協調線程之間同步的操作.
 * 
 * 同步運行:執行代碼有先後順序.
 * 異步運行:執行代碼沒有先後順序,
 * 各自執行各自的(多線程就是異步執行代碼).
 * 
 * @author Otto
 *
 */
public class Thread_join {
	//表示圖片是否下載完畢.
	public static boolean isFinish = false;
	
	public static void main(String[] args) {
		
		
		//下載圖片
		final Thread download = new Thread() {
			public void run() {
				System.out.println("down:開始下載圖片...");
				for(int i=1;i<=100;i++) {
					System.out.println("down:已完成"+i+"%");
					try {
						Thread.sleep(50);
					} catch (Exception e) {
						
					}
				}
				System.out.println("down:圖片下載完畢!");
				isFinish = true;
			}
		};
		
		//顯示圖片
		Thread show = new Thread() {		
			public void run() {
				System.out.println("show:準備顯示圖片...");
				/*
				 * 在顯示前應當等待下載線程將圖片下載完畢.
				 */
				try {
					//等著.
					download.join(); 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish) {
					throw new RuntimeException("加載圖片失敗!");
				}
				System.out.println("show:顯示圖片完畢!");
			}
		};
		
		download.start();
		show.start();
	}
}
