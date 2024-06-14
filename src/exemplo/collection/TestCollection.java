package exemplo.collection;

import java.util.List;
import java.util.ArrayList;

public class TestCollection {

	private static Person person;
	private static Read read = new Read();
	private static List<Person> PersonDataBase = new ArrayList<Person>();

	public static void main(String[] args) {

		boolean keepLoop = true;

		while (keepLoop) {
			
			person = new Person();

			person.setId(Integer.parseInt(read.enterData("Id...: ")));
			person.setName(read.enterData("Name..: "));

			PersonDataBase.add(person);

			System.out.println("\nList size: " + PersonDataBase.size());
			
			String response = read.enterData("\nAdd more person? (y/n)");
			if(response.equalsIgnoreCase("n")) {
				keepLoop=false;				
			}
		}
	}

}
