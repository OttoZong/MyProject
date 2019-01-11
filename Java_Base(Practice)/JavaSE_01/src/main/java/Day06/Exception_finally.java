package Day06;
/**
 * finally塊
 * finally只能定義在異常捕獲機制的最後可以直接
 * 跟在try塊之後或最後一個catch之後.
 * 
 * finally可以保證裡面的代碼一定執行.
 * 所以通常會將無關乎異常而不需運行的代碼,
 * 定義在finally確保它們可以被運行.比如流操作中,
 * 關閉流就應當放在finally中.
 * 
 * @author Otto
 *
 */
public class Exception_finally {
	public static void main(String[] args) {
		try {
			String str = "";
			System.out.println(str.length());
			return;
		} catch (Exception e) {
			System.out.println("出錯了");
		} finally {
			System.out.println("finally中的代碼執行了!");
		}
		System.out.println("程序結束了!");
	}
}
