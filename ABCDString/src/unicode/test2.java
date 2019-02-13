package unicode;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class test2 {

	public static void main(String[] args) {
		SortedMap<String, Charset> Char = Charset.availableCharsets();
		System.out.println(Char);
		
		String[] encodings = {"UTF-8","UTF-16","Big5"};
		String[] strAry = {"鄒","宗","諺"};
		
		for(String str : strAry){
			for(String encoding : encodings){
				System.out.format("%s, ", str);
				try{
					byte[] bytes1 = str.getBytes(encoding);
					System.out.format("encoding: %10s", encoding);
					System.out.format("bytes: %s", formatBytes(bytes1));
				}catch(Exception e) {
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
