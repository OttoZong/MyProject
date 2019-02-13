package unicode;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class HowManyBytes3 {

	public static void main(String[] args) {
		
		String sourceEncoding = "UTF-8";
		String targetEncoding = "Big5";
		try {
			byte[] source = {(byte)0xE6, (byte)0xBD, (byte)0xA4};
			System.out.format("sourceEncoding: %s%n",sourceEncoding);
			System.out.format("source bytes: %s%n",formatBytes(source));
			String sourceStr = new String(source, sourceEncoding);
			System.out.format("sourceStr: %s%n",sourceStr);
			byte[] target = sourceStr.getBytes(targetEncoding);
			System.out.format("targetEncoding: %s%n",targetEncoding);
			System.out.format("target bytes: %s%n",formatBytes(target));
		} catch (Exception e) {
			e.printStackTrace();
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
