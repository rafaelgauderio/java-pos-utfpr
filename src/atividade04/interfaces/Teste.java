package atividade04.interfaces;

import java.util.Scanner;

import atividade03.heranca.Passeio;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao = 0;

		Passeio[] vetorPasseio = new Passeio[5];
		Carga[] vetorCarga = new Carga[5];

		do {
			try {
				menuInicial();
				opcao = Integer.parseInt(sc.nextLine());
				switch (opcao) {
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
					imprimirVeiculoPasseioPorPlaca();
					break;
				case 6:
					imprimirVeiculoCargaPorPlaca();
					break;
				case 7:
					System.out.println("\nSISTEMA ENCERRADO");
					break;
				default:
					System.out.println("\nVocê informou um opção diferente de 1 e 7");
				}

			} catch (NumberFormatException exception) {
				System.out.println("Erro. Informar um número inteiro entre 1  e 7");
				exception.printStackTrace();
			}

		} while (opcao != 7);

		sc.close();

	}

	public static void menuInicial() {

		System.out.print("\nSistema de Gestão de Veículos - Menu Inicial" + "\n1. Cadastrar Veiculo de Passeio"
				+ "\n2. Cadastrar Veiculo de Carga" + "\n3. Imprimir Todos os Veiculos de Passeio"
				+ "\n4. Imprimir Todos os Veiculos de Carga" + "\n5. Imprimir Veiculo de Passeio pela Placa"
				+ "\n6. Imprimir Veiculo de Carga pela Placa" + "\n7. Sair do Sistema\n\n"
				+ "----------------------------------------" + "\nDigite um das opcoes acima: ");

	}

	public static void cadastrarVeiculoPasseio(Passeio[] vetorPasseio) {

		if (vetorPasseio[4] != null) {
			System.out.println(
					"O vetor de veículos de PASSEIO já está cheio. Não tem mais como cadastrar novos veículos de passeio!\n");
		} else {
			Scanner input = new Scanner(System.in);
			Passeio p1 = new Passeio();
			System.out.println("===================CADASTRO DE VEÍCULO DE PASSEIO=====================\n"
					+ "Insira os dados e valores solicitados abaixo\n"
					+ "======================================================================");
			System.out.print("Placa: ");
			String placaTentativa = input.nextLine();
			for (int index = 0; vetorPasseio.length > index; index++) {
				if (vetorPasseio[index] != null) {
					if (vetorPasseio[index].getPlaca().equalsIgnoreCase(placaTentativa)) {
						System.out.println("==================ATENÇÃO====================\n"
								+ "Já existe um veículo de passeio com a placa: " + placaTentativa
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
					System.out.print("Velocidade Máxima: ");
					p1.setVelocMax(input.nextFloat());
					System.out.print("Potência de Motor: ");
					p1.getMotor().setPotencia(input.nextInt());
					System.out.print("Quantidade de Pistões do Motor: ");
					p1.getMotor().setQtdPist(input.nextInt());
					// System.out.println(p1);

					vetorPasseio[index] = p1;
					System.out.println("Veículo de passeio cadastrado com sucesso!\n");
					break;
				}

			}

			System.out.print("Deseja cadastrar mais um veículo de passeio (S / N)? ");
			char cadastrar = 'N';
			cadastrar = input.next().charAt(0);
			if (cadastrar == 'S' || cadastrar == 's') {
				cadastrarVeiculoPasseio(vetorPasseio);
			}

		}

	}

	public static void cadastrarVeiculoCarga(Carga[] vetorCarga) {
		if (vetorCarga[4] != null) {
			System.out.println(
					"O vetor de veículos de CARGA já está cheio. Não tem mais como cadastrar novos veículos de carga!\n");
		} else {
			Scanner input = new Scanner(System.in);
			Carga c1 = new Carga();
			System.out.println("===================CADASTRO DE VEÍCULO DE CARGA=====================\n"
					+ "Insira os dados e valores solicitados abaixo\n"
					+ "======================================================================");
			System.out.print("Placa: ");
			String placaTentativa = input.nextLine();
			for (int index = 0; vetorCarga.length > index; index++) {
				if (vetorCarga[index] != null) {
					if (vetorCarga[index].getPlaca().equalsIgnoreCase(placaTentativa)) {
						System.out.println("==================ATENÇÃO====================\n"
								+ "Já existe um veículo de carga com a placa: " + placaTentativa
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
					System.out.print("Carga Máxima: ");
					c1.setCargaMax(input.nextInt());
					System.out.print("Tara: ");
					c1.setTara(input.nextInt());
					System.out.print("Velocidade Máxima: ");
					c1.setVelocMax(input.nextFloat());
					System.out.print("Potência de Motor: ");
					c1.getMotor().setPotencia(input.nextInt());
					System.out.print("Quantidade de Pistões do Motor: ");
					c1.getMotor().setQtdPist(input.nextInt());
					vetorCarga[index] = c1;
					System.out.println("Veículo de carga cadastrado com sucesso!\n");
					break;
				}

			}

			System.out.print("Deseja cadastrar mais um veículo de carga (S / N)? ");
			char cadastrar = 'N';
			cadastrar = input.next().charAt(0);
			if (cadastrar == 'S' || cadastrar == 's') {
				cadastrarVeiculoCarga(vetorCarga);
			}

		}

	}

	public static void imprimirVeiculosPasseio(Passeio[] vetorPasseio) {
		System.out.println("\nImprimindo todos os veículos de Passeio");
		int i = 0;
		boolean empty = true;
		for (i = 0; vetorPasseio.length > i; i++) {
			if (vetorPasseio[i] != null) {
				System.out.println("\nVeículo de indíce: " + (i + 1) + vetorPasseio[i]);
				empty = false;
			}
		}
		if (empty == true) {
			System.out.println("Não existem veículos de PASSEIO cadastrados!\n");
		}

	}

	public static void imprimirVeiculosCarga(Carga[] vetorCarga) {
		System.out.println("\nImprimindo todos os veículos de Carga");
		int i=0;
		boolean empty = true;		
		for (i= 0; vetorCarga.length > i; i++) {
			if (vetorCarga[i] != null) {
				System.out.println("\nVeículo de indíce: " + (i + 1) + vetorCarga[i]);
				empty = false;
			}
		}
		if (empty) {
			System.out.println("Não existem veículos de CARGA cadastrados!\n");
		}
	}

	public static void imprimirVeiculoPasseioPorPlaca() {
		System.out.println("\nImprimindo veículo de passeio por placa");
	}

	public static void imprimirVeiculoCargaPorPlaca() {
		System.out.println("\nImprimindo veículo de carga por placa");
	}

}
