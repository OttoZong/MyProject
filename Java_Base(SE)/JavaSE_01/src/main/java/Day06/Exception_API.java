package Day06;
/**
 * 異常常見方法
 * @author Otto
 *
 */
public class Exception_API {
	public static void main(String[] args) {
		try {
			
		} catch (Exception e) {
			/**
			 * getCause
			 * 暫時不談
			 * printStackTrace
			 * 輸出錯誤堆線訊息,有助於定位錯誤並調整.
			 */
			e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);

		}
	}
}
