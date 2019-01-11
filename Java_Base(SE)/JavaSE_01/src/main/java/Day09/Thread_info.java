package Day09;
/**
 * 獲取現程信息的相關方法
 * @author Otto
 *
 */
public class Thread_info {
	public static void main(String[] args) {
		//獲取運行main方法的線程
		Thread main = Thread.currentThread();
		
		String name = main.getName();
		System.out.println("name:"+name);
		
		//獲取唯一標示
		long id = main.getId();
		System.out.println("id:"+id);
		
		//優先級
		int priority = main.getPriority();
		System.out.println("優先級:"+priority);
		
		//線程是否處於活動狀態
		boolean isAlive = main.isAlive();
		System.out.println("isAlive:"+isAlive);
		
		//是否為守護線程
		boolean isDaemon = main.isAlive();
		System.out.println("isDaemon:"+isDaemon);
		
		//是否被中斷
		boolean isInterrupted = main.isInterrupted();
		System.out.println("isInterrupted:"+isInterrupted);
	}
}
