package unicode;

public class HowManyBytes {

	public static void main(String[] args) {
		System.out.println("------------------start");
		String value1 = "A";
		String value2 = "潤";
		displayBytes(value1);
		displayBytes(value2);
		System.out.println("------------------end");
	}
	
	private static void displayBytes(String value) {
		byte[] bytes = value.getBytes();
		System.out.format(value+"%s, bytes length: %s, bytes: %s%n",value, bytes.length, formatBytes(bytes));
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
