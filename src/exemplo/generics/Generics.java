package exemplo.generics;

public class Generics <T>{
	
	private T object;
	
	Generics (T object) {
		this.object = object ;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
	public void showType () {
		System.out.println("Type of T is " + object.getClass().getName());
	}
	

}
