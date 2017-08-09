/* Given an NxN matrix. Find the zero element and set ALL the 
   numbers in the same row and column of the zero element to ZERO.

   Indicate if there is NO zero element.
*/
import java.util.Scanner;

public class ZeroMatrix{


	void printMatrix(int[][] arr){
		for (int row=0; row<arr.length; row++) {
			for (int col=0; col<arr[0].length; col++) {
				System.out.printf("%d ",arr[row][col]);
			}
			System.out.println("");
		}
		System.out.println("\n");
	}

	int[][] makeMatrix(){
		Scanner scan = new Scanner(System.in);
		int dimension = 0;
		System.out.println("What is the number of rows and coloumn in SQUARE matrix?");
		dimension=scan.nextInt();
		int[][] inputMatrix = new int[dimension][dimension];
		int count = dimension;
		int row=0;
		while(count>0){
			System.out.println("Enter "+dimension+" integers of "+"row number: "+row);
			for (int i=0; i<dimension; i++) {
				inputMatrix[row][i] = scan.nextInt();
			}
			row++;
			count--;
		}
		System.out.println("Your matrix is:");
		printMatrix(inputMatrix);
		return inputMatrix;

	}

	// Find the row and column number of zero element
	int[] zeroRowCol(int[][] arr){
		// first num is row second num is column
		int[] row_col = new int[2]; 
		int row=0;
		int col=0;
		for (row=0; row<arr.length; row++) {
			for (col=0; col<arr.length; col++) {
				if (arr[row][col]==0) {
					row_col[0]=row;
					row_col[1]=col;
					return row_col;
				}
			}
		}
		System.out.println("NO ZERO element.");
		row_col[0]=-1;
		row_col[1]=-1;
		return row_col;
	}

	// set all integers of the same row and coloumn of the zero element to zero
	// rc is the row column matrix;
	void makeZeroMatrix(int[][] arr, int[] rc){
		if(rc[0]==-1 && rc[1]==-1){
			System.out.println("There is no zero in matrix.");
			return ;
		}
		int targetRow=rc[0];
		int targetCol=rc[1];
		// make all nums in same row and col to zero
		for (int i=0; i<arr.length; i++) {
			arr[targetRow][i]=0;
			arr[i][targetCol]=0;
		}
		printMatrix(arr);
	}



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ZeroMatrix obj = new ZeroMatrix();
		int[][] userInputMatrix=obj.makeMatrix();
		int[] rc = obj.zeroRowCol(userInputMatrix);
		System.out.println("The updated version is:");
		obj.makeZeroMatrix(userInputMatrix,rc);		
	}
}

