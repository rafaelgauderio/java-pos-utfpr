package matrix;

import java.util.Scanner;

import entradaDados.Input01;

public class MatrizEnterDataViaConsole {

	public static void main(String[] args) {

		int numberRow = 2, numberColumn = 2, row = 0, column = 0;
		String value = "";
		Scanner input = new Scanner(System.in);

		int[][] matrix = new int[numberRow][numberColumn];
		// preenchendo a matriz
		for (int i = 0; i < numberRow; i++) {
			for (int j = 0; j < numberColumn; j++) {
				System.out.println(
						"Informe o valor para a matrix  na posição de linha: " + (i + 1) + " e coluna: " + (j + 1));
				value = input.nextLine();
				matrix[i][j] = Integer.valueOf(value);
			}
		}

		System.out.println("\nImprimindo a matriz na ordem inversa");
		for (int i = numberRow - 1; i >= row; i--) {
			for (int j = numberColumn - 1; j >= column; j--) {
				System.out.print("[" + matrix[i][j] + "]\t");
			}
			// pular uma linha quando mudar de linha
			System.out.println();
		}
		
		System.out.println("\nImprimindo a matriz na ordem natural");
		for (int i=0; i < numberRow; i++) {
			for (int j = 0; j < numberColumn; j++) {
				System.out.print("[" + matrix[i][j] + "]\t");
			}
			// pular uma linha quando mudar de linha
			System.out.println();
		}
		input.close();
	}

}
