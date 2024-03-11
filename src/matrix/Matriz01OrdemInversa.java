package matrix;

public class Matriz01OrdemInversa {

	public static void main(String[] args) {

		int numberRow = 5, numberColumn = 5, row = 0, column = 0;

		int[][] matrix = new int[numberRow][numberColumn];
		// preenchendo a matriz
		for (int i = 0; i < numberRow; i++) {
			for (int j = 0; j < numberColumn; j++) {
				matrix[i][j] = 3 * (i + 1) + 2 * (j - 1);
			}
		}

		// imprimindo a matriz
		for (int i = numberRow - 1; i >= row; i--) {
			for (int j = numberColumn - 1; j >= column; j--) {
				System.out.print("[" + matrix[i][j] + "]\t");
			}
			// pular uma linha quando mudar de linha
			System.out.println();
		}

	}

}
