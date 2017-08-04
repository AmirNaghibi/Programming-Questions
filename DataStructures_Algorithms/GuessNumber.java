/*
Guess a number between 0 to n where n is chosed by user
Do logarithmic (i.e binary) search
Count the number of iterations
*/
import java.util.Scanner;  // whith out this: error: cannot find symbole Scanner
import java.lang.Math;		// To use log 

public class GuessNumber{
	int guessUpTo; 			// range
	int count = 0;			// how many time loop
	int target; 			// number to be found

	// constructor
	public GuessNumber(){};

	// print when target is found
	void message(int target, int totalCount){
		System.out.println("Your number is " + target +". Total count: " + totalCount);
	}

	// has to call message when found
	// keep track of count
	// range ex: 1000
	int systemGuess = 0; // computer guess
	//int systemRange = 0; // computer range
	void binary_search(int search_target, int range){
		int lower_bound = 0;       // for calculating average
		int upper_bound = range;

		while(systemGuess != search_target){
			count++; // entering loop is 1 iteration

			systemGuess = (lower_bound + upper_bound)/2; // pick the middle number
			System.out.println("system guess is " + systemGuess);
			// case 1: 
			if (search_target == systemGuess) { 	// the target is middle element
				this.message(systemGuess, count); // print result
				break;

			} else if (search_target > systemGuess) {  // the target is in the upper half
				lower_bound = systemGuess;

			} else if (search_target < systemGuess) {	// the target is in the lower half
				upper_bound = systemGuess;
			}
			// DO the loop again
		}
		System.out.println("System terminate!");
	}

	void start(){
		// Select a range
		Scanner input = new Scanner(System.in);  		// reading from system in
		System.out.println("Select a range starting from 0");
		guessUpTo = input.nextInt();

		// Ask for input
		Scanner input2 = new Scanner(System.in);  		// reading from system in
		System.out.println("Select a number 'BETWEEN' 0 and " + guessUpTo);
		target = input2.nextInt(); 						// Scans the next token of the input as an int.

		int max = (int) ((Math.log10(guessUpTo)) / (Math.log10(2)));
		System.out.println("Total count is less than or equal to "+ (max+1));
		this.binary_search(target, guessUpTo);
	}


	public static void main(String[] args) {

		GuessNumber game = new GuessNumber();
		game.start();
	}
}