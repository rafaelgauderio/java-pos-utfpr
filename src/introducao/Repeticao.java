package introducao;

public class Repeticao {

	public static void main(String[] args) {

		System.out.println("\nfor");
		for (int a = 0, b = 20; a <= b; a++) {
			System.out.println(a);
		}

		Double decimal = Double.valueOf(4.0);
		System.out.println("\nIncremento");
		for (decimal++; decimal < 6.0; decimal = decimal + 0.1) {
			System.out.println(String.format("%.1f", decimal));
		}

		System.out.println("\nwhile");
		int x = 0, y = 15;
		while (x <= 15) {
			System.out.println(x);
			x++; // x = x +1;
		}

		System.out.println("\ndo" + "\nEntra pelo menos uma vez no laço");
		x = 0;
		do {

			System.out.println(x);
			x = x + 2;
		} while (x < y);

		System.out.println("\nfor each");
		int[] inteiros = new int[4];
		inteiros[0] = 10;
		inteiros[1] = 20;
		inteiros[2] = 30;
		inteiros[3] = 40;

		for (int apelido : inteiros) {
			System.out.println(apelido);
		}

		System.out.println("\nIncremento e decremento");
		int a = 5;
		int b = ++a; // a = a +1 e depois b = a;
		System.out.println("Incrementar primeiro e depois guardar na variável b");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		a = 5;
		b = a++; // b = a e depois a = a +1
		System.out.println("Primeiro guarda na variável e depois incrementa. Não vai guardar na variável o incremento");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		System.out.println("\nDecremento");
		for (int w = 0, z = -10; w >= z; w = (w - 2)) {
			System.out.println(w);
		}

	}

}
