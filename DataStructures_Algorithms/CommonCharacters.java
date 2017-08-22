
import java.util.Scanner;
import java.util.ArrayList;


public class CommonCharacters{
	

	public static void main(String[] args) {
		ArrayList<int[]> arr = new ArrayList<int[]>();
		int[] arr1 = new int[]{1,2,3,4};
		int[] arr2 = new int[]{5,6,7};
		int[] arr3 = new int[]{8,9};

		arr.add(arr1);
		arr.add(arr2);
		arr.add(arr3);

		System.out.println(arr.get(0)[2]);
	}
} 

