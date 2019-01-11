package Day07;
/*
 * 新循環,又稱為:增強循環,for each
 * 新循環是JDK1.5之後推出的一個特性.
 * 
 * 新循環不取代傳統for循環的工作,只用來遍歷集合或數組使用.
 */
public class ForEachDemo {
	public static void main(String[] args) {
		String[] array= {"one","two","three","four","five"};
		/*
		 * for循環
		 */
		for(int i=0;i<array.length;i++) {
			String str = array[i];
			System.out.println(str);
		}
		/*
		 * for each
		 */
		for(String str : array) {
			System.out.println(str);
		}
	}
}
