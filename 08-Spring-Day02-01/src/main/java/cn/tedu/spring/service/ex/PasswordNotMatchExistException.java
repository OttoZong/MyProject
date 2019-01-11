package cn.tedu.spring.service.ex;

public class PasswordNotMatchExistException extends Exception {

	private static final long serialVersionUID = 1L;

	public PasswordNotMatchExistException() {
		super();
		
	}

	public PasswordNotMatchExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public PasswordNotMatchExistException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public PasswordNotMatchExistException(String message) {
		super(message);
		
	}

	public PasswordNotMatchExistException(Throwable cause) {
		super(cause);
		
	}
	
}
