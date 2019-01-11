package Day06;
/**
 * 年齡不合法異常
 * 
 * 自定義異常通常用來說明我們寫的項目中
 * 某個業務邏輯錯誤.
 * @author Otto
 *
 */

	//必須繼承Exception
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


