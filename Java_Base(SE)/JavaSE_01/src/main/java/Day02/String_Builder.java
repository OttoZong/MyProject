package Day02;
/**
 * 
 * @author Otto
 *
 */
public class String_Builder {

	public static void main(String[] args) {
		/*
		 * 默認創建表示空字符串
		 * 也可以傳入一個字符串
		 */

		String str = "好好學習Java";
		StringBuilder builder = new StringBuilder(str);
		/*
		 * 好好學習Java
		 * 好好學習Java,為了找份好工作!
		 * 
		 * append方法的用途是將給定的字符串
		 * 添加到當前字符串的末尾.
		 */
		builder.append(",為了找份好工作!");
		str = builder.toString(); //返回str
		System.out.println(str);
		
		/*
		 * 好好學習Java,為了找份好工作!
		 * 好好學習Java,就是為了改變世界!
		 * 
		 * replace可以將當前字符串中指定範圍內
		 * 的內容換成給定的字符串
		 */
		
		builder.replace(9, 16, "就是為了改變世界!");
		str = builder.toString();
		System.out.println(str);
		
		/*
		 * 好好學習Java,就是為了改變世界!
		 * ,就是為了改變世界!
		 * 
		 * delete將當前字符串中指定範圍內
		 * 的字符串刪除
		 */
		builder.delete(0, 8);
		str = builder.toString();
		System.out.println(str);
		
		/*
		 * ,就是為了改變世界! 
		 * 活著,就是為了改變世界!
		 * 
		 * insert將給定的字符串插入當前
		 * 字符串的指定位置
		 */
		
		builder.insert(0, "活著");
		str = builder.toString();
		System.out.println(str);
		
		/*
		 * 反轉字符串
		 */
		
		builder.reverse();
		str = builder.toString();
		System.out.println(str);
	}

}
