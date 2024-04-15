package atividade04.interfaces;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int opcao = 0;
		do {			
			menuInicial();
			opcao = input.nextInt();
			
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


}
