package introducao;

public class Maths {

	public static void main(String[] args) {

		final double x = 2 * Math.PI / 3;
		double y = 1.34;
		double z = 16;

		// arredondado o valor
		System.out.println("\nSeno de x � " + Math.round(Math.sin(x)));
		System.out.println("Cosseno de x � " + Math.cos(x));
		System.out.println("Tangente de x � " + String.format("%.2f", Math.tan(x)));

		System.out.println("\nM�nimo � entre as vari�veis y e z � " + Math.min(y, z));
		System.out.println("M�ximo � entre as vari�veis y e z � " + Math.max(y, z));

		System.out.println("\nO valor de Phi � " + Math.PI);
		System.out.println("O valor da constante de Euller � " + Math.E);
		System.out.println("O valor de Phi � " + Math.round(Math.PI));
		System.out.println("O valor da constante de Euller arredondado para cima � " + Math.ceil(Math.E));
		System.out.println("O valor da constante de Euller arredondado para baixo � " + Math.floor(Math.E));

		System.out.println("\nO valor absoluto de -17.25 � " + Math.abs(-17.25));
		System.out.println("O raiz quadrada de z � " + Math.sqrt(z));
		System.out.println("O valor de de z elevado ao quadrado � " + Math.pow(z, 2));

	}

}
