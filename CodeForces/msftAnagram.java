// first line of input is integer n representing the number of test cases. 
// the next n lines have 2 string per line
// return "Valid Pattern" if both strings are anagrams
// return "Invalid Pattern" if both strings are NOT anagrams
import java.util.Scanner;
import java.util.ArrayList;

public class msftAnagram{

	int countAsciiValue(String str){
		int sum=0;
		for (int i=0; i<str.length(); i++) {
			sum += (int)str.charAt(i);
		}
		return sum;
	}

	void isAnagram(String str1, String str2){
		// covert both strings to lower case
		String input1 = str1.toLowerCase();
		String input2 = str2.toLowerCase();

		if (countAsciiValue(input1) == countAsciiValue(input2)){
			System.out.println("Valid Pattern");
		} else{
			System.out.println("Invalid Pattern");
		} 
	}
	
	public static void main(String[] args) {
		msftAnagram obj = new msftAnagram();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of test cases:");
		int numTestCase = scan.nextInt();
		System.out.println("Enter each pair of string for each test case in one line: ");
		ArrayList userStringInput = new ArrayList();
		for (int i=0; i<numTestCase*2; i++) {
			userStringInput.add(scan.next());
		} // the list is populated with user input
		//System.out.println(userStringInput);
		
		for (int i=0; i<userStringInput.size()-1; i+=2) {
			obj.isAnagram((String)userStringInput.get(i),(String)userStringInput.get(i+1));
		}

	}
}