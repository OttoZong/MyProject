package Day02;
/**
 * 自JDK1.5之後，推出一個新的特性
 * 自動拆裝箱
 * 該特性是編譯器認可，而非虛擬機,
 * 編譯器會自動補全代碼,將基本類型與引用類型
 * 之間進行互轉
 * @author Otto
 *
 */
public class IntegerDemo {
	public static void main(String[] args) {
		/**
		 * 觸發自動裝箱特性
		 * 編譯器會在class文件中將下面代碼
		 * 改為:
		 * Inter i = Integer.valueOf(1);
		 */
		
		Integer i = 1;
		/*
		 * 觸發自動裝箱特性
		 * 編譯器會在class文件下將下面代碼
		 * 改為:
		 * int ii = i.intValue();
		 */
		int ii = i;
	}
}
