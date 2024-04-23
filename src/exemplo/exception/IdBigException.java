package exemplo.exception;

public class IdBigException extends Exception {

	private static final long serialVersionUID = 1L;

	public IdBigException() {
		System.out.println("\n\tConstructor Exception");
		System.out.println("Generated a new IdBigException Object");
	}

	public void errorMessageBigId() {
		System.out.println("\n\tId must be less than 1000");
	}
}
