package atividade04.interfaces;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int opcao = 0;

		do {
			try {
				menuInicial();
				opcao = Integer.parseInt(input.nextLine());
				switch (opcao) {
				case 1:
					cadastrarVeiculoPasseio();
					break;
				case 2:
					cadastrarVeiculoCarga();
					break;
				case 3:
					imprimirVeiculosPasseio();
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

		input.close();

	}

	public static void menuInicial() {

		System.out.print("Sistema de Gestão de Veículos - Menu Inicial" + "\n1. Cadastrar Veiculo de Passeio"
				+ "\n2. Cadastrar Veiculo de Carga" + "\n3. Imprimir Todos os Veiculos de Passeio"
				+ "\n4. Imprimir Todos os Veiculos de Carga" + "\n5. Imprimir Veiculo de Passeio pela Placa"
				+ "\n6. Imprimir Veiculo de Carga pela Placa" + "\n7. Sair do Sistema\n\n"
				+ "----------------------------------------" + "\nDigite um das opcoes acima: ");

	}

	public static void cadastrarVeiculoPasseio() {
		System.out.println("\nCadastrando um veículo passeio");
	}

	public static void cadastrarVeiculoCarga() {
		System.out.println("\nCadastrando um Veiculo de Carga");
	}

	public static void imprimirVeiculosPasseio() {
		System.out.println("\nImprimindo todos os veículos de Passeio");
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
