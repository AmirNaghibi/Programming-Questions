/*
INPUT:
first line is string A all lower case
second line is string B all lower case

OUTPUT:
There are three lines of output: 
For the first line, sum the lengths of A and B. 
For the second line, write Yes if A is lexicographically larger than B or No if it is not. 
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
*/

import java.util.Scanner;



public class StringIntro{

	int sumLength(String a, String b){
		return a.length() + b.length();
	}


	// get the Ascii number of a char
	int getCharAscii(char c){
		int result = (int) c;
		return result;
	}

	// does string a come after string b?
	boolean isGreaterLexograph(String a, String b){
		int sizeA = a.length();
		int sizeB = b.length();
		

		if (a.equals(b)) {
			return false;
		}

		int smaller = (sizeA<sizeB) ? sizeA:sizeB;

		for (int i=0; i<smaller; i++) {
				// compare char by char, if ascii char a < ascii char b return false
				if (getCharAscii(a.charAt(i)) < getCharAscii(b.charAt(i))) {
					return false;
				}
		}
		return true;

		// if (sizeA == sizeB) {
		// 	for (int i=0; i<sizeA; i++) {
		// 		// compare char by char, if ascii char a < ascii char b return false
		// 		if (getCharAscii(a.charAt(i)) < getCharAscii(b.charAt(i))) {
		// 			return false;
		// 		}
		// 	}
		// 	return true;
		// }

		// if (sizeA>sizeB) {
		// 	for (int i=0; i<sizeB; i++) {
		// 		// compare char by char, if ascii char a < ascii char b return false
		// 		if (getCharAscii(a.charAt(i)) < getCharAscii(b.charAt(i))) {
		// 			return false;
		// 		}
		// 	}
		// 	return true;
		// }



		// if (sizeA < sizeB) {
		// 	for (int i=0; i<sizeA; i++) {
		// 		// compare char by char, if ascii char a < ascii char b return false
		// 		if (getCharAscii(a.charAt(i)) < getCharAscii(b.charAt(i))) {
		// 			return false;
		// 		}
		// 	}
		// 	return true;
		// }
		// return false;
	}


	void capitalizeFirstLetter(String a){
		char c = a.charAt(0);
		int charAsciiLower = (int) c;
		int charAsciiUpper = charAsciiLower - 32;
		char toReplace = (char) charAsciiUpper;

		String result = toReplace + a.substring(1);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		StringIntro obj = new StringIntro();
		//obj.capitalizeFirstLetter("amir");
		System.out.println(obj.isGreaterLexograph("Hello","Java"));
		
	}
}