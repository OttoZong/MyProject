package Day06;
/**
 * �~�֤��X�k���`
 * 
 * �۩w�q���`�q�`�Ψӻ����ڭ̼g�����ؤ�
 * �Y�ӷ~���޿���~.
 * @author Otto
 *
 */

	//�����~��Exception
public class IllegalAgeException extends Exception{


	private static final long serialVersionUID = 1L;

	public IllegalAgeException() {
		super();
		
	}

	public IllegalAgeException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		
	}

	public IllegalAgeException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public IllegalAgeException(String arg0) {
		super(arg0);
		
	}

	public IllegalAgeException(Throwable arg0) {
		super(arg0);
		
	}

	
}


