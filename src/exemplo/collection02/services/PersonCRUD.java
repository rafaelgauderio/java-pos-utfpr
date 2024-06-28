package exemplo.collection02.services;

import java.util.ArrayList;
import java.util.List;

import exemplo.collection02.entities.Person;
import exemplo.collection02.util.Read;

public class PersonCRUD {

	private Read read = new Read();
	private List<Person> personDataBase = new ArrayList<Person>();	

	public List<Person> getPersonDataBase() {
		return personDataBase;
	}

	public void insertPerson(Person person) {

		try {
			person.setId(Integer.parseInt(read.enterData("Inform person id and name.\nId..: ")));

		} catch (NumberFormatException nfe) {
			read.enterData("You must inform a integer number!");
		}
		int resultFromDataBase = findPersonById(person.getId());
		if (resultFromDataBase != -1) {
			try {
				person.setId(Integer.parseInt(
						read.enterData("There is already this id on the database. Try a new one diffrent from "
								+ person.getId() + ": ")));
			} catch (NumberFormatException nfe) {
				read.enterData("You must inform a integer number!");
			}
			resultFromDataBase = findPersonById(person.getId());
			while (resultFromDataBase != -1) {
				try {

					person.setId(Integer.parseInt(
							read.enterData("There is also this id on the database. Try a new one diffente from "
									+ person.getId() + ": ")));
				} catch (NumberFormatException nfe) {
					read.enterData("You must inform a integer number! Press <ENTER>...");
				}
				resultFromDataBase = findPersonById(person.getId());
			}
			person.setId(person.getId());
			person.setName(read.enterData("Id accept, inform the name now.\nName..: "));
			personDataBase.add(person);
			System.out.println("Person add with success!");
		} else {
			person.setId(person.getId());
			person.setName(read.enterData("Name..: "));
			personDataBase.add(person);
			System.out.println("Person add with success!");
		}
	}

	public void printAllpersonDataBase() {

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

	public void printOnePerson(int personIndex) {

		System.out.println("\nPersonData\nId: " + personDataBase.get(personIndex).getId() + " - Name: "
				+ personDataBase.get(personIndex).getName());
	}

	public int findPersonById(int personId) {
		int i = 0;
		for (i = 0; i < personDataBase.size(); i++) {
			if (personId == personDataBase.get(i).getId()) {
				return i;
			}
		}
		return -1;
	}

	public void removePersonById(int personIndex) {
		personDataBase.remove(personIndex);
		System.out.println("\nPerson remove with success!");
		System.out.println("\nPrinting object arrayList after exclusion");
		for (Person nickname : personDataBase) {
			System.out.println("Id: " + nickname.getId() + " - Name: " + nickname.getName());
		}
	}

	public void updatePersonById(int personIndex, Person person) {
		personDataBase.set(personIndex, person);
		System.out.println("\nPerson data UPDATE with success");
	}

}
