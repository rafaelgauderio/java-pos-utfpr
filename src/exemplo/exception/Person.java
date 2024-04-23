package exemplo.exception;

public class Person {

	private int id;
	private String name;

	public Person() {

	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	// throws - aviso: pode lançar um objeto do tipo
	// throw = ordem: lançe um objeto do tipo
	public void setId(int id) throws IdLittleException, IdBigException {
		if (id >= 100) {
			if (id < 1000) {
				this.id = id;
			} else {
				throw new IdBigException();
			}

		} else {
			throw new IdLittleException();
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nPerson [id= " + id + ", name= " + name + "]";
	}

}
