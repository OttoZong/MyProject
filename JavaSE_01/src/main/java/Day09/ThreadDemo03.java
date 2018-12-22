package Day09;
/**
 * 使用匿名內部類完成現成的兩種方法創建
 * @author Otto
 *
 */
public class ThreadDemo03 {
	public static void main(String[] args) {
		//使用直接繼承線程方法
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("你是誰啊?");
				}
			}
		};
		
		//使用實現Runnable接口方式
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("我是查水表的!");
				}
			}
		});
//		Runnable r2 = new Runnable() {
//			public void run() {
//				for(int i=0;i<1000;i++) {
//						System.out.println("我是查水表的!");
//				}
//			}
//		};
//		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	
	}
}