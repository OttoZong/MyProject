package Day10;
/**
 * �h�u�{�ֵo�w�����D
 * ��h�u�{�ֵo�ާ@�P�@�귽��,�ѩ�u�{�����ɾ����T�w,
 * �i��|�ɭP�N�X����V�ñq�ӾɭP�{�ǥX�{���~,
 * �Y����,�i��|�ɭP�t������.
 * @author Otto
 *
 */
public class SyncDemo {
	public static void main(String[] args) {
		final Table table = new Table();
		Thread t1 = new Thread() {
			public void run() {
				while(true) {
					int bean = table.getbean();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				while(true) {
					int bean = table.getbean();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}
}	

	
	class Table{
		private int beans = 20;
		/**
		 * ��@�Ӥ�k�O��Synchronzed�׹���,�o�Ӥ�k�٬�"�P�B��k".
		 * 
		 * �P�B��k�h�u�{����P�ɦb��k�����B��,
		 * �o�N�|�N�h�u�{"�m"�۹B��,�אּ"�ƶ�"�B��.
		 * 
		 * �b��k�W�ϥ�synchronized,����W�ꪺ��H�N�O��e��k���ݹ�H,
		 * �Y:��k���ݨ쪺this.
		 * @return
		 */
		public synchronized int getbean() {
			if(beans==0) {
				throw new RuntimeException("�S�����l");
			}
			//�����u�{�o�ͤ���.
			Thread.yield();//�D�����XCPU�ɶ�
			return beans--;
		}
	}

