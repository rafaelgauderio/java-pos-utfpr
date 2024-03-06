package introducao;

public class StringBuilder01 {

	public static void main(String[] args) {

		System.out.println("Ao invés de ficar contatendo várias String, o que acarreta perda de memória.\n"
				+ "Usar o método append do StringBuilder que adiciona as novas strings no mesmo Objeto StringBuilder(ponteiro).\n"
				+ "Quando não se está usando multi thread o remomendado é usar StringBuilder e não StringBuffer");

		String[] name = { "R", "a", "f", "a", "e", "l", " ", "d", "e", " ", "L", "u", "c", "a" };

		String stringsContatendas = "";
		System.out.println("\nString concatenadas");
		System.out.println(stringsContatendas.isEmpty());
		System.out.println(stringsContatendas.isBlank());

		for (String apelido : name) {
			stringsContatendas = stringsContatendas + apelido;
		}
		System.out.println(stringsContatendas);

		////////////////////////
		System.out.println("\nStringBuilder");
		StringBuilder sBuilder = new StringBuilder();
		System.out.println(sBuilder.toString().isEmpty());
		int i = 0;
		while (name.length > i) {
			sBuilder.append(name[i]);
			i++;
		}
		System.out.println(sBuilder.toString());

		////////////////////////////
		System.out.println("\nStringBuffer");
		String[] nome = new String[3];
		nome[0] = "Camila";
		nome[1] = " ";
		nome[2] = "de Luca";
		StringBuffer sBuffer = new StringBuffer();
		System.out.println(sBuffer.toString().isEmpty());
		for (int j = 0; j < nome.length; j++) {
			sBuffer.append(nome[j]);
		}
		System.out.println(sBuffer);

	}

}
