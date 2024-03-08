package entradaDados;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input02 {

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);

		boolean repeatLoop = true;
		String value = "";
		int integer = 0;

		while (repeatLoop == true) {

			System.out.println("Informe com valor num�rico inteiro:");
			try {
				value = bf.readLine();
				integer = Integer.parseInt(value);
				// s� imprimir na tela se o valor foi capturado e convertido para inteiro com
				// sucesso.
				System.out.println("O num�ro informado foi " + integer + ".");
				// se imprimir na tela com sucesso sai do la�o de repeti��o
				repeatLoop = false;

			} catch (IOException exception) {
				System.out.println("Erro na entrada de dados");
			} catch (NumberFormatException numberFormatException) {

			}

		}

	}

}
