/*
	https://www.hackerrank.com/challenges/funny-string/problem
*/

import java.lang.StringBuilder;
import java.lang.Math;


public class FunnyString{
	
	static void isFunny(String str){
		String reverse = reversify(str);

		for(int i=1; i<str.length(); i++){
			if( Math.abs(((int)str.charAt(i) - (int)str.charAt(i-1))) != Math.abs(((int)reverse.charAt(i) - (int)reverse.charAt(i-1)))){
				System.out.println("Not Funny");
				//System.out.println(((int)str.charAt(i) - (int)str.charAt(i-1)));
				//System.out.println(((int)reverse.charAt(i) - (int)reverse.charAt(i-1)));
				return;
			}
		}

		System.out.println("Funny");
	}


	// return the reverse of the input string
	static String reversify(String s){
		StringBuilder sb = new StringBuilder();

		for(int i=s.length()-1; i > -1; i--){
			sb.append(s.charAt(i));
		}

		//System.out.println(sb.toString());
		return sb.toString();
	}


	public static void main(String[] args) {
		isFunny("acxz");

		isFunny("bcxz");
	}
}