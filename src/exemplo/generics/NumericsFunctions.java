package exemplo.generics;

// inica que a classe somente pode ser substituida pela superclasse que extends ou subclasses da superClasse
public class NumericsFunctions<T extends Number> {
	
	private T number;
	
	public NumericsFunctions(T number) {
		this.number = number;
	}		
	
	public T getNumber() {
		return number;
	}

	public double inverso() {
		return 1 / number.doubleValue();
	}
	
	public double oposto () {
		return number.doubleValue() * (-1);
	}
	
	public double fraction () {
		return number.doubleValue() / number.intValue();
	}
	

}
