package unicode;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class HowManyBytes4 {

	public static void main(String[] args) {
		String[] encodings = {"UTF-8","UTF-16","MS950","Big5","ISO-8859-1"};
		String[] strAry = {
				"𡾞",
//				"Á",
//				"Á"
				};
		
		for (String str : strAry) {
			for (String encoding : encodings) {
				System.out.format("%s, string length: %s, ",str, str.length());
				try {
					byte[] bytes1 = str.getBytes(encoding);
					System.out.format("encoding: %10s, bytes length: %s, ",encoding, bytes1.length);
					System.out.format("bytes: %s",formatBytes(bytes1));
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println();
			}
		}
		
		
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
