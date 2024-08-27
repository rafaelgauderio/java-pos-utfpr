package exemplo.generics;

public class ProgramWildCards {

	public static void main(String[] args) {
		
		System.out.println("Argumentos curingas\n"
				+ "\tArgumento curinga é espefificado por um ? e representa um tipo desconhecido.\n");	
		

		NumericsFunctions<Integer> integerObj = new NumericsFunctions<Integer>(7);
		NumericsFunctions<Long> longObj = new NumericsFunctions<Long>(-7L);
		NumericsFunctions<Double> doubleObj = new NumericsFunctions<Double>(7.1);
		NumericsFunctions<Double> doubleObjZero = new NumericsFunctions<Double>(7.0);
		
		integerObj.absoluteEqualsPrint(longObj); // true
		integerObj.absoluteEqualsPrint(doubleObjZero); //true
		integerObj.absoluteEqualsPrint(doubleObj); //false		
		doubleObj.absoluteEqualsPrint(longObj); // false
		
		
	}

}
