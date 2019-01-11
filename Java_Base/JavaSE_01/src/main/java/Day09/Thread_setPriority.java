package Day09;

/**
 * 線程優先級
 * 
 * 線程在併發運行的過程中不能干涉線程調度的工作, 
 * 即:不能主動獲取CPU時間片,也不能決定時間片長度,只能被動分配.
 * 
 * 調整線程的優先級有10個等級,分別用整數1-10表示,
 * 其中1為最低優先級,10為最高優先級,5為默認.
 * 
 * 理論上線程優先級越高的線程獲取CPU時間片的次數越多.
 * 
 * @author Otto
 *
 */
public class Thread_setPriority {
	public static void main(String[] args) {
		Thread max = new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
					System.out.println("max");
				}
			}
		};
		Thread min = new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
					System.out.println("min");
				}
			}
		};
		Thread nor = new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
					System.out.println("nor");
				}
			}
		};
		
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		min.start();
		nor.start();
		max.start();
	}
}
