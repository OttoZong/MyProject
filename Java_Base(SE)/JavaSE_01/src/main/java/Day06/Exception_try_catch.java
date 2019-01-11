package Day06;

public class Exception_try_catch {
	public static void main(String[] args) {
		System.out.println("程序開始了");
		try {
//			String str = null;
//			String str = "";
			String str = "a";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			/*
			 * try塊中出錯的代碼以下的內容都不會再執行.
			 */
			System.out.println("!!!!!!!!!!!!!!");
			//NullPointerException 捕獲抓取空指針
		} catch (NullPointerException e) {
			System.out.println("出現了空指針");
			//StringIndexOutOfBoundsException 捕獲字符串越界
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("字符串下標越界了!");
			/*
			 * catch可以定義多個,針對不同異常有不同解決手段時,
			 * 應當針對這些異常進行捕獲.但是需養成一個好習慣,
			 * 在最後Exception,這麼做可以避免因try代碼塊中拋出
			 * 一個未捕獲異常導致程序中斷.
			 * 
			 * 當捕獲的異常存在繼承關係時,
			 * 應當將子類型異常定義在上面先行捕獲.
			 */
			//Exception 捕獲所有的錯誤
		} catch (Exception e) {
			System.out.println("反正就是出了錯!");
		}

		System.out.println("程序結束了");
	}
}
