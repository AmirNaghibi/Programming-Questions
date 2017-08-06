/*Implement Bubble Sort Algorithm.
	How it works: Compares adjacent elements and move the bigger to right. 
	By the end of first iteration, the biggest element is at the end.	
*/ 

/*STATISTICS: Numbers inserted in sorted order but REVERSED

10,000 integers : Total number of swaps: 49995000  /  Total number of comparisons: 99990000   / real 0m0.620s /  user 0m0.808s  / sys 0m0.104s

100,000 integers: Total number of swaps: 704982704 /  Total number of comparisons: 1409965408 / real 0m22.217s / user 0m23.108s / sys 0m0.372s


*/


public class BubbleSort_t{
	
	// swap the two given elements of given array
	int[] swap(int[] arr, int index0, int index1){
		int temp = arr[index0];
		arr[index0]=arr[index1];
		arr[index1]=temp;
		return arr;
	}

	// print array
	void printArray(int[] arr){
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%d ",arr[i]);
		}
		System.out.println("");
	}

	// performs bubble sort on the input array.
	int[] bubbleSort(int[] arr){
		//System.out.println("Start");
		// Total number of items in array
		int totalElements = arr.length;
		// Total number of comparisons made
		int totalSwap = 0;

		int totalCompare=0;

		for (int i=0; i<totalElements; i++) {
			// Number of comparisons for 1 complete iteration
			int swapPerIteration=0;
			for (int j=0; j<totalElements-1; j++) {
				totalCompare++;
				if (arr[j]>arr[j+1]) {
					//System.out.printf("%d and %d \n",j,j+1);
					// update the array
					arr = swap(arr,j,j+1);
					swapPerIteration++;
					totalSwap++;
				}
			}
			if (swapPerIteration==0) { // meaning all elements are sorted --> Terminate
				System.out.println("Total number of swaps: "+totalSwap);
				System.out.println("Total number of comparisons: "+totalCompare);
				printArray(arr);
				return arr;
			}
		}
		// TRY w/0 if (swapPerIteration==0) --> more comparisions
		// System.out.println("Total number of swaps: "+totalSwap);
		// System.out.println("Total number of comparisons: "+totalCompare);
		// printArray(arr);
		return arr;
	}

	public static void main(String[] args) {
		BubbleSort_t obj = new BubbleSort_t();
		int[] arr1= new int[]{7,2,5,1,6,12,9,3,4,8};
		int[] arr2= new int[]{10,9,8,7,6,5,4,3,2,1};
		int[] arr3= new int[]{1,9,15,2,8,3,11,7,17,19,4,5,0};
		int[] arr4= new int[]{1,9,15,2,8,3,11};
		System.out.println("Length "+arr1.length);
		int[] largeArray = new int[100000];
		for (int i=0; i<100000; i++) {
			largeArray[i]=100000-i;
		}
		obj.bubbleSort(largeArray);
	}
}