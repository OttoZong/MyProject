package Day02;

public class String_replaceAll {
	public static void main(String[] args) {
		String str = "abc123dasdas1564asd";
		/*
		 * �N�Ʀr����������"#NUMBER#"
		 */
		str = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
		
		/*
		 * �M�ӥλy
		 */
		String regex = "tmd|nc|mdzz";
		String message = "�Atmd��!�A�o��nc!mdzz!";
		
		message = message.replaceAll(regex, "****");
			System.out.println(message);
	}
}
