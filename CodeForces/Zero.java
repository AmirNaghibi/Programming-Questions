/*
	Zero or One
CodeForces: http://codeforces.com/gym/101473/attachments/download/5792/20132014-acmicpc-brazil-subregional-programming-contest-en.pdf

*/

import java.util.Scanner;

public class Zero{

	int findIndex(int target, int[] arr){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==target) return i;
		}
		return -1;
	}
	
	String zero_or_one(int[] input){
		int sum=0;
		for(int i=0; i<input.length; i++){
			sum += input[i];
		}
		if(sum==1){
			// find one
			int index = findIndex(1,input);
			String answer;
			switch(index){
				case 0 : answer= "A";
				break;
				case 1 : answer= "B";
				break;
				case 2 : answer= "C";
				break;
				default :answer= "Error";
			}
			System.out.println(answer);
			return answer;
		}
		if(sum==2){
			String answer;
			// find zero
			int index = findIndex(0,input);
			switch(index){
				case 0 : answer= "A";
				break;
				case 1 : answer= "B";
				break;
				case 2 : answer= "C";
				break;
				default: answer= "Error";
			}
			System.out.println(answer);
			return answer;
		}
		System.out.println("*");
		return "*";
	}

	public static void main(String[] args) {
		Zero obj = new Zero();
		Scanner scan = new Scanner(System.in);
		int[] input = new int[3];
		for(int i=0; i<3; i++){
			input[i] = scan.nextInt();
		}

		obj.zero_or_one(input);
	}
}