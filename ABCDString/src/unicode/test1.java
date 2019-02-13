package unicode;
/**
 * 先轉Byte再轉十六進位.
 * 
 * X 表示以十六进制形式输出
 *	02 表示不足两位，前面补0输出；
 *	举例：
 *	printf("%02X", 0x123);  //打印出：123
 *	printf("%02X", 0x1); //打印出：01
 * 
 * @author Otto
 *
 */
public class test1 {
	
	public static void main(String[] args) {
		String value1 = "鄒";
		String value2 = "宗";
		String value3 = "諺";
		one(value1);one(value2);one(value3);
	}
	public static void one(String value){
		byte[] bytes = value.getBytes();
		System.out.format(value+": %s%n",formatBytes(bytes));
		

	}
	private static String formatBytes(byte[] bytes) {
		StringBuilder sb = new StringBuilder();
		for(byte b : bytes){
			sb.append(String.format("%02X", b));
			sb.append(" ");
		}
		return sb.toString().trim();
	}

	
	
	
	
	
}
