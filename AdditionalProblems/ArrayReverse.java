/*
Date: April 25
Title: Java, given array, reverse the array
*/


public class ArrayReverse{
	// in: array out: reversed array
	//RUNTIME: O(N) where N is the number of items in input array
	static void reverseArray(int[] array){
		// make a temporary array
		int[] temp_array = new int[array.length];
		// j: index for temporary array
		int j=0;
		// i: index for input array
		for(int i = array.length - 1; i >= 0; i--){
			temp_array[j]=array[i];
			j++;
		}
		// print original array
		System.out.println("Original Array");
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

		// print temp_array
		System.out.println("Array Reversed");
		for (int i=0; i<temp_array.length; i++) {
			System.out.println(temp_array[i]);
		}
	}

	public static void main(String[] args) {
		// make an input array
		int[] myArray = new int[8];
		myArray[0] = 0 ;
		myArray[1] = 1 ;
		myArray[2] = 2 ;
		myArray[3] = 3 ;
		myArray[4] = 4 ;
		myArray[5] = 5 ;
		myArray[6] = 6 ;
		myArray[7] = 7 ;
		//myArray[8] = 8 ;	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9

		// call the function O(N);
		reverseArray(myArray);	
	}
}