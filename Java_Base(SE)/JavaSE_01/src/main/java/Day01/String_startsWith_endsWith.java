package Day01;
/**
 * 
 * @author Otto
 *
 */
public class String_startsWith_endsWith {

	public static void main(String[] args) {
		String str = "thinking in java";
		
		boolean starts = str.startsWith("think");
		System.out.println("starts:"+starts);
		//抓取字串前文字
		boolean ends = str.endsWith("ava");
		System.out.println("ends:"+ends);
		//抓取字串後文字
	}

}
