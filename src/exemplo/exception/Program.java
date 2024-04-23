package exemplo.exception;

public class Program {

	public static void main(String[] args) {

		Read read = new Read();
		Person person = new Person();

		person.setId(Integer.parseInt(read.enterData("\nEnter id number: ")));
		System.out.println("\nId: " + person.getId());

	}

}
