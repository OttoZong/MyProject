package Day02;

public class String_replaceAll {
	public static void main(String[] args) {
		String str = "abc123dasdas1564asd";
		/*
		 * 將數字部分替換為"#NUMBER#"
		 */
		str = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
		
		/*
		 * 和諧用語
		 */
		String regex = "tmd|nc|mdzz";
		String message = "你tmd的!你這個nc!mdzz!";
		
		message = message.replaceAll(regex, "****");
			System.out.println(message);
	}
}
