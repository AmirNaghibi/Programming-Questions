/*Implement insertion sort algorithm*/


public class InsertionSort{
	
	static void printArray(int[] arr){
		for(int i=0; i<arr.length; i++)
			System.out.printf("%d ",arr[i]);
		System.out.println("\n");
	}


	static int[] swap(int[] arr, int index_1, int index_2){
		int value = arr[index_1];
		arr[index_1] = arr[index_2];
		arr[index_2] = value;

		return arr;
	}

	static void insertionSort(int[] arr){
		if(arr==null){
			System.out.println("ERROR: Array is not initialized.");
			return ;
		}

		if(arr.length==0 || arr.length==1){
			printArray(arr);
			return ;
		}


		int currIndex = 1;
		while(currIndex < arr.length){
			int val_i = currIndex;
			int temp_i = val_i - 1;

			while(temp_i != -1 && arr[val_i] < arr[temp_i]){
				arr = swap(arr, val_i, temp_i);
				val_i--;
				temp_i--;
			}
			currIndex++;
		}
		printArray(arr);
	}

	public static void main(String[] args) {
		int[] array = new int[]{312, 24, 222, 55, 12, 284};
		insertionSort(array);
	}
}