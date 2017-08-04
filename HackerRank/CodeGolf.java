import java.util.Scanner;
import java.lang.Math;

public class CodeGolf{
	// constructor
	public CodeGolf(){}


	void start(){
		// initialize the scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		long positiveInt = input.nextLong();

		long result = positiveInt%4; 
		long output=0;

		if (result==0) {
			output=0;
		}else if (result==1) {
			output=positiveInt + positiveInt;
		}else if (result==2) {
			output=positiveInt * positiveInt;
		}else{
			output = (long)Math.pow(positiveInt,positiveInt);
		}
		System.out.println(output);

	}

	public static void main(String[] args) {
		CodeGolf obj = new CodeGolf();
		while(true){
			obj.start();
		}		
	}	
}