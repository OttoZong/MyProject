package Day06;
/**
 * ���`�`����k
 * @author Otto
 *
 */
public class Exception_API {
	public static void main(String[] args) {
		try {
			
		} catch (Exception e) {
			/**
			 * getCause
			 * �Ȯɤ���
			 * printStackTrace
			 * ��X���~��u�T��,���U��w����~�ýվ�.
			 */
			e.printStackTrace();
			String message = e.getMessage();
			System.out.println(message);

		}
	}
}
