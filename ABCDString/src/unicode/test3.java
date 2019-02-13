package unicode;

public class test3 {
	
	public static void main(String[] args) {
		int codePoint0 = "鄒".charAt(0);
		System.out.println("鄒  -> "+codePoint0);
	}
	
	private static String formatBytes(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes){
			sb.append(String.format("%02X", b));
			sb.append(" ");
		}
		return sb.toString().trim();
	}
}
