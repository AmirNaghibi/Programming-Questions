// print the number of digits of the input integer
import java.util.Scanner;

public class NumberOfDigit{
	// return the number of digits of the input Integer
	int getNumDigits(String n){
		//String str = Integer.toString(n);
		// int length = str.length();
		// char[] charArray = new char[length];
		// charArray = str.toCharArray();
		// int count =0;
		return n.length();

	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberOfDigit obj = new NumberOfDigit();
		System.out.println("Enter an Integer: ");
		String userInput = scan.nextLine();
		System.out.println("Your Integer has "+ obj.getNumDigits(userInput)+" digits");
	}
}