package exemplo.exception;

public class Program2 {

	// nunca disparar exceção direto no método main
	public static void main(String[] args) throws IdLittleException, IdBigException, NumberFormatException {

		Read read = new Read();
		Person person = new Person();

		person.setId(Integer.parseInt(read.enterData("\nEnter id number: ")));

		System.out.println("\nId: " + person.getId());
	}

}
