package atividade04.interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura02 {

	public String entradaDados(String rotulo) {

		System.out.println(rotulo);
		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(teclado);

		String retorno = "";

		try {
			retorno = buffer.readLine();

		} catch (IOException ioe) {
			System.out.println("\nErro de entrada de dados.");
		}

		return retorno;

	}

}
