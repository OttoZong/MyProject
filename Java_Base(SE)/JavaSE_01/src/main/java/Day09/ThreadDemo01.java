package Day09;

/**
  * �h�u�{ 
  * �u�{����سЫؤ覡: 
 * 1.�w�q�u�{�n���檺����(�ݭn�ֵo���w���N�X)
 * 2.��{Runnable���f
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
			System.out.println("�A�O�ְ�?");
		}
	}
	
}
class MyThread02 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++) {
			System.out.println("�ڬO�d����!");
		}
	}
}