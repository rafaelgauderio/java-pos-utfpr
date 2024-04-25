package exemplo.exception;

public class Program3 {

	public static void main(String[] args) {

		Read read = new Read();
		Person person = new Person();
		try {
			person.setId(Integer.parseInt(read.enterData("\nEnter id number: ")));
		} catch (IdLittleException | IdBigException idException) {
			
			System.out.println("\nMultication to id! ");
			
		}  catch (NumberFormatException nfe) {
			nfe.printStackTrace();
			System.out.println("Id must a integer number!");
		}
		System.out.println("\nId: " + person.getId());
	}

}
