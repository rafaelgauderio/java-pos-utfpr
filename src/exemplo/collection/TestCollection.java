package exemplo.collection;

import java.util.List;
import java.util.ArrayList;

public class TestCollection {

	private static Person person;
	private static Read read = new Read();
	private static List<Person> personDataBase = new ArrayList<Person>();

	public static void main(String[] args) {

		boolean keepLoop = true;
		int option = 0;

		while (keepLoop) {
			System.out.println("\nMenu");
			System.out.println("1. Insert Person");
			System.out.println("2. List all Persons");
			System.out.println("3. Consult Person by id");
			System.out.println("4. Remove Person by id");
			System.out.println("5. Update Person by id");
			System.out.println("6. Exit");

			try {
				option = Integer.parseInt(read.enterData("\nChoose an option between 1 and 6: "));
			} catch (NumberFormatException exception) {
				read.enterData("\nThe option must be a integer number. Press <ENTER> to continue...");
				continue; // abandon the sctructure e do annother loop;
			}

			switch (option) {
			case 1:
				System.out.println("\nInsert Person");
				person = insertPerson(new Person());
				break;
			case 2:
				System.out.println("\nList All Person");
				printAllpersonDataBase();
				break;
			case 3:
				System.out.println("\nConsult Person by id");
				int personId = Integer.parseInt(read.enterData("Inform person Id to print data: "));
				int personIndex = findPersonById(personId);
				if (personIndex == -1) {
					read.enterData("\nNo person with this id on the data base. Press <ENTER> to continue...");
				} else {
					printOnePerson(personIndex);
				}

				break;
			case 4:
				System.out.println("\nRemove Person by id");
				int removePersonId = Integer.parseInt(read.enterData("Inform a Person id to remove person: "));
				int removePersonIndex = findPersonById(removePersonId);
				if (removePersonIndex == -1) {
					read.enterData("\nNo person with this id on the data base. Press <ENTER> to continue...");
				} else {
					removePersonById(removePersonIndex);
				}

				break;
			case 5:
				System.out.println("\nUpdate Person by id");
				break;
			case 6:
				System.out.println("\nReal sure to exit the application? <y/n>");
				String exit = read.enterData("");
				if (exit.equalsIgnoreCase("y")) {
					System.out.print("Close API.");
					System.exit(0);
				}
				break;
			default:
				read.enterData("\nThe option must be between 1 and 6. <Enter>");
				break;
			}

		}

	}

	public static Person insertPerson(Person person) {

		try {
			person.setId(Integer.parseInt(read.enterData("Id...: ")));
		} catch (NumberFormatException exception) {
			System.out.println("Must inform a integer number");
		}
		person.setName(read.enterData("Name..: "));

		personDataBase.add(person);

		return person;
	}

	public static void printAllpersonDataBase() {

		for (int i = 0; i < personDataBase.size(); i++) {
			System.out.println("index: " + i + " - Id: " + personDataBase.get(i).getId() + " - Name: "
					+ personDataBase.get(i).getName());
		}
		if (personDataBase.size() == 0) {
			System.out.println("The database is empty! Insert a new person.");
		} else {
			System.out.println("There is/are person(s) " + personDataBase.size() + " on the data base!");
		}

	}

	public static void printOnePerson(int personIndex) {

		System.out.println("\nPersonData\nId: " + personDataBase.get(personIndex).getId() + " - Name: "
				+ personDataBase.get(personIndex).getName());
	}

	public static int findPersonById(int personId) {
		int i = 0;
		for (i = 0; i < personDataBase.size(); i++) {
			if (personId == personDataBase.get(i).getId()) {
				return i;
			}
		}
		return -1;
	}

	public static void removePersonById(int personIndex) {
		personDataBase.remove(personIndex);
		System.out.println("\nPerson remove with sucess!");
	}

}

/*
 * 
 * // equal compara ojetos, == compara tipos primitivos
 * System.out.println("Removing informing the Id"); int removeId = 0; try {
 * removeId =
 * (Integer.parseInt(read.enterData("Inform person id do you want to remove:")))
 * ;
 * 
 * } catch (NumberFormatException exception) {
 * System.out.println("Must inform a integer number"); }
 * 
 * for (int i = 0; i < personDataBase.size(); i++) { if (removeId ==
 * personDataBase.get(i).getId()) {
 * personDataBase.remove(personDataBase.get(i)); } else if (removeId !=
 * personDataBase.get(i).getId()) {
 * System.out.println("There is no object with this id on the database!"); } }
 * 
 * System.out.println("\nPrinting object arrayList after exclusion"); for
 * (Person nickname : personDataBase) { System.out.println("Id: " +
 * nickname.getId() + " - Name: " + nickname.getName()); }
 * 
 * System.out.println("Removin by index, informing the index");
 * 
 * try { int index =
 * Integer.parseInt(read.enterData("Inform the index of the object to remove:"))
 * ; personDataBase.remove(index); } catch (IndexOutOfBoundsException exception)
 * { System.out.println("The index has to be betwen " + (personDataBase.size() -
 * 1)); } catch (NumberFormatException exception) {
 * System.out.println("Must inform a integer number"); }
 * 
 * System.out.println("\nPrinting object arrayList after exclusion"); for
 * (Person nickname : personDataBase) { System.out.println("Id: " +
 * nickname.getId() + " - Name: " + nickname.getName()); }
 * 
 * System.out.println("\nUpdate List: (overwrite) " + "\n" +
 * "Inform the new object: id and name:"); Person person01 = new Person(); try {
 * person01.setId(Integer.parseInt(read.enterData("Id...: "))); } catch
 * (IndexOutOfBoundsException exception) {
 * System.out.println("The index has to be betwen " + (personDataBase.size() -
 * 1)); } catch (NumberFormatException exception) {
 * System.out.println("Must inform a integer number"); }
 * person01.setName(read.enterData("Name..: ")); int updateIndex = 0; try {
 * updateIndex = Integer.parseInt(read.
 * enterData("Inform the index of the object do you want to update!"));
 * personDataBase.set(updateIndex, person01); } catch (IndexOutOfBoundsException
 * exception) { System.out.println("The index has to be betwen " +
 * (personDataBase.size() - 1)); } catch (NumberFormatException exception) {
 * System.out.println("Must inform a integer number"); }
 * 
 * for (Person nickname : personDataBase) { System.out.println("Id: " +
 * nickname.getId() + " - Name: " + nickname.getName()); }
 */
