/*
A left rotation operation on an array of size n shifts 
each of the array's elements 1 unit to the left.
For example, if 2 left rotations are performed
on array [1,2,3,4,5] , then the array would become [3,4,5,1,2]
*/


/*
INPUT
The first line contains two space-separated integers denoting 
the respective values of n (the number of integers) and d 
(the number of left rotations you must perform). 
The second line contains n space-separated integers 
describing the respective elements of the array's initial state.
*/

import java.util.*; // for Queue and Linked list and Scanner

public class LeftRotation{

	public LeftRotation(){}

	// a is array, n is size, k is left rotation
	public static int[] arrayLeftRotation(int[] a, int n, int k) {
      int[] result = new int[n];
      Queue q = new LinkedList();

      for (int i=0; i<n; i++) {
      	q.add(a[i]); // insert all elements of the array into a Queue
      }

      while(k>0){
      	//int removed = q.remove();	// remove element from front
      	q.add(q.remove()); 	// add element to the back of the queue
      	k--;
      }

      int j = 0; // array index
      while(!q.isEmpty() && j<n){
      	result[j] = (int)q.remove();
      	j++;
      }

      // print the final array
      for (int i=0; i<n; i++) {
      	System.out.printf("%d ",result[i]);
      }
      System.out.println("");
      return result;
    }
	
	public static void main(String[] args) {
		LeftRotation obj = new LeftRotation();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter size and number of shift left");
		int size = input.nextInt();
		int left = input.nextInt();

		int[] myIntArray = new int[size];
		System.out.println("Enter array integers with space: ");
		for (int i=0; i<myIntArray.length; i++) {
			myIntArray[i] = input.nextInt();
		}
		
		arrayLeftRotation(myIntArray,size,left);// 3 4 5 1 2
	}
}