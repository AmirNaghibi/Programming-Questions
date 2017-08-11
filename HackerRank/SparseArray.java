/*
	Link to the Hacker Rank Question: 
		https://www.hackerrank.com/challenges/sparse-arrays
		Count the number of queries in a list
*/

import java.util.Scanner;
import java.util.ArrayList;

public class SparseArray {

	void countNumberOfOccurings(ArrayList<String> stringArray, ArrayList<String> queryArray){
		for (String q : queryArray) {
			int count = 0; 
			for (String s : stringArray) {
				if(q.equals(s)) count++;
			}
			System.out.println(count);
		}
	}

    public static void main(String[] args) {
    	SparseArray obj = new SparseArray();
        Scanner scanner = new Scanner(System.in);
        int numStrings = scanner.nextInt(); 
        ArrayList<String> stringArray = new ArrayList<String>();

        for(int i=0; i<numStrings; i++){
        	stringArray.add(scanner.next());
        } // ArrayList is populated by Strings

        int numQueries = scanner.nextInt();  
        ArrayList<String> queryArray = new ArrayList<String>();

        for(int i=0; i<numQueries; i++){
        	queryArray.add(scanner.next());
        } // ArrayList is populated by Query Strings

        obj.countNumberOfOccurings(stringArray, queryArray);
    }
}