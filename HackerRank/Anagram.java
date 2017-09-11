// given a two strings, determine if they are anagram of each other.
import java.util.Scanner;

public class Anagram{
	
	boolean isAnagram(String str1, String str2){
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if (getAscii(str1)==getAscii(str2)) return true;
			else return false;
	}

	int getAscii(String str){
		int sum = 0;
		for (int i=0; i<str.length(); i++) {
			sum += str.charAt(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // get user input
		Anagram obj = new Anagram();
		System.out.println("Enter two strings one per line: ");
		String userInput1=scan.next();
		String userInput2=scan.next();
		boolean result = obj.isAnagram(userInput1,userInput2);
		System.out.println(result);
	}
}