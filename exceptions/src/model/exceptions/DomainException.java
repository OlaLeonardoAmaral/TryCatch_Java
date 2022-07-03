package model.exceptions;
// RuntimeException -> nao sou obrigado a tratar
// Exception -> sou obrigado a tratar (throws DomainException)
public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
	
}
