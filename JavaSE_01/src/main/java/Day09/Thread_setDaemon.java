package Day09;
/**
 * �u�@�u�{
 * �u�@�u�{�S�٬���x�u�{.
 * �q�{�Ыت��u�{���O�e�x�u�{,�Ӧu�@�u�{�ݭn�i��]�m��,��k��:
 * void setDaemon(boolean tf)
 * 
 * �u�@�u�{�b�ϥΤW�P�e�x�u�{�õL�ϧO,���O�b�u�{������ڤW���@�I���P,
 * ���N�O�Ҧ����b�B�檺�u�@�u�{���|�Q�j��Q����.
 * 
 * �i�{����:��@�Ӷi�{�����Ҧ��e�x�u�{��������,�i�{����.
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
				System.out.println("rose:�ڰڰڰڰڰ�AAAAAA");
				System.out.println("�ĪG:�P�q");
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
		 * �]�m�u�@�u�{,�����b�ӽu�{�Ұʤ��e�i��]�m.
		 */
		jack.setDaemon(true);
		
		rose.start();
		jack.start();
		
//		System.out.println("main��k���槹�F!");
		
		
	}
}
