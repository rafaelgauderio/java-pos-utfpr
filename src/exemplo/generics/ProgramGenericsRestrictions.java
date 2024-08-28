package exemplo.generics;

import java.math.BigDecimal;

class Gen<X extends Number> {

	private X object;
	private X[] values;

	public Gen() {
		// não pode instantiar o tipo genérico
		// this.object = new X();
	}

	public Gen(X object, X[] values) {
		this.object = object;
		this.values = values;

		// não é possível instanciar um array to tipo T
		// values = new T[5];
		X[] array;
		// Mas é possível atribuir referências a array existente
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

		System.out.println("\nRestrições a tipos Generics.\n" + "\tParâmetros de tipos não podem ser instanciados\n"
				+ "\tUm mebrom static não pode usar um parâmetro do tipo declaro pela classe externa");

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
