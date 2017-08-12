/*
	BugReport: The order of print statements are not correct!!!
	https://www.hackerrank.com/challenges/java-datatypes
*/

import java.util.Scanner;
import java.lang.Math;

public class DataType{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.println("how many test cases would you like to have?");
		int numTestCase = input.nextInt();
		//System.out.println("Enter your "+numTestCase+" test cases one per line");

		for (int i=0; i<numTestCase; i++) {
			
			try{
				long x = input.nextLong();
				System.out.println(x + " can be filled in:");
				// BYTE
				if (x>=-128 && x<=127) System.out.println("* byte");
				// SHORT
				if (x>=-32768 && x<=32767) System.out.println("* short");

				// INT
				int intMin = -1 * (int)Math.pow(2,31);
				int intMax = (int)Math.pow(2,31) - 1; 
				if(x>=intMin && x<=intMax) System.out.println("* int");

				// LONG
				long longMin = -1 * (long)Math.pow(2,63);
				long longMax = (long)Math.pow(2,63) - 1;
				if(x>=longMin && x<=longMax) System.out.println("* long");

			} catch(Exception e){
				System.out.println(input.next()+" can't be fitted anywhere.");
			}
		}
	}
}