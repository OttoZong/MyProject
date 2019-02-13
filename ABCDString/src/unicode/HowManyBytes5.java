package unicode;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class HowManyBytes5 {

	public static void main(String[] args) {
		//int codePoint0 = "𡾞".codePointAt(0);
		int codePoint0 = "，".codePointAt(0);
		System.out.println(codePoint0);
		boolean letter = Character.isLetter(codePoint0);
		System.out.println(letter);
	}
	
	private static String formatBytes(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {
			sb.append(String.format("%02X", b));
			sb.append(" ");
		}
		return sb.toString().trim();
	}
	
	

}
