package Day09;

/**
  * 多線程 
  * 線程有兩種創建方式: 
 * 1.定義線程要執行的任務(需要併發指定的代碼)
 * 2.實現Runnable接口
 * 
 * @author Otto
 */

public class ThreadDemo01 {
	public static void main(String[] args) {
		MyThread01 t1 = new MyThread01();
		MyThread02 t2 = new MyThread02();
		
		t1.start();
		t2.start();
	}
}
class MyThread01 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++) {
			System.out.println("你是誰啊?");
		}
	}
	
}
class MyThread02 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++) {
			System.out.println("我是查水表的!");
		}
	}
}