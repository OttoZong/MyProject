package Day09;
/**
 * ����{�{�H����������k
 * @author Otto
 *
 */
public class Thread_info {
	public static void main(String[] args) {
		//����B��main��k���u�{
		Thread main = Thread.currentThread();
		
		String name = main.getName();
		System.out.println("name:"+name);
		
		//����ߤ@�Х�
		long id = main.getId();
		System.out.println("id:"+id);
		
		//�u����
		int priority = main.getPriority();
		System.out.println("�u����:"+priority);
		
		//�u�{�O�_�B�󬡰ʪ��A
		boolean isAlive = main.isAlive();
		System.out.println("isAlive:"+isAlive);
		
		//�O�_���u�@�u�{
		boolean isDaemon = main.isAlive();
		System.out.println("isDaemon:"+isDaemon);
		
		//�O�_�Q���_
		boolean isInterrupted = main.isInterrupted();
		System.out.println("isInterrupted:"+isInterrupted);
	}
}
