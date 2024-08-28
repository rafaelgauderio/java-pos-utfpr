package exemplo.generics;

import java.math.BigDecimal;

class Gen<X extends Number> {

	private X object;
	private X[] values;

	public Gen() {
		// n�o pode instantiar o tipo gen�rico
		// this.object = new X();
	}

	public Gen(X object, X[] values) {
		this.object = object;
		this.values = values;

		// n�o � poss�vel instanciar um array to tipo T
		// values = new T[5];
		X[] array;
		// Mas � poss�vel atribuir refer�ncias a array existente
		array = values;
	}
}

class Extern<T> {

	/*
	 * static T object;
	 * 
	 * public static T getObject() { return object; }
	 */
}

public class ProgramGenericsRestrictions {

	public static void main(String[] args) {

		System.out.println("\nRestri��es a tipos Generics.\n" + "\tPar�metros de tipos n�o podem ser instanciados\n"
				+ "\tUm mebrom static n�o pode usar um par�metro do tipo declaro pela classe externa");

		BigDecimal bd = new BigDecimal("17.4");
		Double array[] = { 17.1, 17.2, 17.3, bd.doubleValue() };

		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "] ");
		}

		Gen<Double> objectInteger = new Gen<Double>(50.0, array);

		System.out.println("\nType of generics class");
		System.out.println(objectInteger.getClass().getTypeName());

	}

}
