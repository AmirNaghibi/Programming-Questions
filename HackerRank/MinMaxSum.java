import java.util.Scanner;


public class MinMaxSum{
	// find the minimum element in the array.
	int findMin(int[] arr){
		int minimum=1000;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]<minimum) {
				minimum=arr[i];
			}
		}
		return minimum;
	}
	// find the maximum element in the array
	int findMax(int[] arr){
		int maximum=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>maximum) {
				maximum=arr[i];
			}
		}
		return maximum;
	}
	//  find the maximum sum of n-1 element
	int maxSum(int[] arr){
		int sum=0;
		int arrayMin = findMin(arr);
		for (int i=0; i<arr.length; i++) {
			if (arr[i] != arrayMin) {
				sum += arr[i];
			}
		}
		return sum;
	}
	// find minimum sum of n-1 element
	int minSum(int[] arr){
		int sum=0;
		int arrayMax = findMax(arr);
		for (int i=0; i<arr.length; i++) {
			if (arr[i] != arrayMax) {
				sum += arr[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		MinMaxSum obj = new MinMaxSum();
		Scanner scan = new Scanner(System.in);
		int[] inputArray = new int[5];
		System.out.println("Enter 5 positive integers separated with space");
		for (int i=0; i<5; i++) {
			inputArray[i] = scan.nextInt();
		} // inputArray is filled with elements
		System.out.println("write MAX to find max sum of 4 or MIN to find min sum of 4 or BOTH for both min and max");
		scan.nextLine();
		String userInputString = scan.nextLine();

		if (userInputString.equals("MAX")) {
			System.out.println(obj.maxSum(inputArray));
			return ;
		}
		if (userInputString.equals("MIN")) {
			System.out.println(obj.minSum(inputArray));
			return ;
		}
		if (userInputString.equals("BOTH")) {
			System.out.printf("min sum: %d        Max sum: %d \n",obj.minSum(inputArray),obj.maxSum(inputArray));
			return ;
		}

		System.out.println("Sorry your input is not correct. Please try again.");
		return ;

	}
}