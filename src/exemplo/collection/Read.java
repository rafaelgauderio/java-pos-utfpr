package exemplo.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {

	public String enterData(String label) {
		System.out.print(label);
		String ret = "";
		InputStreamReader keyboard = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(keyboard);

		try {
			ret = buffer.readLine();
		} catch (IOException exception) {
			System.out.println("Erro de leitura de dados");
		}
		return ret;

	}

}
