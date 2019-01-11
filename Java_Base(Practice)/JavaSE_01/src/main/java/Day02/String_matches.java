package Day02;

import java.util.Scanner;

/**
 * 字符串支持正則表達式的相關方法:
 * boolean matches(String regex)
 * 使用給定的正則表達式驗證當前字符串是否滿足
 * 該格式要求.
 * 
 * 注意,注意,注意!
 * 正則表達式無論是否添加了邊界匹配符號(^$),
 * 都是做全匹配驗證!
 * @author Otto
 *
 */
public class String_matches {
	public static void main(String[] args) {
		/*
		 * 信箱的正符表達式:
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z]+)+
		 */
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]+)+";
//		System.out.println(regex);
		
//		String mail = "fancq@tedu.cn";
		System.out.println("請輸入信箱：");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		boolean match = str.matches(regex);
		
		if(match) {
			System.out.println("是郵箱");
		}else {
			System.out.println("不是郵箱");
		}
		
	}
}
