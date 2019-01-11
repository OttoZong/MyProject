package Day02;


	/**
	 * 包裝類提供靜態方法parseXXX(String str)
	 * 該方法可以將給定的字符串解析為對應的基本
	 * 類型數據.前提是該字串能正確表示該基本類型
	 * 可以保存的值.
	 */
public class Integer_parseInt {
	public static void main(String[] args) {
		String str = "123";
		
		int i = Integer.parseInt(str);
		System.out.println(i+1); //124
		
		double d = Double.parseDouble(str);
		System.out.println(d);
	}
}
