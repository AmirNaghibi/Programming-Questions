import java.util.Random;  

/*
Given an array of 'randomly chosen' integers, find the 
minimun or maximum of the array.
*/


public class findNum {
	/*Note: Since this class has methods that modify an array, we 
			Need a GLOBAL array */
	Random randomNum = new Random();
	// global array
	// global: everything can access it.
	int[] myArray = new int[10];

	// constructor
	public findNum(){
		// generate array
		for (int i=0; i<10; i++) {
			int rand = randomNum.nextInt(20);
			myArray[i] = rand;
		}
	}
	
	void findMax(int[] array){
		int max = array[0];
		for (int i=1; i<array.length; i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		System.out.println("The maximum number in array is "+max);
	}


	void findMin(int[] array){
		int min = array[0];
		for (int i=1; i<array.length; i++) {
			if (array[i]<min) {
				min = array[i];
			}
		}
		System.out.println("The minimun number in array is "+min);
	}

	public static void main(String[] args) {
		findNum obj = new findNum();
		
		// print out
		for (int i=0; i<10; i++) {
			System.out.println(obj.myArray[i]);
		}

		obj.findMin(obj.myArray);
		obj.findMax(obj.myArray);
	}
}