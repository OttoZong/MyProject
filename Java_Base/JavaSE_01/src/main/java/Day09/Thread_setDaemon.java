package Day09;
/**
 * 守護線程
 * 守護線程又稱為後台線程.
 * 默認創建的線程都是前台線程,而守護線程需要進行設置的,方法為:
 * void setDaemon(boolean tf)
 * 
 * 守護線程在使用上與前台線程並無區別,但是在線程結束實際上有一點不同,
 * 那就是所有正在運行的守護線程都會被強制被停止.
 * 
 * 進程結束:當一個進程中的所有前台線程都結束時,進程結束.
 * 
 * @author Otto
 *
 */
public class Thread_setDaemon {
	public static void main(String[] args) {
		Thread rose = new Thread() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("rose:啊啊啊啊啊啊AAAAAA");
				System.out.println("效果:噗通");
			}
		};
		Thread jack = new Thread() {
			public void run() {
				while(true) {
					System.out.println("jack:you! i jump! ");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						
					}
				}
			}
		};
		/*
		 * 設置守護線程,必須在該線程啟動之前進行設置.
		 */
		jack.setDaemon(true);
		
		rose.start();
		jack.start();
		
//		System.out.println("main方法執行完了!");
		
		
	}
}
