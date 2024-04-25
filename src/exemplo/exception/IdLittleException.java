package exemplo.exception;

public class IdLittleException extends Exception {

	private static final long serialVersionUID = 1L;
	Read read = new Read();

	/*
	 * public IdLittleException() { System.out.println("\n\tConstructor Exception");
	 * System.out.println("Generated a new IdLittleException Object"); }
	 */

	public void errorMessageLittleId() {
		System.out.println("\n\tId must be greated than 100");
	}
	
	public void errorNumberException () {
		System.out.println("\n\tId must be a integer.");
	}	
 
	public Person correctLittleId(Person person) {

		try {
			person.setId(Integer.parseInt(read.enterData("\nEnter id number: ")));

		} catch (IdLittleException idExceptionObject) {
			errorMessageLittleId();
			correctLittleId(person);
		} catch (IdBigException idBigExceptionObjetc) {
			idBigExceptionObjetc.errorMessageBigId();
			idBigExceptionObjetc.correctBigId(person);
		} catch (NumberFormatException nfe) {
			errorNumberException();
			correctLittleId(person);
		}
		return person;
	}
}
