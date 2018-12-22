package Day09;
/**
 * �ĤG�سЫؽu�{����k 
 * ��{Runnable���f�í��grun��k.
 * �o�ا@�k�O��W�w�q�u�{�n���檺����.
 * 
 * �Ĥ@�سЫؽu�{����k(�����~��Thread)����Ӥ���:
 * 1.�ѩ�java�O���~��,�o�N�ɭP�Y�~�ӤFThread
 * 	�N�L�k�~�Ө�L��,�o�b��ڶ}�o�ɬO�D�`����K��,
 * 	�]������_�Ψ�L������k.
 * 2.�������gThread��run��k,�b��e�u�{���|�ɭP
 * 	�u�{�n���檺���ȻP��e�u�{���@�ӥ��M�����X���Y,
 * 	���Q��u�{�_��.
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
			System.out.println("�A�O�ְ�?");
		}
	}
}
class MyRunnable02 implements  Runnable{
	public void run(){
		for(int i=0;i<1000;i++) {
			System.out.println("�ڬO�d����!");
		}
	}
}