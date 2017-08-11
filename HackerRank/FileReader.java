// To read a text file use: FileReader class wrapped inside a BufferedReader class. Buffered reader
// helps you to read a line at a time rather reading a character at a time. So you can read
// larger files.

/*
	You give it a text file enter a string you are looking for and it returns 
	total number of lines in the file and number of occurances of the string.
*/

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class FileReader{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// The file to read
		String fileName = "sampleInput.txt"; 
		/* A single line in the file:  A line is considered 
		to be terminated by any one of a line feed ('\n')
		*/
		String line = null;

		// Use try catch since an exception might be thrown
		try{
			// read files containing characters
			FileReader fileReader = new FileReader(fileName);
			// Always wrap a FileReader inside BufferedReader to read a line at a time
			BufferedReader bufferReader = new BufferedReader(fileReader);

			/* or
				BurreredReader bf = new BufferedReader(new FileReader(fileName));
			*/
			System.out.println("Your file is "+fileName);
			//System.out.println("Enter a patter you want to count: ");
			//String userInput = scan.next();

			// print line by line
			String regX_pattern1 = ".*\\s.*";
			int counter =0;
			int lineNum =0;
			while((line = bufferReader.readLine()) != null){
				lineNum++;
				if (line.matches(regX_pattern1)) counter++;
			}
			System.out.printf("\nThe patter you are looking for has appeared '%s' times. \n",counter);
			System.out.printf("\nTotal number of lines are '%s' . \n\n",lineNum);

			// Always close files
			bufferReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Unable to find the file '"+fileName+"'");
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}