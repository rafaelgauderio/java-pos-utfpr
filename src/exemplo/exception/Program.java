package exemplo.exception;

public class Program {

	public static void main(String[] args) {

		Read read = new Read();
		Person person = new Person();
		try {
			person.setId(Integer.parseInt(read.enterData("\nEnter id number: ")));
		} catch (IdLittleException idExceptionObject) { // exceção em tempo de compilação (verificada)
			idExceptionObject.errorMessageLittleId();
		} catch (IdBigException idBigExceptionObjetc) {
			idBigExceptionObjetc.errorMessageBigId();
		} catch (NumberFormatException nfe) { // exceção em tempo de execução (não verificada)
			nfe.printStackTrace();
			System.out.println("Id must a integer number!");
		} finally { // esse bloco vai ser executado mesmo que ocorra um exceção ou não
			System.out.println("Executing finally block.");
		}
		System.out.println("\nId: " + person.getId());
	}

}
