package exemplo.generics;

public class ProgramGenericMethod {

	public static <X extends Comparable<X>, Y extends X> boolean verifyArrayIsEquals(X[] x, Y[] y) {

		if (x.length != y.length) {
			return false;
		}
		for (int i = 0; i < x.length; i++) {
			if (x[i].equals(y[i]) == false) {
				return false;
			}
		}
		return true;
	}

	public static <X extends Comparable<X>, Y extends X> void printVerificationArrayEquals(X[] x, Y[] y) {
		if (verifyArrayIsEquals(x, y)) {
			System.out.println("Arrays are equals");
		} else {
			System.out.println("Arrays are different in size or values or both");
		}
	}

	public static void main(String[] args) {

		Double[] array1 = { 2.1, 2.2, 2.3, 2.4 };
		Double[] array2 = { 2.1, 2.2, 2.3, 2.4 };
		Double[] array3 = { 2.1, 2.2, 2.3, 2.5 };
		Double[] array4 = { 2.1, 2.2, 2.3, 2.4, 2.5, 2.6 };
		Double[] array5 = { 2.1, 2.2, 2.3, 2.4, 2.5, 2.60 };
		Integer[] arrayInt = { 1, 2, 3, 4 };

		printVerificationArrayEquals(array1, array2); // equals
		printVerificationArrayEquals(array1, array3); // not equals
		printVerificationArrayEquals(array1, array4); // not equals
		printVerificationArrayEquals(array4, array5); // equals

		// não consegue comparar um array de Double com um de Integer
		// printVerificationArrayEquals(array1, arrayInt);

	}

}
