package cn.tedu.spring.service.ex;

public class UsernameNotExistsException extends Exception {

	private static final long serialVersionUID = 1L;

	public UsernameNotExistsException() {
		super();
		
	}

	public UsernameNotExistsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public UsernameNotExistsException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public UsernameNotExistsException(String message) {
		super(message);
		
	}

	public UsernameNotExistsException(Throwable cause) {
		super(cause);
		
	}

	

}
