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
		 * �^���a�}���Ĥ@��POINT�P�ĤG��POINT���������e
		 */
		//�Ĥ@��POINT����m
		int start = url.indexOf(".")+1;
		//�ĤG��POINT����m
		int end =  url.indexOf(".",start);
		return url.substring(start, end);
	}

}
