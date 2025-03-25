package javabasicprograms;

public class Matrixaddationthreefive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		int[][] result = new int[3][3];
		// Matrix addition
		for (int i = 0; i < matrix1.length; i++) {
		for (int j = 0; j < matrix1[i].length; j++) {
		result[i][j] = matrix1[i][j] + matrix2[i][j];
		}
		}
		// Displaying the result matrix
		for (int[] row : result) {
		for (int num : row) {
		System.out.print(num + "   ");
		}
		System.out.println();
		}
		}
		}
		 