package Day02;

public class Demo {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		/*
		 * == 		看的是有沒有一樣
		 * equals	看的是長得像不像 (判斷兩個對象的內容是不是一樣)
		 * equals一定要重寫對象
		 */
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}

}