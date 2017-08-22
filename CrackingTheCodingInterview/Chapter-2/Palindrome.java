/*Given a string, determine if its a palindrome or not. 
	A palindrome is a string that reads the same forward and backward.
*/
import java.util.Scanner;



public class Palindrome{
	
	public static boolean isPalindrome(String str){
		int numComparisons = str.length();
		int start = 0;
		int end = str.length()-1;

		for(int i=0; i<numComparisons; i++){
			if(str.charAt(start) != str.charAt(end)) {System.out.println(false); return false;}
			start++;
			end--;
		}
		System.out.println(true);
		return true;
	}

	public static void main(String[] args) {
		// true
		isPalindrome("");
		// true
		isPalindrome("A");
		// false
		isPalindrome("AB");
		// true
		isPalindrome("ABA");
		// true
		isPalindrome("ABCDEFEDCBA");
	}
}