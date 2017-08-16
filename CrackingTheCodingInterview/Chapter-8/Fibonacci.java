/*Implement the function fibonacci using Recursion and Dynamic Programing (Memoization) */

public class Fibonacci{
	// Recursive
	int fibonacciRecursive(int n){
		if(n==0 || n==1) return 1;
		else
			return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}


	// Calls the helper method
	int fibonacciDynamic(int n){
		return fibonacciDynamic(n, new int[n+1]);
	}

	// Memo referes to memoization. Caching the data.
	int fibonacciDynamic(int i, int[] memo){
		if(i==0 || i==1) return 1;
		
		/* WARNING
		NO!!!! --ALSO COULD SET  memo[0] and memo[1] to 1
		memo[0] = 1;
		memo[1] = 1;

		Get ArrayIndexOutOfBoundsException for n=0 or n=1g
		*/
		if (memo[i]==0) {
			memo[i] = fibonacciDynamic(i-1,memo) + fibonacciDynamic(i-2, memo);
		}

		return memo[i];
	}



	// This is memory efficient, since we are not creating a brand new array and 
	//		computing results again. We just store the last two numbers
	int fibonacciEfficient(int n){
		if(n==0 || n==1) return 1;

		int a = 1;
		int b = 1;
		for (int i=2; i<n; i++) {
			int c = a + b;
			a = b;
			b=c;
		}
		return a + b;
	}


	public static void main(String[] args) {
		Fibonacci obj = new Fibonacci();

		//int result1 = obj.fibonacciRecursive(5);
		//int result2 = obj.fibonacciDynamic(0);
		int result3 = obj.fibonacciEfficient(40);
		System.out.println(result3);
	}
}