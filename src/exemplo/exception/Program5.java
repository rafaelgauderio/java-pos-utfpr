package exemplo.exception;

public class Program5 {

	public static void main(String[] args) {

		Read read = new Read();
		Person person = new Person();

		try {
			person.setId(Integer.parseInt(read.enterData("\nEnter id number: ")));

		} catch (IdLittleException idExceptionObject) {
			idExceptionObject.errorMessageLittleId();
			person = idExceptionObject.correctLittleId(person);
		} catch (IdBigException idBigExceptionObjetc) {
			idBigExceptionObjetc.errorMessageBigId();
			person = idBigExceptionObjetc.correctBigId(person);
		} catch (NumberFormatException nfe) {
			IdLittleException idException = new IdLittleException();
			idException.errorNumberException();
			idException.correctLittleId(person);

		} finally {
			
			System.out.println("============================\nId: " + person.getId() + "\n============================");
		}

	}

}
