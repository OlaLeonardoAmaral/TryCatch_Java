package model.exceptions;

public class MyException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public MyException(String msg) {
		super(msg);
	}
}
