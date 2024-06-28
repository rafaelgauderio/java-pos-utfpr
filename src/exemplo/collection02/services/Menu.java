package exemplo.collection02.services;

import exemplo.collection02.entities.Person;
import exemplo.collection02.util.Read;

public class Menu {

	private Read read = new Read();
	private Person person;
	private PersonCRUD personCRUD = new PersonCRUD();

	public void createMenu() {

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
			System.out.println("7. Update Person (alternative method) by id");
			System.out.println("8. Exit");

			try {
				option = Integer.parseInt(read.enterData("\nChoose an option between 1 and 8: "));
			} catch (NumberFormatException exception) {
				read.enterData("\nThe option must be a integer number. Press <ENTER> to continue...");
				continue; // abandon the sctructure e do annother loop;
			}

			switch (option) {
			case 1:
				System.out.println("\nInsert Person");
				person = new Person();
				personCRUD.insertPerson(person);
				break;
			case 2:
				System.out.println("\nList All Person");
				personCRUD.printAllpersonDataBase();
				break;
			case 3:
				System.out.println("\nConsult Person by id");
				int personId = 0;
				try {
					personId = Integer.parseInt(read.enterData("Inform person Id to print data: "));
				} catch (NumberFormatException nfe) {
					read.enterData("You must inform a integer number!");
				}
				int personIndex = personCRUD.findPersonById(personId);
				if (personIndex == -1) {
					read.enterData("\nNo person with this id on the data base. Press <ENTER> to continue...");
				} else {
					personCRUD.printOnePerson(personIndex);
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
				int removePersonIndex = personCRUD.findPersonById(removePersonId);
				if (removePersonIndex == -1) {
					read.enterData("\nNo person with this id on the data base. Press <ENTER> to continue...");
				} else {
					personCRUD.removePersonById(removePersonIndex);
				}

				break;
			case 5:
				System.out.println("Removind Person by index:");
				int removedIndex = 0;
				try {
					removedIndex = Integer.parseInt(read.enterData("Inform person index (must be between 0 and "
							+ (personCRUD.getPersonDataBase().size() - 1) + ") to remove: "));
				} catch (NumberFormatException nfe) {
					read.enterData("You must inform a integer number!");
				} catch (IndexOutOfBoundsException iobe) {
					read.enterData("The index must be betwenn 0 and " + (personCRUD.getPersonDataBase().size() - 1));
				}
				if (removedIndex >= 0 && removedIndex <= personCRUD.getPersonDataBase().size() - 1) {
					personCRUD.removePersonById(removedIndex);
				} else {
					read.enterData("Index must be between zero and " + (personCRUD.getPersonDataBase().size() - 1)
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

				int updatePersonIndex = personCRUD.findPersonById(updatePersonId);
				if (updatePersonIndex == -1) {
					read.enterData("\nNo person with this id on the data base. Press <ENTER> to continue...");
				} else {
					System.out.println("Inform the new person name (the id can not be update):");
					// int newPersonId = Integer.parseInt(read.enterData("Id..: "));
					String newPersonName = read.enterData("Name..: ");
					person = new Person(updatePersonId, newPersonName);
					personCRUD.updatePersonById(updatePersonIndex, person);
				}
				break;

			case 7:
				System.out.println("\nUpdate Person by id");
				updatePersonId = 0;
				try {
					updatePersonId = Integer.parseInt(read.enterData("Inform the Person id to update data: "));
				} catch (NumberFormatException nfe) {
					read.enterData("You must inform a integer number!");
				}
				updatePersonIndex = personCRUD.findPersonById(updatePersonId);
				if (updatePersonIndex == -1) {
					read.enterData("\nNo person with this id on the data base. Press <ENTER> to continue...");
				} else {
					System.out.println("Inform the new person name (the id can not be update):");
					String newPersonName = read.enterData("Name..: ");
					person = new Person();
					person.setId(updatePersonId);
					person.setName(newPersonName);
					personCRUD.updatePersonById(updatePersonIndex, person);
				}
				break;
			case 8:
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
}
