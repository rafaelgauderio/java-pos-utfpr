package exemplo.redes.cpf;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Cliente {

	private static Socket socket;
	private static DataInputStream input;
	private static DataOutputStream output;

	public static void main(String[] args) {

		try {

			socket = new Socket("127.0.0.1", 50000);
			input = new DataInputStream(socket.getInputStream());
			output = new DataOutputStream(socket.getOutputStream());

			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Digite um CPF para verificação:");
			Long cpf = Long.parseLong(bufferReader.readLine());		
			output.writeLong(cpf);
					
			String result = input.readUTF();
			System.out.println(result);
			socket.close();

		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}
