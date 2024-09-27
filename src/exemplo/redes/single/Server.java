package exemplo.redes.single;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private static Socket socket;
	private static ServerSocket serverSocket;

	private static DataInputStream input;
	private static DataOutputStream output;

	public static void main(String[] args) {

		// create reception port
		try {
			serverSocket = new ServerSocket(5000);
			socket = serverSocket.accept();

			// create input and output data flow
			input = new DataInputStream(socket.getInputStream());
			output = new DataOutputStream(socket.getOutputStream());
			System.out.println("Server online");

			// receive integer number
			Integer value = input.readInt();

			System.out.println("\nThe integer inform was " + value);
			// processind data
			String result = "";
			if (value > 0) {
				result = "You have inform a POSITIVE value!";

			} else if (value < 0) {
				result = "You have inform a NEGATIVE value!";
			} else {
				result = "You hava inform ZERO!";
			}

			// send output data
			output.writeUTF(result);
			socket.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
