package introducao;

public class Maths {

	public static void main(String[] args) {

		final double x = 2 * Math.PI / 3;
		double y = 1.34;
		double z = 16;

		// arredondado o valor
		System.out.println("\nSeno de x é " + Math.round(Math.sin(x)));
		System.out.println("Cosseno de x é " + Math.cos(x));
		System.out.println("Tangente de x é " + String.format("%.2f", Math.tan(x)));

		System.out.println("\nMínimo é entre as variáveis y e z é " + Math.min(y, z));
		System.out.println("Máximo é entre as variáveis y e z é " + Math.max(y, z));

		System.out.println("\nO valor de Phi é " + Math.PI);
		System.out.println("O valor da constante de Euller é " + Math.E);
		System.out.println("O valor de Phi é " + Math.round(Math.PI));
		System.out.println("O valor da constante de Euller arredondado para cima é " + Math.ceil(Math.E));
		System.out.println("O valor da constante de Euller arredondado para baixo é " + Math.floor(Math.E));

		System.out.println("\nO valor absoluto de -17.25 é " + Math.abs(-17.25));
		System.out.println("O raiz quadrada de z é " + Math.sqrt(z));
		System.out.println("O valor de de z elevado ao quadrado é " + Math.pow(z, 2));

	}

}
