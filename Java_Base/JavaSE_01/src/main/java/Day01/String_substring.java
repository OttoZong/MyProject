package Day01;
/**
 * 
 * @author Otto
 *
 */
public class String_substring {
	
	public static void main(String[] args) {
	
	String str ="www.oracle.com";
	
	String sub = str.substring(4, 10);
	System.out.println("sub:"+sub);
	
	//������k�O�q���w��m�}�l�^���쥽��
	sub = str.substring(4);
	System.out.println("sub:"+sub);
	}
}
