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

			try {
				person.setId(Integer.parseInt(read.enterData("Id...: ")));
			} catch (NumberFormatException exception) {
				System.out.println("Must inform a integer number");
			}
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

		// equal compara ojetos, == compara tipos primitivos
		System.out.println("Removing informing the Id");
		int removeId = 0;
		try {
			removeId = (Integer.parseInt(read.enterData("Inform person id do you want to remove:")));

		} catch (NumberFormatException exception) {
			System.out.println("Must inform a integer number");
		}

		for (int i = 0; i < personDataBase.size(); i++) {
			if (removeId == personDataBase.get(i).getId()) {
				personDataBase.remove(personDataBase.get(i));
			} else if (removeId != personDataBase.get(i).getId()) {
				System.out.println("There is no object with this id on the database!");
			}
		}

		System.out.println("\nPrinting object arrayList after exclusion");
		for (Person nickname : personDataBase) {
			System.out.println("Id: " + nickname.getId() + " - Name: " + nickname.getName());
		}

		System.out.println("Removin by index, informing the index");

		try {
			int index = Integer.parseInt(read.enterData("Inform the index of the object to remove:"));
			personDataBase.remove(index);
		} catch (IndexOutOfBoundsException exception) {
			System.out.println("The index has to be betwen " + (personDataBase.size() - 1));
		} catch (NumberFormatException exception) {
			System.out.println("Must inform a integer number");
		}

		System.out.println("\nPrinting object arrayList after exclusion");
		for (Person nickname : personDataBase) {
			System.out.println("Id: " + nickname.getId() + " - Name: " + nickname.getName());
		}

		System.out.println("\nUpdate List: (overwrite) " + "\n" + "Inform the new object: id and name:");
		Person person01 = new Person();
		try {
			person01.setId(Integer.parseInt(read.enterData("Id...: ")));
		} catch (IndexOutOfBoundsException exception) {
			System.out.println("The index has to be betwen " + (personDataBase.size() - 1));
		} catch (NumberFormatException exception) {
			System.out.println("Must inform a integer number");
		}
		person01.setName(read.enterData("Name..: "));
		int updateIndex = 0;
		try {
			updateIndex = Integer.parseInt(read.enterData("Inform the index of the object do you want to update!"));
			personDataBase.set(updateIndex, person01);
		} catch (IndexOutOfBoundsException exception) {
			System.out.println("The index has to be betwen " + (personDataBase.size() - 1));
		} catch (NumberFormatException exception) {
			System.out.println("Must inform a integer number");
		}

		for (Person nickname : personDataBase) {
			System.out.println("Id: " + nickname.getId() + " - Name: " + nickname.getName());
		}

	}

}
