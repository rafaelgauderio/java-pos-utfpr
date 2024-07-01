package atividade05.exception;


public class Teste {

	private static Leitura input = new Leitura();	

	public static void main(String[] args) {

		int opcao = 0;		
		BDVeiculos bdVeiculos = new BDVeiculos();

		do {
			bdVeiculos.menuInicial();
			try {
				opcao = Integer.parseInt(input.entradaDados("\n\tEscolha uma das opções acima: "));
			} catch (NumberFormatException nfe) {
				System.out.println("Você deve informar um valor do tipo inteiro. Pressione <ENTER>...");
				input.entradaDados("");
				continue;
			}

			switch (opcao)

			{
			case 1:
				bdVeiculos.cadastrarVeiculoPasseio(bdVeiculos.getListaPasseio());
				break;
			case 2:
				bdVeiculos.cadastrarVeiculoCarga(bdVeiculos.getListaCarga());				
				break;
			case 3:
				bdVeiculos.imprimirVeiculosPasseio(bdVeiculos.getListaPasseio());			
				break;
			case 4:
				bdVeiculos.imprimirVeiculosCarga(bdVeiculos.getListaCarga());				
				break;
			case 5:
				bdVeiculos.imprimirVeiculoPasseioPorPlaca(bdVeiculos.getListaPasseio(),null);				
				break;
			case 6:
				bdVeiculos.imprimirVeiculoCargaPorPlaca(bdVeiculos.getListaCarga(),null);
				break;
			case 7:
				System.out.println("\nSISTEMA ENCERRADO");
				System.exit(0);
				break;
			default:
				System.out.println("\nVocê informou um opção diferente de 1 e 7. Tente novamente! ");

			}
		} while (opcao != 7);
	}

}
