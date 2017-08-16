/*
	A magic index in an aray A[0,1,2,....,n-1] is defined to be an index such that A[i] = i;
	Given a sorted array of distinct integers, write a method to find a magic index if one exist.
*/

public class MagicIndex{
	

	// IF the number is greater than the index in a sorted array. 
	//		we would never have A[i] == i;
	static int findMagicIndexSorted(int[] array){
			for(int i=0; i<array.length; i++){
				if(i<array[i]) return -1;
				if (array[i]==i) {
					return i;
				}
			}
			return -2;
	}

	public static void main(String[] args) {
		int[] arr = new int[]{-5,-4,-2,4,5,6,7,8};
		int result = findMagicIndexSorted(arr);
		System.out.println(result); 
	}
}