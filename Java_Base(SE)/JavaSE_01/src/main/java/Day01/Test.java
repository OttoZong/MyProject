package Day01;

public class Test {

	public static void main(String[] args) {
		String str = getHostName("www.oracle.com");
		System.out.println(str); //oracle
		
		str = getHostName("http://www.baidu.com");
		System.out.println(str);

		str = getHostName("http://www.tedu.com.cn");
		System.out.println(str);//tedu
	}
	public static String getHostName(String url) {
		/*
		 * 擷取地址中第一個POINT與第二個POINT之間的內容
		 */
		//第一個POINT的位置
		int start = url.indexOf(".")+1;
		//第二個POINT的位置
		int end =  url.indexOf(".",start);
		return url.substring(start, end);
	}

}
