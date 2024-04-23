package atividade04.interfaces;

import atividade03.heranca.Passeio;

public class Teste02 {

	private static Passeio[] vetorPasseio = new Passeio[5];
	private static Carga[] vetorCarga = new Carga[5];
	private static Passeio p1 = new Passeio();
	private static Carga c1 = new Carga();
	private static Leitura02 input = new Leitura02();
	private static boolean findPlaca = false;

	public static void main(String[] args) {

		int opcao = 0;

		String placaPasseio = null, placaCarga = null;

		do {
			menuInicial();
			try {
				opcao = Integer.parseInt(input.entradaDados("\n\tEscolha uma das op��es acima: "));
			} catch (NumberFormatException nfe) {
				System.out.println("Voc� deve informar um valor do tipo inteiro");
				input.entradaDados("");
				continue;
			}

			switch (opcao)

			{
			case 1:
				cadastrarVeiculoPasseio(vetorPasseio);
				break;
			case 2:
				cadastrarVeiculoCarga(vetorCarga);
				break;
			case 3:
				imprimirVeiculosPasseio(vetorPasseio);
				break;
			case 4:
				imprimirVeiculosCarga(vetorCarga);
				break;
			case 5:
				imprimirVeiculoPasseioPorPlaca(vetorPasseio, placaPasseio);
				break;
			case 6:
				imprimirVeiculoCargaPorPlaca(vetorCarga, placaCarga);
				break;
			case 7:
				System.out.println("\nSISTEMA ENCERRADO");
				break;
			default:
				System.out.println("\nVoc� informou um op��o diferente de 1 e 7. Tente novamente! ");

			}
		} while (opcao != 7);
	}

	private static void menuInicial() {

		System.out.print("\nSistema de Gest�o de Ve�culos - Menu Inicial" + "\n1. Cadastrar Veiculo de Passeio"
				+ "\n2. Cadastrar Veiculo de Carga" + "\n3. Imprimir Todos os Veiculos de Passeio"
				+ "\n4. Imprimir Todos os Veiculos de Carga" + "\n5. Imprimir Veiculo de Passeio pela Placa"
				+ "\n6. Imprimir Veiculo de Carga pela Placa" + "\n7. Sair do Sistema\n"
				+ "----------------------------------------");

	}

	private static int verificaVetorPasseioIsVazio() {
		for (int i = 0; i < vetorPasseio.length; i++) {
			if (vetorPasseio[i] == null) {
				return i;
			}
		}
		return -1;
	}

	private static int verificaVetorCargaIsVazio() {
		for (int i = 0; i < vetorCarga.length; i++) {
			if (vetorCarga[i] == null) {
				return i;
			}
		}
		return -1;
	}

	private static void cadastrarVeiculoPasseio(Passeio[] vetorPasseio) {
		for (int i = verificaVetorPasseioIsVazio(); i < vetorPasseio.length;) {
			if (i == -1) {
				System.out.println(
						"O vetor de ve�culos de PASSEIO j� est� cheio. N�o tem mais como cadastrar novos ve�culos de passeio!\n");
				break;
			}
			p1 = new Passeio();
			System.out.println("===================CADASTRO DE VE�CULO DE PASSEIO=====================\n"
					+ "Insira os dados e valores solicitados abaixo\n"
					+ "======================================================================");
			String placaTentativa = input.entradaDados("Placa passeio: ");
			for (int index = 0; index < vetorPasseio.length; index++) {
				if (vetorPasseio[index] != null) {
					if (vetorPasseio[index].getPlaca().equalsIgnoreCase(placaTentativa)) {
						System.out.println("==================ATEN��O====================\n"
								+ "J� existe um ve�culo de passeio com a placa: " + placaTentativa
								+ ", informe outra placa!" + "\n=============================================\n");
						break;
					}
				} else {
					p1.setPlaca(placaTentativa);
					p1.setMarca(input.entradaDados("Marca: "));
					p1.setModelo(input.entradaDados("Modelo: "));
					p1.setCor(input.entradaDados("Cor: "));
					p1.setQdtRodas(Integer.parseInt(input.entradaDados("Quantidade de Rodas: ")));
					p1.setQtdPassageiros(Integer.parseInt(input.entradaDados("Capacidade de Passageiros: ")));
					p1.setVelocMax(Integer.parseInt(input.entradaDados("Velocidade M�xima: ")));
					p1.getMotor().setPotencia(Integer.parseInt(input.entradaDados("Pot�ncia de Motor: ")));
					p1.getMotor().setQtdPist(Integer.parseInt(input.entradaDados("Quantidade de Pist�es do Motor: ")));
					vetorPasseio[index] = p1;
					System.out.println("Ve�culo de passeio cadastrado com sucesso!\n");
					break;
				}

			}
			char cadastrar = input.entradaDados("Deseja cadastrar mais um ve�culo de passeio (S/N)? ").charAt(0);
			if (cadastrar == 'S' || cadastrar == 's') {
				cadastrarVeiculoPasseio(vetorPasseio);
				break;
			} else {
				break;
			}
		}

	}

	private static void cadastrarVeiculoCarga(Carga[] vetorCarga) {
		for (int i = verificaVetorCargaIsVazio(); i < vetorCarga.length;) {
			if (i == -1) {
				System.out.println(
						"O vetor de ve�culos de Carga j� est� cheio. N�o tem mais como cadastrar novos ve�culos de carga!\n");
				break;
			}

			c1 = new Carga();
			System.out.println("===================CADASTRO DE VE�CULO DE CARGA=====================\n"
					+ "Insira os dados e valores solicitados abaixo\n"
					+ "======================================================================");
			String placaTentativa = input.entradaDados("Placa carga: ");
			for (int index = 0; index < vetorCarga.length; index++) {
				if (vetorCarga[index] != null) {
					if (vetorCarga[index].getPlaca().equalsIgnoreCase(placaTentativa)) {
						System.out.println("==================ATEN��O====================\n"
								+ "J� existe um ve�culo de carga com a placa: " + placaTentativa
								+ ", informe outra placa!" + "\n=============================================\n");
						break;
					}
				} else {
					c1.setPlaca(placaTentativa);
					c1.setMarca(input.entradaDados("Marca: "));
					c1.setModelo(input.entradaDados("Modelo: "));
					c1.setCor(input.entradaDados("Cor: "));
					c1.setQdtRodas(Integer.parseInt(input.entradaDados("Quantidade de Rodas: ")));
					c1.setVelocMax(Integer.parseInt(input.entradaDados("Velocidade M�xima: ")));
					c1.getMotor().setPotencia(Integer.parseInt(input.entradaDados("Pot�ncia de Motor: ")));
					c1.getMotor().setQtdPist(Integer.parseInt(input.entradaDados("Quantidade de Pist�es do Motor: ")));
					c1.setCargaMax(Integer.parseInt(input.entradaDados("Carga m�xima: ")));					
					c1.setTara(Integer.parseInt(input.entradaDados("Tara: ")));
					vetorCarga[index] = c1;
					System.out.println("Ve�culo de carga cadastrado com sucesso!\n");
					break;
				}

			}
			char cadastrar = 'N';
			cadastrar = input.entradaDados("\"Deseja cadastrar mais um ve�culo de carga (S/N)? \"").charAt(0);
			if (cadastrar == 'S' || cadastrar == 's') {
				cadastrarVeiculoCarga(vetorCarga);
				break;
			} else {
				break;
			}

		}

	}

	private static void imprimirVeiculosPasseio(Passeio[] vetorPasseio) {
		System.out.println("\nImprimindo todos os ve�culos de Passeio");
		int i = 0;
		findPlaca = false;
		for (i = 0; vetorPasseio.length > i; i++) {
			if (vetorPasseio[i] != null) {
				System.out.println("Ve�culo de ind�ce: " + (i + 1) + vetorPasseio[i]);
				findPlaca = true;
			}
		}
		if (!findPlaca) {
			System.out.println("N�o existem ve�culos de PASSEIO cadastrados!\n");
		}

	}

	private static void imprimirVeiculosCarga(Carga[] vetorCarga) {
		System.out.println("\nImprimindo todos os ve�culos de Carga");
		int i = 0;
		boolean empty = true;
		for (i = 0; vetorCarga.length > i; i++) {
			if (vetorCarga[i] != null) {
				System.out.println("Ve�culo de ind�ce: " + (i + 1) + vetorCarga[i]);
				empty = false;
			}
		}
		if (empty) {
			System.out.println("N�o existem ve�culos de CARGA cadastrados!\n");
		}
	}

	private static void imprimirVeiculoPasseioPorPlaca(Passeio[] vetorPasseio, String placaPasseio) {

		placaPasseio = input.entradaDados("\nInforme a placa do ve�culo que deseja pesquisar: ");
		boolean findPlaca = false;
		for (int i = 0; vetorPasseio.length > i; i++) {
			if (vetorPasseio[i] != null) {
				if (vetorPasseio[i].getPlaca().equalsIgnoreCase(placaPasseio)) {
					System.out.print("Segue os dados do ve�culo de PASSEIO da placa: " + placaPasseio);
					System.out.println(vetorPasseio[i]);
					findPlaca = true;
					break;
				}
			}
		}
		if (findPlaca == false) {
			System.out.println("N�o existe ve�culo de PASSEIO com a placa: " + placaPasseio);
		}

	}

	private static void imprimirVeiculoCargaPorPlaca(Carga[] vetorCarga, String placaCarga) {

		placaCarga = input.entradaDados("\nInforme a placa do ve�culo que deseja pesquisar: ");
		findPlaca = false;
		for (int i = 0; vetorCarga.length > i; i++) {
			if (vetorCarga[i] != null) {
				if (vetorCarga[i].getPlaca().equalsIgnoreCase(placaCarga)) {
					System.out.print("Segue os dados do ve�culo de CARGA de placa: " + placaCarga);
					System.out.println(vetorCarga[i]);
					findPlaca = true;
					break;
				}
			}
		}
		if (!findPlaca) {
			System.out.println("N�o existe ve�culo de CARGA com a placa: " + placaCarga);
		}
	}

}
