package Day09;
/**
 * �u�{���ѤF�@�Ӥ�k:
 * void join()
 * �Ӥ�k���\�@�ӽu�{�b�t�@�ӽu�{�W����,
 * ����ӽu�{�u�@������~�~�����u�@.
 * 
 * join�`�Φb��սu�{�����P�B���ާ@.
 * 
 * �P�B�B��:����N�X�����ᶶ��.
 * ���B�B��:����N�X�S�����ᶶ��,
 * �U�۰���U�۪�(�h�u�{�N�O���B����N�X).
 * 
 * @author Otto
 *
 */
public class Thread_join {
	//��ܹϤ��O�_�U������.
	public static boolean isFinish = false;
	
	public static void main(String[] args) {
		
		
		//�U���Ϥ�
		final Thread download = new Thread() {
			public void run() {
				System.out.println("down:�}�l�U���Ϥ�...");
				for(int i=1;i<=100;i++) {
					System.out.println("down:�w����"+i+"%");
					try {
						Thread.sleep(50);
					} catch (Exception e) {
						
					}
				}
				System.out.println("down:�Ϥ��U������!");
				isFinish = true;
			}
		};
		
		//��ܹϤ�
		Thread show = new Thread() {		
			public void run() {
				System.out.println("show:�ǳ���ܹϤ�...");
				/*
				 * �b��ܫe�����ݤU���u�{�N�Ϥ��U������.
				 */
				try {
					//����.
					download.join(); 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish) {
					throw new RuntimeException("�[���Ϥ�����!");
				}
				System.out.println("show:��ܹϤ�����!");
			}
		};
		
		download.start();
		show.start();
	}
}
