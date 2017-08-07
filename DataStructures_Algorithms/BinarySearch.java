/**Created on July 2, 2017 by Amir Naghibi

	Implement Binary Search both Recursively and Iteratively.
*/


public class BinarySearch{
	
	
	/*
		Return the index of given key using RECURSIVE approach
		@param array : array of integers
		@param key : the integer value we are looking for
		@param left: the left most index of sub-array
		@param right: the right most index of sub-array
	*/
	int binarySearchRecursive(int[] array, int key, int left, int right){
		if(left>right) return -1;
		int mid = (left+right)/2;
		if(array[mid]==key) return mid;
		// NOTE: use return keyword to Terminate, otherwise would return -1.
		if(key < array[mid]){return binarySearchRecursive(array,key,left,mid-1);}
		if(key > array[mid]){return binarySearchRecursive(array,key,mid+1,right);}
		return -1;
	}



	/* Return the index of given key using ITERATIVE approach
		@param array : array of integers
		@param key : the integer value we are looking for
	*/
	int binarySearchIterative(int[] array, int key){
		int left = 0; 
		int right= array.length;
		while(left<=right){
			int mid = (left+right)/2;
			if(array[mid]==key) return mid;

			if(key < array[mid]){right=mid-1;}
			if(key > array[mid]){left =mid+1;}
		}
		// if we exit the while, it means left > right, so return -1
		return -1;
	}



	public static void main(String[] args) {
		BinarySearch object = new BinarySearch();

		int[] arr = new int[]{2,3,5,7,9,11,13,15,18,21,23,25};

		// Prints 0 to 11 using RECURSIVE implementation.
		System.out.println("RECURSIVE");
		for (int i=0; i<arr.length; i++) {
			int resultRecursive = object.binarySearchRecursive(arr, arr[i], 0, 11);
			System.out.println(resultRecursive);
		}

		System.out.println("");
		// Prints 0 to 11 using RECURSIVE implementation.
		System.out.println("ITERATIVEI");
		for (int i=0; i<arr.length; i++) {
			int resultIterative = object.binarySearchIterative(arr, arr[i]);
			System.out.println(resultIterative);
		}
		
	}
}


/* NOTES:
	- line 21 : Use return keyword to Terminate, otherwise would return -1.
	- line 36 : Usually in Iterative implementations, we use a loop until a condition is met.
*/