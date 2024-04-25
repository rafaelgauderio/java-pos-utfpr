package exemplo.exception;

public class Program4 {

	public static void main(String[] args) {

		Read read = new Read();
		Person person = new Person();
		boolean executing = true;

		while (executing) {
			try {
				person.setId(Integer.parseInt(read.enterData("\nEnter id number: ")));
				System.out.println("\nId: " + person.getId());
				executing = false; // se funcionou o bloco try, pode para a execução
			} catch (IdLittleException idExceptionObject) {
				idExceptionObject.errorMessageLittleId();
			} catch (IdBigException idBigExceptionObjetc) {
				idBigExceptionObjetc.errorMessageBigId();
			} catch (NumberFormatException nfe) {
				System.out.println("Id must a integer number!");
			}

		}

	}

}
