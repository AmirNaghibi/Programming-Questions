/** Created on August 2, 2017

	CodeForces Link: http://codeforces.com/gym/101404/attachments/download/5607/20092010-northwestern-european-regional-contest-nwerc-2010-en.pdf
	Problem B: Free Goodies
*/
import java.util.Scanner;
import java.util.ArrayList;

public class FreeGoodies{
	// The two agents who use goodies are Petra and Jan
	// Abstract Data Type for a goodie
	private static class Goodie{
		// Each goodie has a different value assigned by Petra and Jan
		int pValue;
		int jValue;

		Goodie(int pVal, int jVal){this.pValue=pVal; this.jValue=jVal;}

		void printInfo(){System.out.printf("Petra value %d, Jan value %d",pValue,jValue);}
	}

	ArrayList<Goodie> goodieArray = new ArrayList<Goodie>();

	// Petra can choose from an ArrayList of Goodies and update her score.
	int petraChoose(ArrayList<Goodie> arr, int pScore){
		
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FreeGoodies object = new FreeGoodies();
		// ArrayList stores the final value of each agent after each test case
		ArrayList<Integer> finalAnswer = new ArrayList<Integer>();
		int numTestCases = scan.nextInt();

		for(int i=0; i<numTestCases; i++){
			int petraTotalValue = 0;
			int    janTotalValue =0;

			int numGoodie = scan.nextInt();
			String firstPlayer = (String) scan.next();
			
			// populate goodieArray. Each goodie has 2 numbers
			for(int j=0; j<numGoodie; j++){
				int pVal = scan.nextInt();
				int jVal = scan.nextInt();
				Goodie newGoodie = new Goodie(pVal,jVal);
				object.goodieArray.add(newGoodie);
			}


		}
	}
}