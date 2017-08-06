/* Given a 3x3 matrix, rotate it 90 degress counter-clockwise
	? how to insert matrix?

	NOTE: This solution is O(1) since we are always rotating a 3x3 matrix. How about when 
	we deal with NxN matrix ?
*/
import java.util.Scanner;

public class RotateMatrix{

	// rotate the matrix 90 degrees counter-clockwise
	int[][] rotateMatrix90(int[][] arr){
		int[][] rotatedArray = new int[3][3];
		int[] row0 = new int[3];
		int[] row1 = new int[3];
		int[] row2 = new int[3];

		// row 1 of rotated matrix
		for (int i=0; i<3; i++) {
			row0[i] = arr[i][2];
		}
		// row 2 of rotated matrix
		for (int i=0; i<3; i++) {
			row1[i] = arr[i][1];
		}
		// row 3 of rotated matrix
		for (int i=0; i<3; i++) {
			row2[i] = arr[i][0];
		}

		rotatedArray[0]=row0;
		rotatedArray[1]=row1;
		rotatedArray[2]=row2;

		return rotatedArray;

	}


	void printMatrix(int[][] arr){
		for (int row=0; row<3; row++) {
			for (int col=0; col<3; col++) {
				System.out.printf("%d ",arr[row][col]);
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		RotateMatrix obj = new RotateMatrix();
		int[][] inputMatrix = new int[3][3];

		System.out.println("Enter integers for FIRST Row separated a space.");
		for (int i=0; i<3; i++) {
			inputMatrix[0][i] = scan.nextInt();
		}

		System.out.println("Enter integers for SECOND Row separated a space.");
		for (int i=0; i<3; i++) {
			inputMatrix[1][i] = scan.nextInt();
		}

		System.out.println("Enter integers for THIRD Row separated a space.");
		for (int i=0; i<3; i++) {
			inputMatrix[2][i] = scan.nextInt();
		}

		String userConfirm = "n";
		System.out.println("Would you like to print your matrix w/o rotation?(y/n)");
		scan.nextLine();
		userConfirm = scan.nextLine();
		System.out.println("");
		if (userConfirm.equals("y")) {
			obj.printMatrix(inputMatrix);
		}

		String userConfirmRotate = "n";
		System.out.println("Rotate and Print matrix?(y/n)");
		userConfirmRotate = scan.nextLine();
		System.out.println("");
		System.out.println("");
		while (userConfirmRotate.equals("y")) {
			inputMatrix=obj.rotateMatrix90(inputMatrix);
			obj.printMatrix(inputMatrix);
			System.out.println("");
			System.out.println("Rotate Again?(y/n)");
			userConfirmRotate=scan.nextLine();
		}
		System.out.println("Thanks for playing!");
	}
}

