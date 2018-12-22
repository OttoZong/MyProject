package Day02;
/**
 * 測試Point重寫的Object相關方法
 * @author Otto
 *
 */
public class TestPoint_Demo {

	public static void main(String[] args) {
		Point p = new Point(1,2);
		/*
		 * Object定義的toString方法
		 * 可以將當前對象轉換成字符串
		 * 默認內容為當前對象的句柄,即:
		 * 類名@地址
		 * 但句柄在實際開發中的意義不大,所以
		 * 通常都會重寫該方法.
		 */
		String str = p.toString();
		System.out.println(str);
	}

}
