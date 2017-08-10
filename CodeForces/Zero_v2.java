/*
	Zero or One
CodeForces: http://codeforces.com/gym/101473/attachments/download/5792/20132014-acmicpc-brazil-subregional-programming-contest-en.pdf

*/

import java.util.Scanner;

public class Zero_v2{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[3];
		// put 3 inputs into array
		for(int i=0; i<3; i++){
			input[i] = scan.nextInt();
		}

		// sum them up
		int sum=0;
		for(int i=0; i<3; i++){
			sum += input[i];
		}

		if(sum==1){
			String answer = "";
			if(input[0]==1) answer = "A";
			if(input[1]==1) answer = "B";
			if(input[2]==1) answer = "C";
			System.out.println(answer);
		}

		else if(sum==2){
			String answer = "";
			if(input[0]==0) answer = "A";
			if(input[1]==0) answer = "B";
			if(input[2]==0) answer = "C";
			System.out.println(answer);
		}
		else System.out.println("*");
	}
}


























