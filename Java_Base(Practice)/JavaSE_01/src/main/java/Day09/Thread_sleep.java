package Day09;

/**
 * sleep����
 * 
 * �u�{���ѤF�@�Ӥ�k: 
 * void sleep(long ms) 
 * �i�H���B���Ӥ�k���u�{������w�@��,
 * ��W�ɫ�,�u�{�|�۰ʦ^��Runnable���A����,
 * �A���Q���t�ɶ����ֵo�B��.
 * 
 * @author Otto
 *
 */
public class Thread_sleep {
	public static void main(String[] args) {
		//100��˭p��
		System.out.println("�{�Ƕ}�l�F!");
		
		try {
			for(int i=100;i>=0;i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("�{�ǵ����F!");
	}
}
