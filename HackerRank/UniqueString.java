import java.util.HashSet;
import java.lang.String;
import java.util.Scanner;

/*
	Determine if a string has all unique  characters
*/
public class UniqueString{
	public UniqueString(){}
	// a set cannot have douplicates
	//HashSet<char> mySet = new HashSet<char>();
	// false is not unique. true is unique
	boolean isUnique(String input){
		if(input.length()<1) return true;
		for(char c : input.toCharArray()){
			if (input.indexOf(c)!=input.lastIndexOf(c)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		UniqueString obj = new UniqueString();
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("Enter a string: ");
		 	String s = scanner.nextLine();
			System.out.println(obj.isUnique(s));
		}
	}
}