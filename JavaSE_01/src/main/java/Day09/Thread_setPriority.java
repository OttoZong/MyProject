package Day09;

/**
 * �u�{�u����
 * 
 * �u�{�b�ֵo�B�檺�L�{������z�A�u�{�իת��u�@, 
 * �Y:����D�����CPU�ɶ���,�]����M�w�ɶ�������,�u��Q�ʤ��t.
 * 
 * �վ�u�{���u���Ŧ�10�ӵ���,���O�ξ��1-10���,
 * �䤤1���̧C�u����,10���̰��u����,5���q�{.
 * 
 * �z�פW�u�{�u���ŶV�����u�{���CPU�ɶ��������ƶV�h.
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
