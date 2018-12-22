package Day09;
/**
 * 第二種創建線程的方法 
 * 實現Runnable接口並重寫run方法.
 * 這種作法是單獨定義線程要執行的任務.
 * 
 * 第一種創建線程的方法(直接繼承Thread)有兩個不足:
 * 1.由於java是單繼承,這就導致若繼承了Thread
 * 	就無法繼承其他類,這在實際開發時是非常不方便的,
 * 	因為不能復用其他類的方法.
 * 2.直接重寫Thread的run方法,在當前線程中會導致
 * 	線程要執行的任務與當前線程有一個必然的耦合關係,
 * 	不利於線程復用.
 * @author Otto
 *
 */
public class ThreadDemo02 {
	public static void main(String[] args) {
		Runnable r1 = new MyRunnable01();
		Runnable r2 = new MyRunnable02();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}

class MyRunnable01 implements  Runnable{
	public void run(){
		for(int i=0;i<1000;i++) {
			System.out.println("你是誰啊?");
		}
	}
}
class MyRunnable02 implements  Runnable{
	public void run(){
		for(int i=0;i<1000;i++) {
			System.out.println("我是查水表的!");
		}
	}
}