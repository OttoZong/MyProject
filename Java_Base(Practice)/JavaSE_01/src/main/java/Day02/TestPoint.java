package Day02;

public class TestPoint {
	/*
	 * 該方法就是將給定對象的toString方法返回字符串輸出到控制台的.
	 */
	public static void main(String[] args) {
//		Person p = new Person();
//		p.setAge(60);
//		System.out.println(p.getAge());
		
		Point p = new Point(1,2);
		/*
		 * Object定義的toStrimg方法可以將當前對象轉換為字符串.
		 * 默認內容為當前對象的句柄,即:類名@地址.
		 * 但句柄在實際開發中的意義不大,所以通常會重寫該方法.
		 */
		System.out.println(p);
		Point p1 =new Point(1,2);
		/*
		 * ==是值比較,而引用存的是地址,
		 * 除非兩個變量指向同一個對象,否則返回值為false
		 */
		System.out.println(p==p1);//false
		System.out.println(p1);
		/*
		 * equals是Object提供的方法,設計是判斷兩個對象的內容是否一樣
		 * 通常需要重寫該方法,因為Object提供的該方法就是用"=="比較的.
		 */
		System.out.println(p.equals(p1));//?
	}
}
