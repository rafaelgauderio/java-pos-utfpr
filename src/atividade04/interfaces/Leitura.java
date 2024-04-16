package atividade04.interfaces;

import java.util.Scanner;

import atividade03.heranca.Passeio;

public class Leitura {

	Scanner input = new Scanner(System.in);

	int opcao = 0;
	String placaPasseio = null, placaCarga = null;

	Passeio[] vetorPasseio = new Passeio[5];
	Carga[] vetorCarga = new Carga[5];

	public String entDados(String opcao) {

		do {
			menuInicial();
			opcao = input.nextLine();
			switch (opcao)

			{
			case "1":
				cadastrarVeiculoPasseio(vetorPasseio);
				break;
			case "2":
				cadastrarVeiculoCarga(vetorCarga);
				break;
			case "3":
				imprimirVeiculosPasseio(vetorPasseio);
				break;
			case "4":
				imprimirVeiculosCarga(vetorCarga);
				break;
			case "5":
				imprimirVeiculoPasseioPorPlaca(vetorPasseio, placaPasseio);
				break;
			case "6":
				imprimirVeiculoCargaPorPlaca(vetorCarga, placaCarga);
				break;
			case "7":
				System.out.println("\nSISTEMA ENCERRADO");
				break;
			default:
				System.out.println("\nVoc� informou um op��o diferente de 1 e 7. Tente novamente! ");

			}

		} while (!opcao.equalsIgnoreCase("7"));
		return opcao;
	}

	private void menuInicial() {

		System.out.print("\nSistema de Gest�o de Ve�culos - Menu Inicial" + "\n1. Cadastrar Veiculo de Passeio"
				+ "\n2. Cadastrar Veiculo de Carga" + "\n3. Imprimir Todos os Veiculos de Passeio"
				+ "\n4. Imprimir Todos os Veiculos de Carga" + "\n5. Imprimir Veiculo de Passeio pela Placa"
				+ "\n6. Imprimir Veiculo de Carga pela Placa" + "\n7. Sair do Sistema\n"
				+ "----------------------------------------" + "\nDigite um das opcoes acima: ");

	}

	private void cadastrarVeiculoPasseio(Passeio[] vetorPasseio) {

		if (vetorPasseio[4] != null) {
			System.out.println(
					"O vetor de ve�culos de PASSEIO j� est� cheio. N�o tem mais como cadastrar novos ve�culos de passeio!\n");
		} else {
			Passeio p1 = new Passeio();
			System.out.println("===================CADASTRO DE VE�CULO DE PASSEIO=====================\n"
					+ "Insira os dados e valores solicitados abaixo\n"
					+ "======================================================================");
			System.out.print("Placa: ");
			String placaTentativa = input.nextLine();
			for (int index = 0; vetorPasseio.length > index; index++) {
				if (vetorPasseio[index] != null) {
					if (vetorPasseio[index].getPlaca().equalsIgnoreCase(placaTentativa)) {
						System.out.println("==================ATEN��O====================\n"
								+ "J� existe um ve�culo de passeio com a placa: " + placaTentativa
								+ ", informe outra placa!" + "\n=============================================\n");
						break;
					}
				} else {
					p1.setPlaca(placaTentativa);
					System.out.print("Marca: ");
					p1.setMarca(input.nextLine());
					System.out.print("Modelo: ");
					p1.setModelo(input.nextLine());
					System.out.print("Cor: ");
					p1.setCor(input.nextLine());
					System.out.print("Quantidade de Rodas: ");
					p1.setQdtRodas(input.nextInt());
					System.out.print("Capacidade de Passageiros: ");
					p1.setQtdPassageiros(input.nextInt());
					System.out.print("Velocidade M�xima: ");
					p1.setVelocMax(input.nextFloat());
					System.out.print("Pot�ncia de Motor: ");
					p1.getMotor().setPotencia(input.nextInt());
					System.out.print("Quantidade de Pist�es do Motor: ");
					p1.getMotor().setQtdPist(input.nextInt());
					// System.out.println(p1);

					vetorPasseio[index] = p1;
					System.out.println("Ve�culo de passeio cadastrado com sucesso!\n");
					break;
				}

			}

			System.out.print("Deseja cadastrar mais um ve�culo de passeio (S/N)? ");
			char cadastrar = 'N';
			cadastrar = input.next().charAt(0);
			if (cadastrar == 'S' || cadastrar == 's') {
				cadastrarVeiculoPasseio(vetorPasseio);
			}

		}

	}

	private void cadastrarVeiculoCarga(Carga[] vetorCarga) {
		if (vetorCarga[4] != null) {
			System.out.println(
					"O vetor de ve�culos de CARGA j� est� cheio. N�o tem mais como cadastrar novos ve�culos de carga!\n");
		} else {

			Carga c1 = new Carga();
			System.out.println("===================CADASTRO DE VE�CULO DE CARGA=====================\n"
					+ "Insira os dados e valores solicitados abaixo\n"
					+ "======================================================================");
			System.out.print("Placa: ");
			String placaTentativa = input.nextLine();
			for (int index = 0; vetorCarga.length > index; index++) {
				if (vetorCarga[index] != null) {
					if (vetorCarga[index].getPlaca().equalsIgnoreCase(placaTentativa)) {
						System.out.println("==================ATEN��O====================\n"
								+ "J� existe um ve�culo de carga com a placa: " + placaTentativa
								+ ", informe outra placa!" + "\n=============================================\n");
						break;
					}
				} else {
					c1.setPlaca(placaTentativa);
					System.out.print("Marca: ");
					c1.setMarca(input.nextLine());
					System.out.print("Modelo: ");
					c1.setModelo(input.nextLine());
					System.out.print("Cor: ");
					c1.setCor(input.nextLine());
					System.out.print("Quantidade de Rodas: ");
					c1.setQdtRodas(input.nextInt());
					System.out.print("Carga M�xima: ");
					c1.setCargaMax(input.nextInt());
					System.out.print("Tara: ");
					c1.setTara(input.nextInt());
					System.out.print("Velocidade M�xima: ");
					c1.setVelocMax(input.nextFloat());
					System.out.print("Pot�ncia de Motor: ");
					c1.getMotor().setPotencia(input.nextInt());
					System.out.print("Quantidade de Pist�es do Motor: ");
					c1.getMotor().setQtdPist(input.nextInt());
					vetorCarga[index] = c1;
					System.out.println("Ve�culo de carga cadastrado com sucesso!\n");
					break;
				}

			}

			System.out.print("Deseja cadastrar mais um ve�culo de carga (S/N)? ");
			char cadastrar = 'N';
			cadastrar = input.next().charAt(0);
			if (cadastrar == 'S' || cadastrar == 's') {
				cadastrarVeiculoCarga(vetorCarga);
			}

		}

	}

	private void imprimirVeiculosPasseio(Passeio[] vetorPasseio) {
		System.out.println("\nImprimindo todos os ve�culos de Passeio");
		int i = 0;
		boolean empty = true;
		for (i = 0; vetorPasseio.length > i; i++) {
			if (vetorPasseio[i] != null) {
				System.out.println("Ve�culo de ind�ce: " + (i + 1) + vetorPasseio[i]);
				empty = false;
			}
		}
		if (empty == true) {
			System.out.println("N�o existem ve�culos de PASSEIO cadastrados!\n");
		}

	}

	private void imprimirVeiculosCarga(Carga[] vetorCarga) {
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

	private void imprimirVeiculoPasseioPorPlaca(Passeio[] vetorPasseio, String placaPasseio) {

		System.out.print("\nInforme a placa do ve�culo que deseja pesquisar: ");
		placaPasseio = input.nextLine();
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

	private void imprimirVeiculoCargaPorPlaca(Carga[] vetorCarga, String placaCarga) {

		System.out.print("\nInforme a placa do ve�culo que deseja pesquisar: ");
		placaCarga = input.nextLine();
		boolean findPlaca = false;
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
		if (findPlaca == false) {
			System.out.println("N�o existe ve�culo de CARGA com a placa: " + placaCarga);
		}
	}

}
