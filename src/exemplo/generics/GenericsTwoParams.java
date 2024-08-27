package exemplo.generics;

public class GenericsTwoParams<T,V> {
	
	private T object01;
	private V object02;
	
	public GenericsTwoParams(T objectT, V objectV) {
		object01 = objectT;
		object02 = objectV;
	}

	public T getObject01() {
		return object01;
	}

	public void setObject01(T object01) {
		this.object01 = object01;
	}

	public V getObject02() {
		return object02;
	}

	public void setObject02(V object02) {
		this.object02 = object02;
	}
	
	public void showTypes () {
		System.out.println("Type of T is " + object01.getClass().getName());
		System.out.println("Type of V is " + object02.getClass().getName());
	}

	@Override
	public String toString() {
		return "GenericsTwoParams [object type T value= " + object01 + ", object type V value = " + object02 + "]";
	}
	
	
	

}
