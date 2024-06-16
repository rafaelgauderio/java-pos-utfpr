package exemplo.collection;

import java.util.List;
import java.util.ArrayList;

public class TestCollection {

	private static Person person;
	private static Read read = new Read();
	private static List<Person> personDataBase = new ArrayList<Person>();

	public static void main(String[] args) {

		boolean keepLoop = true;

		while (keepLoop) {

			person = new Person();

			person.setId(Integer.parseInt(read.enterData("Id...: ")));
			person.setName(read.enterData("Name..: "));

			personDataBase.add(person);

			System.out.println("List size: " + personDataBase.size());

			String response = read.enterData("\nAdd more person? (y/n)");
			if (response.equalsIgnoreCase("n")) {
				keepLoop = false;
			}
		}
		System.out.println("Default for");
		// priting data
		for (int i = 0; i < personDataBase.size(); i++) {
			System.out.println("index: " + i + " - Id: " + personDataBase.get(i).getId() + " - Name: "
					+ personDataBase.get(i).getName());

		}

		System.out.println("ForEach");
		for (Person nickname : personDataBase) {
			System.out.println("Id: " + nickname.getId() + " - Name: " + nickname.getName());
		}
	}

}
