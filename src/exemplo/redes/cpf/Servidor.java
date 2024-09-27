package exemplo.redes.cpf;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	private static Socket socket;
	private static ServerSocket serverSocket;

	private static DataInputStream input;
	private static DataOutputStream output;

	public static void main(String[] args) {

		try {
			serverSocket = new ServerSocket(50000);
			socket = serverSocket.accept();

			input = new DataInputStream(socket.getInputStream());
			output = new DataOutputStream(socket.getOutputStream());

			Long cpf = input.readLong();
			System.out.println(cpf);
			String stringCpf = Long.toString(cpf);				
			int[] CpfArray = convertToArray(stringCpf);
			String result = "";
			if (validaCPF(1, CpfArray)==true) {
				result = "Este CPF é valido.";
			} else {
				result = "Este CPF é inválido.";
			}

			output.writeUTF(result);
			socket.close();

		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

	public static int[] convertToArray(String cpf) {
		
		int[] vectorCPF = new int[11];
		for (int i = 0; i <= 10; i++) {
			vectorCPF[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
		}
		return vectorCPF;
	}

	public static boolean validaCPF(int codePosition, int[] cpfArray) {

		int j = 0;
		if (codePosition == 1) {
			j = 10;
		} else {
			j = 11;
		}

		int indexParameter = 7 + codePosition;

		int resultado = 0;
		for (int i = 0; i <= indexParameter; i++) {
			resultado += j * cpfArray[i];
			j--;
		}

		int restoDiv = resultado % 11;
		if (restoDiv < 2) {
			if (cpfArray[indexParameter + 1] == 0) {
				if (codePosition == 1) {
					return validaCPF(2, cpfArray);
				} else {
					return true;
				}
			} else {
				return false;
			}
		} else {
			int dif = 11 - restoDiv;
			if (cpfArray[indexParameter + 1] == dif) {
				if (codePosition == 1) {
					return validaCPF(2, cpfArray);
				} else {
					return true;
				}
			} else {
				return false;
			}
		}
	}

}
