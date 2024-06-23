package atividade04.interfaces;

public class Teste {

	public static void main(String[] args) {

		Leitura leitura = new Leitura();
		try {
			leitura.entDados(null);
		} catch (NumberFormatException error) {
			System.out.println(error.getMessage());
			error.printStackTrace();
		}

	}
}
