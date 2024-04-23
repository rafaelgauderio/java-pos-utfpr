package exemplo.exception;

public class IdLittleException extends Exception {

	public IdLittleException() {
		System.out.println("\n\tConstructor Exception");
		System.out.println("Generated a new IdLittleException Object");
	}

	public void errorMessageLittleId() {
		System.out.println("\n\tId must be greated than 100");
	}

}
