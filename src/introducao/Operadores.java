package introducao;

public class Operadores {

	public static void main(String[] args) {

		int dividendo = 13, divisor = 3;
		int resto = dividendo % divisor;
		int quociente = dividendo / divisor;
		System.out.println("dividendo = " + dividendo);
		System.out.println("dividendo = " + divisor);
		System.out.println("quociente = " + dividendo / divisor);
		System.out.println("resto = " + dividendo % divisor);

		if (resto == 0) {
			System.out.println("� divis�vel");
		} else if (resto != 0) {
			System.out.println("N�o � disis�vel");
		}

		System.out.println("\nVeficiar Operadores AND e OR");
		verificarPar(dividendo, divisor, quociente);

		quociente = 5;
		verificarPar(dividendo, divisor, quociente);

		dividendo = 12;
		divisor = 2;
		quociente = dividendo / divisor;
		verificarPar(dividendo, divisor, quociente);

	}

	public static void verificarPar(int dividendo, int divisor, int quociente) {
		if (dividendo % 2 == 0 && divisor % 2 == 0 && quociente % 2 == 0) {
			System.out.println("Todos s�o pares");
		} else if (dividendo % 2 == 0 || divisor == 0 || quociente % 2 == 0) {
			System.out.println("Pelo menos um � par");
		} else {
			System.out.println("Nenhum � par");
		}
	}

}
