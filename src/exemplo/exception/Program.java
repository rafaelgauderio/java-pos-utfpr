package exemplo.exception;

public class Program {

	public static void main(String[] args) {

		Read read = new Read();
		Person person = new Person();
		try {
			person.setId(Integer.parseInt(read.enterData("\nEnter id number: ")));
		} catch (IdLittleException idExceptionObject) { // exce��o em tempo de compila��o (verificada)
			idExceptionObject.errorMessageLittleId();
		} catch (NumberFormatException nfe) { // exce��o em tempo de execu��o (n�o verificada)
			nfe.printStackTrace();
			System.out.println("Id must a integer number!");
		}

		System.out.println("\nId: " + person.getId());

	}

}
