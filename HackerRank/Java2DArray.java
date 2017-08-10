// CONGRADULATIONS!! THIS HACKER RANK PROBLEMS WORKS PERFECTLY AND PASSES ALL THE TEST CASES.
// Link to the problem: https://www.hackerrank.com/challenges/java-2d-array
// remember you are looking for "hourglass" shape within the 6x6 matrix


// Given a 4x4 two dimensional array(i.e matrix), find the maximum sum 2x2 matrix within it.
import java.util.Scanner;


public class Java2DArray{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[6][6];  // 4x4 matrix
		// get user data:
		//System.out.println("Enter 4x4 matrix, 1 row per line: ");
		for (int row=0; row<6; row++) {
			matrix[row][0] = scan.nextInt();
			matrix[row][1] = scan.nextInt();
			matrix[row][2] = scan.nextInt();
			matrix[row][3] = scan.nextInt();
            matrix[row][4] = scan.nextInt();
            matrix[row][5] = scan.nextInt();
		} // Matrix is full and ready to use

		// find the max sum
		// matrixRow - targetRow
		// matrixCol - targetCol
        // the middle row has only 1 element
		int maxSum=matrix[0][0]+matrix[0][1]+matrix[0][2]+matrix[1][1]+matrix[2][0]+matrix[2][1]+matrix[2][2];
		for (int i=0; i<=6-3; i++) {
			for (int j=0; j<=6-3; j++) {
                int row0= matrix[i][j]+matrix[i][j+1]+matrix[i][j+2];
                // the middle row has only 1 element
                int row1= matrix[i+1][j+1];
				int row2= matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
                int sum = row0+row1+row2;
				maxSum = sum > maxSum ? sum:maxSum; // if sum > maxSum, update maxSum, else don't change maxSum
			}
		}

		// print the matrix
//		System.out.println(" "); // extra space
//		for (int row=0; row<6; row++) {
//			System.out.printf("%d %d %d %d %d %d\n",matrix[row][0], matrix[row][1], matrix[row][2], matrix[row][3],matrix[row][4],matrix[row][5]);	 
//		}


		// print maxSum
		System.out.println(maxSum);
	}
}