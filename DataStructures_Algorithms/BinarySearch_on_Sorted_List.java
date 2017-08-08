/*Implement Binary Search on a sorted list*/

public class BinarySearch_on_Sorted_List{
	
	// return the index of a given key
	int bSearch(int[] arr, int key, int i, int j){
		if(j<i)return -1;
		// get middle index
		int m = (i+j)/2;
		if(arr[m] < key){return bSearch(arr, key, m+1, j);}
		else if(arr[m] > key){return bSearch(arr, key, i, m-1);}
		else return m;
	}


	public static void main(String[] args) {
		BinarySearch_on_Sorted_List obj = new BinarySearch_on_Sorted_List();
		// create array
		int[] arr = new int[]{2,4,5,7,8,9,12,14,17,20,21,25};
		int[] arr2 = new int[12];

		int key = 21;
		int result = obj.bSearch(arr, key, 0, 11);
		System.out.println(result);
	}
}