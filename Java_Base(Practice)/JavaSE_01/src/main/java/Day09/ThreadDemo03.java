package Day09;
/**
 * �ϥΰΦW�����������{������ؤ�k�Ы�
 * @author Otto
 *
 */
public class ThreadDemo03 {
	public static void main(String[] args) {
		//�ϥΪ����~�ӽu�{��k
		Thread t1 = new Thread() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("�A�O�ְ�?");
				}
			}
		};
		
		//�ϥι�{Runnable���f�覡
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("�ڬO�d����!");
				}
			}
		});
//		Runnable r2 = new Runnable() {
//			public void run() {
//				for(int i=0;i<1000;i++) {
//						System.out.println("�ڬO�d����!");
//				}
//			}
//		};
//		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	
	}
}