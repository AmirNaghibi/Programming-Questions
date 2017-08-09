import java.util.LinkedList;
import java.util.Arrays;


class Palindrome2_6{

	void printArray(int[] arr){
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%d ",arr[i]);
		}
		System.out.println("");
	}

	boolean isPalindrome(LinkedList<Integer> list){
		int size = list.size();
		// Array consisting of elements going from head to tail
		int[] forward  = new int[size];
		// Array consisting of elements going from tail to head
		int[] backward = new int[size];

		for (int i=0; i<size; i++) {forward[i]=list.get(i);}

		for (int i=0; i<size; i++) {
			backward[size-i-1]=list.get(i);
		}	

		// printArray(forward);
		// printArray(backward);

		return Arrays.equals(forward,backward);
		//return forward.equals(backward);
		// return forward==backward;
	}
	
	public static void main(String[] args) {
		Palindrome2_6 obj = new Palindrome2_6();

		LinkedList<Integer> list_1 = new LinkedList<Integer>();
		list_1.add(1);
		list_1.add(2);
		list_1.add(3);
		list_1.add(2);
		list_1.add(1);


		LinkedList<Integer> list_2 = new LinkedList<Integer>();
		list_2.add(1);
		list_2.add(2);
		list_2.add(3);
		list_2.add(4);
		list_2.add(4);
		list_2.add(3);
		// list_2.add(2);
		list_2.add(1);


		System.out.println("list_1 "+obj.isPalindrome(list_1));
		System.out.println("list_2 "+obj.isPalindrome(list_2));
	}
}

/* Challenges
	- Comparing if two arrays are equal. Can't do == or arr1.equals(arr2);
			Must do import Arrays class, then Arrays.equals(arr1, arr2);

	- 
*/






























