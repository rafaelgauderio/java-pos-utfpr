package atividade05.prova;

public class TstPoint {

	public static void main(String[] args) {

		Cine cine01 = new Cine();
		Cine cine02 = new Cine();
		Cine cine03 = new Cine();

		cine01.setNome("Paramaunt Cinemas");
		cine02.setNome("Iguate cinemas");
		cine03.setNome("Cine Magestic");

		cine01.getEnder().setRua("Avenida Brasil");
		cine02.getEnder().setRua("Rua Claudio Duarte");
		cine03.getEnder().setRua("Avenida da Legalidade de Porto Alegre");

		try {
			cine01.getEnder().setNum(500);
		} catch (NumException numException) {
			numException.impMsg();
		}

		try {
			cine02.getEnder().setNum(900);
		} catch (NumException numException) {
			numException.impMsg();
		}

		try {
			cine03.getEnder().setNum(1500); // vai disparar exceção e o número vai ficar zerado (valor default)
		} catch (NumException numException) {
			numException.impMsg();
		}

		cine01.getLanche().setValConta(800);
		cine02.getLanche().setValConta(1000);;
		cine03.getLanche().setValConta(2001); // impar
		
		// Impressão de dados
		System.out.println("\nDados cine01");
		System.out.println("Nome do cine01 " + cine01.getNome());
		cine01.validar(); // válido
		System.out.println("Número do prédio do cinema: " + cine01.getEnder().getNum()); //500
		cine01.getLanche().calcVal();; // par		
		cine01.calcVal();  //800 + 10

		System.out.println("\nDados cine02");
		System.out.println("Nome do cine02 " + cine02.getNome());
		cine02.validar();
		System.out.println("Número do prédio do cinema: " + cine02.getEnder().getNum());
		cine02.getLanche().calcVal(); // par
		cine02.calcVal(); // 1000 + 10
		

		System.out.println("\nDados cine03");
		System.out.println("Nome do cine03 " + cine03.getNome());
		cine03.validar();
		System.out.println("Número do prédio do cinema: " + cine03.getEnder().getNum());
		cine03.getLanche().calcVal(); // impar
		cine03.calcVal(); // 2001 + 10
		
		System.out.println("\nOutros testes");		
		Lanche lanche01 = new Lanche ();
		lanche01.setPrato("Feijão com galinha");
		lanche01.setValConta(505);		
		lanche01.validar(); // F
		lanche01.calcVal(); // impar
	}

}
