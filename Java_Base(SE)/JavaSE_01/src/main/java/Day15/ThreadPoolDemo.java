package Day15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ExecutorService ���H�U�X�ع�{����:
 * 1.Executors.newCashedThreadPool()
 * 	�Ыؤ@�ӥi�ھڻݭn�Ыطs�u�{���u�{��,���O�b�H�e�c�y���u�{�i�ήɱN���Υ���.
 *
 * 2.Executors.newFixedThreadPool(int nThreads) //�̱`�ϥ�
 * 	�Ыؤ@�ӥi���ΩT�w�u�{���X���u�{��,�H�@�ɪ��L�ɶ��C�覡�ӹB��o�ǽu�{.
 * 3.Executors.newScheduledThreadPool(int corePoolSize)
 * 	�Ыؤ@�ӽu�{��,���i�w�Ʀb���w�����B��R�O�Ϊ̩w��������
 * 4.Executors.newSingleThreadExecutor()
 * 	�Ыؤ@�Өϥγ��worker�u�{��Executor,�H�L�ɹ�C�覡�ӹB��ӽu�{.
 * 
 * �u�{��
 * �u�{���D�n�ѨM��Ӱ��D:
 * 1.���νu�{.
 * 2.����u�{�ƶq.
 * 
 * ��P�ɨֵo�B�檺���ȹL�h��,�Y�������ЫؤF�����ƶq���u�{�|�޵o�Ѧh���Q�����D.
 * 1.CPU�L�פ���,�ѩ�Ҧ��u�{���OCPU���檺,����u�{�L�h,�|�ɭPCPU���߰���Ĳv�U��,
 * �X�{"�d�y"�{�H
 * 2.�C���u�{���ݭn�e�Τ@�w�����s,����u�{�L�h�i��|�ɭP���s���X.
 * 3.�W�c���ЫؤξP���u�{�ٷ|���u�{�իױa�ӭt��,��C�t��.
 * 
 * @author Otto
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		/*
		 * �Ыؤ@�өT�w�j�p���u�{��.
		 */
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++){
			Runnable runn = new Runnable() {
				public void run() {
					try {
						Thread t = Thread.currentThread();
						System.out.println(t.getName()+":���b�������...");
						/*
						 * ��@�ӽu�{���B����몬�A�ɳQ���_,�|�ߥX���_���`.
						 * InterruptedException
						 */
						Thread.sleep(5000);
						System.out.println(t.getName()+":������ȧ���!!!");
					} catch (Exception e) {
						System.out.println("�u�{�Q���_�F!");
					}
					
				}
			};
			
			/*
			 * �N���ȫ������u�{���B��.
			 */
			threadPool.execute(runn);
			System.out.println("�N���ȥ浹�F�u�{��");
		}//for end
		/*
		 * ����u�{������Ӥ�k:
		 * shutdown,shutdownNow
		 * shutdown:��u�{���Ҧ����Ȱ��槹���ᰱ��եθӤ�k��,�u�{�����A�����s������.
		 * shutdownNow:�ߨ谱��u�{��,�u�{���|�N�����Ҧ��u�{�j��_.
		 */
		threadPool.shutdown();
//		threadPool.shutdownNow();
		System.out.println("�u�{���w�g����!");
		
	}
}
