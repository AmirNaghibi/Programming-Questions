/*Implement the function fibonacci using Recursion and Dynamic Programing (Memoization) */

public class Fibonacci{
	// Recursive
	int fibonacciRecursive(int n){
		if(n==0 || n==1) return 1;
		else
			return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}


	int fibonacciDynamic(int n){
		return fibonacciDynamic(n, new int[n+1]);
	}

	int fibonacciDynamic(int i, int[] memo){
		if(i==0 || i==1) return 1;
		
		/* WARNING
		NO!!!! --ALSO COULD SET  memo[0] and memo[1] to 1
		memo[0] = 1;
		memo[1] = 1;

		Get ArrayIndexOutOfBoundsException for n=0 or n=1
		*/
		if (memo[i]==0) {
			memo[i] = fibonacciDynamic(i-1,memo) + fibonacciDynamic(i-2, memo);
		}

		return memo[i];
	}


	public static void main(String[] args) {
		Fibonacci obj = new Fibonacci();

		//int result1 = obj.fibonacciRecursive(5);
		int result2 = obj.fibonacciDynamic(0);
		System.out.println(result2);
	}
}