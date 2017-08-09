/*
June 11 2017 : ArrayList Implementation. Dynamically resizable array data structure.
Methods: 
	add : adds element to ArrayList and prints arraylist and its size
			Print "Doubled" if its full. Resizing factor: 2
	count: count number of elements in array
	
	Notes: 
		Zero cannot be added.				
*/

public class ArrayList_t{
	private int[] arr;	// arraylist is based on an Array
	private int resize_limit=1;

	// Construct an array with initial size of 2
	ArrayList_t(){
		arr = new int[1];
	}

	void printArray(int[] arr){
		System.out.printf("[");
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%d, ",this.arr[i]);
		}
		System.out.println("]");
	}

	// Count the number of elements in array
	int count(int[] arr){
		int sum=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]!=0) {
				sum++;
			}
		}
		return sum;
	}


	void add(int item){
		if (count(this.arr)%resize_limit==0) {
			this.resize_limit *= 2; // double the resizing limit
			int[] arrTemp = new int[arr.length]; // make temporary array
			for (int i=0; i<arr.length; i++) {
				arrTemp[i] = this.arr[i]; // transfer from original array to new array
			}
			int newSize = arr.length * 2;
			this.arr = new int[newSize]; // double the original array size
			System.out.println("Array size has been doubled");
			System.out.println("Current Size: "+arr.length);
			for (int i=0; i<arrTemp.length; i++) {
				this.arr[i] = arrTemp[i];
			} // the new array of double size has all elements of previous array
			
		}
		// find index to insert
		int index= count(this.arr);
		//while(this.arr[index]!=0){index++;} // correct index found
		this.arr[index] = item;
	
		printArray(this.arr);
	}
	
	/*UserGuide:
		add elements to the arrayList. Its size would double when it reaches the limit. 
		its resizing factor is 2. 
	*/
	public static void main(String[] args) {
		ArrayList_t obj = new ArrayList_t(); // make a new array of size 1;
		for (int i=1; i<=33; i++) {
			obj.add(i);
		}
	}
}



