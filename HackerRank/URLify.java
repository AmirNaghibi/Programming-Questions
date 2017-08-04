/*
	write a method to replace all the white spaces of a string with "%20"
	The input is a string and its actual length
	in: "Mr John Smith    ", 13
	out:"Mr%20John%20Smith"
*/
import java.util.ArrayList;
import java.util.Scanner;

public class URLify{
	
	void removeSpace(String input, int size){
		ArrayList<Character> tempArr = new ArrayList<Character>();
		for (int i=0; i<size; i++) {
			if (input.charAt(i)==' ') {
				tempArr.add('%');
				tempArr.add('2');
				tempArr.add('0');
			}
			tempArr.add((input.charAt(i)));
		}
		ArrayList<Character> tempArr2 = new ArrayList<Character>();
		for (char c : tempArr) {
			if (c !=' ') {
				tempArr2.add(c);
			}
		}
		// An array list with removed spaces

		String result = "";
		for (char c: tempArr2) {
			result += c;
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		URLify obj = new URLify();
		System.out.println("Enter a string:");
		String s = scan.nextLine();

		obj.removeSpace(s,s.length());
	}
}