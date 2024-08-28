package exemplo.generics;

public class ProgramWildCards {

	public static void main(String[] args) {
		
		System.out.println("Argumentos curingas\n"
				+ "\tArgumento curinga é espefificado por um ? e representa um tipo desconhecido.\n");	
		

		NumericsFunctions<Integer> integerObj = new NumericsFunctions<Integer>(7);
		NumericsFunctions<Long> longObj = new NumericsFunctions<Long>(-7L);
		NumericsFunctions<Double> doubleObj = new NumericsFunctions<Double>(7.1);
		NumericsFunctions<Double> doubleObjZero = new NumericsFunctions<Double>(7.0);
		
		// verificar se os valores absolutos são iguais
		integerObj.absoluteEqualsPrint(longObj); // true        7   == -7L
		integerObj.absoluteEqualsPrint(doubleObjZero); //true   7   == 7.0
		integerObj.absoluteEqualsPrint(doubleObj); //false		7   == 7.1
		doubleObj.absoluteEqualsPrint(longObj); // false		7.1 == 7.0
	}

}
