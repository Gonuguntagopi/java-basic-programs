package javabasicprograms;

public class TransposeMatrixthreefour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] originalMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] transposeMatrix = new int[3][3];
		// Transposing the matrix
		for (int i = 0; i < originalMatrix.length; i++) {
		for (int j = 0; j < originalMatrix[i].length; j++) {
		transposeMatrix[j][i] = originalMatrix[i][j];
		}
		}
		// Displaying the transpose matrix
		for (int[] row : transposeMatrix) {
		for (int num : row) {
		System.out.print(num + " ");
		}
		System.out.println();
		}
		}
		}
		
