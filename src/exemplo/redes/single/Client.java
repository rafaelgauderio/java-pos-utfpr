package exemplo.redes.single;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	private static Socket socket;
	private static DataInputStream input;
	private static DataOutputStream output;

	public static void main(String[] args) {

		try {
			socket = new Socket("127.0.0.1", 5000);
			input = new DataInputStream(socket.getInputStream());
			output = new DataOutputStream(socket.getOutputStream());

			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\nInform a integer value");
			String inform = "";
			try {
				inform = bufferReader.readLine();
				int value = Integer.parseInt(inform);
				// send value to Server
				output.writeInt(value);
				// receive the value of the server
				String result = input.readUTF();
				// print result
				System.out.println(result);
				// close connection
				socket.close();
			} catch (NumberFormatException nfe) {
				System.out.println("\nYou did not inform a integer value.");
				nfe.printStackTrace();
			}

		} catch (IOException exception) {
			exception.printStackTrace();
		}

		// user inform a integer value

	}

}
