// CONGRADULATIONS!!! IT WORKS PERFECTLY


// Given a 4x4 two dimensional array(i.e matrix), find the maximum sum 2x2 matrix within it.
import java.util.Scanner;


public class MatrixMaxSum{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[4][4];  // 4x4 matrix
		// get user data:
		System.out.println("Enter 4x4 matrix, 1 row per line: ");
		for (int row=0; row<4; row++) {
			matrix[row][0] = scan.nextInt();
			matrix[row][1] = scan.nextInt();
			matrix[row][2] = scan.nextInt();
			matrix[row][3] = scan.nextInt();
		} // Matrix is full and ready to use

		// find the max sum
		// matrixRow - targetRow
		// matrixCol - targetCol
		int maxSum=0;
		for (int i=0; i<=4-2; i++) {
			for (int j=0; j<=4-2; j++) {
				int sum = matrix[i][j]+matrix[i][j+1]+matrix[i+1][j]+matrix[i+1][j+1];
				maxSum = sum > maxSum ? sum:maxSum; // if sum > maxSum, update maxSum, else don't change maxSum
			}
		}

		// print the matrix
		System.out.println(" "); // extra space
		for (int row=0; row<4; row++) {
			System.out.printf("%d %d %d %d \n",matrix[row][0], matrix[row][1], matrix[row][2], matrix[row][3]);	 
		}


		// print maxSum
		System.out.println("The sum of the maximum 2x2 matrix is: " + maxSum);
	}
}