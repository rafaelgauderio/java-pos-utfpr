package entradaDados;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input01 {

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);

		System.out.println("Informe com valor numérico:");
		String number = "";

		try {
			number = bf.readLine();
		} catch (IOException exception) {
			System.out.println("Erro na entrada de dados");
		}
		System.out.println("O numéro informado foi " + number + ".");

	}

}
