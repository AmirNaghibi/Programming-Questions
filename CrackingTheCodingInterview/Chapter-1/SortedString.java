/*
 Given a string determine if all its characters are in order.
*/

import java.util.Scanner;

public class SortedString{
	
	static void isStringSorted(String str){
		int score = (int)str.charAt(0);
		
		for(int i=1; i<str.length(); i++){
			int current = (int) str.charAt(i);
			// System.out.println("current "+ current);
			// System.out.println("score "+ score);
			if(current<score){
				System.out.println("false");
				return ;
			}
			score = current;
		}
		System.out.println("true");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			String input = scan.next();
			isStringSorted(input);
		}
	}
}