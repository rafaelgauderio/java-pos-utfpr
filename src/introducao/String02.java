package introducao;

public class String02 {

	public static void main(String[] args) {

		String frase = "Iniciando a pós-graduação em Java.";
		String frase02 = "          Iniciando a pós-graduação em Java.             ";

		byte size = (byte) frase.length();
		System.out.println("\nO tamanho da frase é " + size);

		System.out.println("\nMaiúsculas");
		System.out.println(frase.toUpperCase());

		System.out.println("\nMinúsculas");
		System.out.println(frase.toLowerCase());

		System.out.println("\nLetra na posição 01");
		System.out.println(frase.charAt(0));

		System.out.println("\nLetra na posição 21");
		System.out.println(frase.charAt(20));

		System.out.println("\nSubstring Java. Inicial é inclusive e final exclusive");
		System.out.println(frase.substring(29, 33));

		System.out.println("\nPrimeira vez que encontrou a letra P");
		System.out.println(frase.indexOf('p'));

		System.out.println("\nQuando não encontra o caracter retorna -1");
		System.out.println(frase.indexOf('x'));
		
		System.out.println("\n\nTrocando caracteres");
		System.out.println(frase.replace("Java","Inteligência artificial"));
		System.out.println(frase.replace('a', 'e'));
		
		System.out.println("\nRemovendo espaços em branco no começo e no fim");
		System.out.println(frase02);
		System.out.println(frase02.length());
		System.out.println(frase02.trim());
		System.out.println(frase02.trim().length());
	}

}
