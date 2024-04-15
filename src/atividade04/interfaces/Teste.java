package atividade04.interfaces;

import java.util.Scanner;

import atividade03.heranca.Passeio;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao = 0;

		Passeio[] vetorPasseio = new Passeio[5];

		do {
			try {
				menuInicial();
				opcao = Integer.parseInt(sc.nextLine());
				switch (opcao) {
				case 1:
					cadastrarVeiculoPasseio(vetorPasseio);
					break;
				case 2:
					cadastrarVeiculoCarga();
					break;
				case 3:
					imprimirVeiculosPasseio(vetorPasseio);
					break;
				case 4:
					imprimirVeiculosCarga();
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
					"O vetor de de veículos de passeio já está cheio. Não tem mais como cadastrar veículos novos!\n");
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
								+ "Já existe um veículo de passeio com a placa: " + placaTentativa + ", informe outra placa!"
								+ "\n=============================================\n");
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

	public static void cadastrarVeiculoCarga() {
		System.out.println("\nCadastrando um Veiculo de Carga");
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
			System.out.println("Não existem veículos de passeio cadastrados!\n");
		}

	}

	public static void imprimirVeiculosCarga() {
		System.out.println("\nImprimindo todos os veículos de Carga");
	}

	public static void imprimirVeiculoPasseioPorPlaca() {
		System.out.println("\nImprimindo veículo de passeio por placa");
	}

	public static void imprimirVeiculoCargaPorPlaca() {
		System.out.println("\nImprimindo veículo de carga por placa");
	}

}
