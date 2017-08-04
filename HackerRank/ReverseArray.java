import java.util.Scanner;

public class ReverseArray{
	
	int[] reverse(int[] a, int size){
		int[] temp = new int[size];
		for (int i=size-1,j=0; i>-1; i--,j++) {
			temp[j] = a[i];
		}
		return temp;
		
	}

	void printArray(int[] a){
		for (int i=0; i<a.length; i++) {
			System.out.printf("%d ",a[i]);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// make an object
		ReverseArray arrayObj = new ReverseArray();
		Scanner input = new Scanner(System.in);
		// get input
		System.out.println("How many numbers are in the array? ");
		int size = input.nextInt(); // get the size of array
		System.out.println("Enter the integers of the array with space: ");
		int[] inputArray = new int[size];
		for (int i=0; i<inputArray.length; i++) {
			inputArray[i] = input.nextInt();
		}
		System.out.println("Processing...");

		
		arrayObj.printArray(arrayObj.reverse(inputArray,size));


	}
}