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
			System.out.println("5. Remove Person by index");
			System.out.println("6. Update Person by id");
			System.out.println("7. Exit");

			try {
				option = Integer.parseInt(read.enterData("\nChoose an option between 1 and 6: "));
			} catch (NumberFormatException exception) {
				read.enterData("\nThe option must be a integer number. Press <ENTER> to continue...");
				continue; // abandon the sctructure e do annother loop;
			}

			switch (option) {
			case 1:
				System.out.println("\nInsert Person");
				insertPerson(new Person());
				break;
			case 2:
				System.out.println("\nList All Person");
				printAllpersonDataBase();
				break;
			case 3:
				System.out.println("\nConsult Person by id");
				int personId = 0;
				try {
					personId = Integer.parseInt(read.enterData("Inform person Id to print data: "));
				} catch (NumberFormatException nfe) {
					read.enterData("You must inform a integer number!");
				}
				int personIndex = findPersonById(personId);
				if (personIndex == -1) {
					read.enterData("\nNo person with this id on the data base. Press <ENTER> to continue...");
				} else {
					printOnePerson(personIndex);
				}

				break;
			case 4:
				System.out.println("\nRemove Person by id");
				int removePersonId = 0;
				try {
					removePersonId = Integer.parseInt(read.enterData("Inform a Person id to remove person: "));
				} catch (NumberFormatException nfe) {
					read.enterData("You must inform a integer number!");
				}
				int removePersonIndex = findPersonById(removePersonId);
				if (removePersonIndex == -1) {
					read.enterData("\nNo person with this id on the data base. Press <ENTER> to continue...");
				} else {
					removePersonById(removePersonIndex);
				}

				break;
			case 5:
				System.out.println("Removind Person by index:");
				int removedIndex = 0;
				try {
					removedIndex = Integer.parseInt(read.enterData("Inform person index (must be between 0 and "
							+ (personDataBase.size() - 1) + ") to remove: "));
				} catch (NumberFormatException nfe) {
					read.enterData("You must inform a integer number!");
				} catch (IndexOutOfBoundsException iobe) {
					read.enterData("The index must be betwenn 0 and " + (personDataBase.size() - 1));
				}
				if (removedIndex >= 0 && removedIndex <= personDataBase.size() - 1) {
					removePersonById(removedIndex);
				} else {
					read.enterData("Index must be between zero and " + (personDataBase.size() -1 )
							+ ".\nNo person was remove from database. Press <enter>...");
				}
				break;

			case 6:
				System.out.println("\nUpdate Person by id");
				int updatePersonId = 0;
				try {
					updatePersonId = Integer.parseInt(read.enterData("Inform the Person id to update data: "));
				} catch (NumberFormatException nfe) {
					read.enterData("You must inform a integer number!");
				}

				int updatePersonIndex = findPersonById(updatePersonId);
				if (updatePersonIndex == -1) {
					read.enterData("\nNo person with this id on the data base. Press <ENTER> to continue...");
				} else {
					System.out.println("Inform the new person name (the id can not be update):");
					// int newPersonId = Integer.parseInt(read.enterData("Id..: "));
					String newPersonName = read.enterData("Name..: ");
					person = new Person(updatePersonId, newPersonName);
					updatePersonById(updatePersonIndex, person);
				}
				break;
			case 7:
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

	public static void insertPerson(Person person) {

		int personId = 0;
		try {
			Integer.parseInt(read.enterData("Inform person id and name.\nId..: "));
		} catch (NumberFormatException nfe) {
			read.enterData("You must inform a integer number!");
		}
		int resultFromDataBase = findPersonById(personId);
		if (resultFromDataBase != -1) {
			try {
				personId = Integer.parseInt(read.enterData(
						"There is already this id on the database. Try a new one diffrent from " + personId + ": "));
			} catch (NumberFormatException nfe) {
				read.enterData("You must inform a integer number!");
			}
			resultFromDataBase = findPersonById(personId);
			while (resultFromDataBase != -1) {
				try {

					personId = Integer.parseInt(read.enterData(
							"There is also this id on the database. Try a new one diffente from " + personId + ": "));
				} catch (NumberFormatException nfe) {
					read.enterData("You must inform a integer number! Press <ENTER>...");
				}
				resultFromDataBase = findPersonById(personId);
			}
			person.setId(personId);
			person.setName(read.enterData("Id accept, inform the name now.\nName..: "));
			personDataBase.add(person);
			System.out.println("Person add with success!");
		} else {
			person.setId(personId);
			person.setName(read.enterData("Name..: "));
			personDataBase.add(person);
			System.out.println("Person add with success!");
		}
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
		System.out.println("\nPerson remove with success!");
	}

	public static void updatePersonById(int personIndex, Person person) {
		personDataBase.set(personIndex, person);
		System.out.println("\nPerson data UPDATE with success");
	}
}

/*
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
