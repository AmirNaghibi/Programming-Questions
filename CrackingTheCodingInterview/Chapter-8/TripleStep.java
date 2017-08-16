/*
	A child is runnig up 'n' stairs. He can hop either 1, 2 or 3 steps at a time.
	Count how many possible ways the child can run up stairs?
*/

/*
	Use Dynamic Programming: Top-Down method. Consider f(10,9) which means going to the 10th
	stair from 9 stair its only 1 way
	f(10,9) = 1 way : 9-10
	f(10,8) = 2 ways: 8-9-10 or 8-10
	f(10,7) = 4 ways: 7-8-9-10, or 7-8-10 or 7-9-10 or 7-10

	f(10,6): I can go to 7 and do 4 ways from there OR 
			 I can go to 8 and do 2 ways from there OR 
			 I can go to 9 and do 1 ways from there
			 TOTAL : 4 + 2 + 1 = 7

	f(10,5): I can go to 6 and do 7 ways from there OR 
			 I can go to 7 and do 4 ways from there OR 
			 I can go to 8 and do 2 ways from there
			 TOTAL : 7 + 4 + 2 = 13
*/
import java.lang.Exception;

public class TripleStep{
	
	static int countRecursive(int n){
		if(n==1) return 1;
		if(n==2) return 2;
		if(n==3) return 4;

		return countRecursive(n-1)+countRecursive(n-2)+countRecursive(n-3);
	}


	static int countDynamic(int n){
		return countDynamic(n, new int[n+1]);
	}

	static int countDynamic(int n, int[] memo){
		if(n==0) return 1;
		if(n==1) return 1;
		if(n==2) return 2;
		if(n==3) return 4;

		// memo[0] = 1;
		// memo[1] = 2;
		// memo[2] = 4;

		// for(int i=4; i<n; i++){
		// 	if(memo[i]==0){
		// 		memo[i] = countDynamic(n-1, memo)+countDynamic(n-2, memo)+countDynamic(n-3, memo);
		// 	}
		// }
		if(memo[n]==0) 
			memo[n] = countDynamic(n-1, memo)+countDynamic(n-2, memo)+countDynamic(n-3, memo);

		return memo[n];
	}


	static int countDynamicEfficient(int n){
		if(n==0) return 1;
		if(n==1) return 1;
		if(n==2) return 2;
		if(n==3) return 4;

		int a = 1;
		int b = 2;
		int c = 4;

		for(int i=4; i<n; i++){
			int d = a+b+c;
			a=b;
			b=c;
			c=d;
		}

		return a + b + c;
	}


	public static void main(String[] args) {
		//int result1 = countRecursive(6);
		//System.out.println(result1);

		// int result2 = countDynamic(4);
		// System.out.println(result2);

		int result3 = countDynamicEfficient(6);
		System.out.println(result3);
	}
}