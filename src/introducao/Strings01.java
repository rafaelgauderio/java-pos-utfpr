package introducao;

public class Strings01 {

	public static void main(String[] args) {

		String[] arrayString = new String[6];

		arrayString[5] = "\n\t\t;-)";
		arrayString[0] = "\t\tBem-vindo, ";
		arrayString[2] = " a programar na linguagem Java.";
		arrayString[4] = " Java na UTFPR.";
		arrayString[1] = " convidamos você a aprender";
		arrayString[3] = "\n\t\tFaça pos-graduação em";

		for (int i = 0; i < arrayString.length; i++) {
			System.out.print(arrayString[i]);
		}

		imprimir(arrayString);
	}

	public static void imprimir(String[] array) {
		System.out.println("\n");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

}
