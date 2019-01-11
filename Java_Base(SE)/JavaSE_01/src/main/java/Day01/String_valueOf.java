package Day01;
/**
 * 比較常用是將基本類型轉換成字符串
 * @author Otto
 *
 */
public class String_valueOf {

	public static void main(String[] args) {
		int i = 123;
		String istr = String.valueOf(i);
		System.out.println(istr+4);
		
		double d = 123.123;
		String dstr = String.valueOf(d);
		System.out.println(dstr+4);

		
	}

}
