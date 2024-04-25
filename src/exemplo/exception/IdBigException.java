package exemplo.exception;

public class IdBigException extends Exception {

	private static final long serialVersionUID = 1L;
	Read read = new Read();

	/*
	 * public IdBigException() { System.out.println("\n\tConstructor Exception");
	 * System.out.println("Generated a new IdBigException Object"); }
	 */

	public void errorMessageBigId() {
		System.out.println("\n\tId must be less than 1000");
	}

	public Person correctBigId(Person person) {

		try {
			person.setId(Integer.parseInt(read.enterData("\nId number to big! Enter id number: ")));
		} catch (IdLittleException idExceptionObject) {
			idExceptionObject.errorMessageLittleId();
			idExceptionObject.correctLittleId(person);
		} catch (IdBigException idBigExceptionObjetc) {
			errorMessageBigId();
			correctBigId(person);
		} catch (NumberFormatException nfe) {
			System.out.println("Id must a integer number!");
		}
		return person;
	}
}
