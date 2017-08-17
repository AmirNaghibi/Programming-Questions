/*
	Implement a method to generate the power set of a set.
*/
import java.util.ArrayList;
import java.util.Arrays;

public class PowerSet{
	
	private static ArrayList<ArrayList<Integer>> generatePowerSet(ArrayList<Integer> array){
		ArrayList<ArrayList<Integer>> main = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> empty = new ArrayList<Integer>();
		main.add(empty);

		for(int n : array){
			ArrayList<ArrayList<Integer>> tempMain = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> inner : main){
				ArrayList<Integer> arr = new ArrayList<Integer>();
				for (int i : inner) {
					arr.add(i);
				}
				arr.add(n);
				tempMain.add(arr);
			}
			
			for(ArrayList<Integer> arr : tempMain){
				main.add(arr);
			}
		}

		System.out.println(main);
		return main;
	}

	public static void main(String[] args) {
		ArrayList<Integer> myArray = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

		generatePowerSet(myArray);
	}
}