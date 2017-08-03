/*
	All of its entries are 
	distinct positive 
	square free integers, 
	and product of any row and any column is 210.
*/
import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.ArrayList;


class ElegantSquare{
	static HashSet<Integer> integerSet = new HashSet<Integer>();
	static ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
	// given a target, is it divisible by a value
	boolean isDivisible(int target, int value){
		return target%value==0;
	}

	boolean isSquareFree(int n){
		for(int i=2; i<=100; i++){
			if (n%(i*i)==0) {
				return false;
			}
		}
		return true;
	}

	void printArrayList(ArrayList arr){
		for (int i=0; i<arr.size(); i++) {
			System.out.printf("%d ",arr.get(i));
		}
	}

	public static void main(String[] args) {
		ElegantSquare obj = new ElegantSquare();
	
		// get user input
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter a positive integer greater than 1");
		int userInput = scan.nextInt();
		
		// generate a random number between and including 0 and 9
		//System.out.println("The target result is "+TARGET_RESULT);
		Random r = new Random();
		

		// first row
		int TARGET_RESULT = 1; ///
		int i=0;
			
		while(i<userInput){
			int randint_1 = Math.abs(r.nextInt()) % 20 + 1;
			if(obj.isSquareFree(randint_1) && integerSet.add(randint_1)){
				integerArrayList.add(randint_1);
				TARGET_RESULT *= randint_1;
				userInput++;
			}
		}

		obj.printArrayList(integerArrayList);	
			
    
		//for(int i=0; i<userInput; i++){
			
		// int randint_1 = Math.abs(r.nextInt()) % 13;
		// firstNum = multiples[randint_1];
		// TARGET_RESULT = TARGET_RESULT/firstNum;
		// System.out.println("The target result is "+TARGET_RESULT);

		// // get the second number
		// boolean condition = true;
		// for(int i=0; i<userInput-2; i++){
		// 	while(condition==true){
		// 		int randint_2 = Math.abs(r.nextInt()) % 13;
		// 		secondNum = multiples[randint_2];
		// 		if (obj.isDivisible(TARGET_RESULT,secondNum)) {
		// 			TARGET_RESULT= TARGET_RESULT/secondNum;
		// 			condition=false;
		// 		}		
		// 	}
		// }
		// thirdNum = TARGET_RESULT;	

		// System.out.printf("%d %d %d \n", firstNum, secondNum, thirdNum);
		// System.out.println(firstNum*secondNum*thirdNum);
		// System.out.println("Final Target Result "+TARGET_RESULT);

	}

}









