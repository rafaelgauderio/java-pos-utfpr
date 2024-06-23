package introducao;

public class String03 {

	public static void main(String[] args) {

		String nome = "Rafael";
		String nome01 = "Larissa";
		String nome02 = "Rafael";
		String nome03 = new String("Rafael");

		System.out.println(nome == nome01); // false nem mesmo conte�do, nem apontam para o mesmo ponteiro
		System.out.println(nome.equals(nome01));// false

		System.out.println(nome == nome02); // true Strings com o mesmo cote�do ficam armazendas em um cache de Strings
											// para economizar mem�ria
		System.out.println(nome.equals(nome02));// true

		System.out.println("\n" + nome03);
		System.out.println(nome03.equals(nome02)); // true = mesmo conteudo
		System.out.println(nome03 == nome02); // false // s�o ponteiros diferentes
	}

}
