/*  http://codeforces.com/contest/822/problem/A
	Given input A and B, find the GCD of A! and B!
*/


class FactorialGCD{

	// calculate the factorial of an integer
	int factorial(int n){
		if (n==0) return 1;
		int result =n * factorial(n-1);
		return result;
	}

	// Using Euclidean Algorithm to find GCD
	int euclideanGCD(int a, int b){
		if (a==b) return a;
		int larger = a>b ? a:b;

		
	}

	int gcdFactorial(int a, int b){
		int number_1 = factorial(a);
		int number_2 = factorial(b);

		return 0;
	}
	
	public static void main(String[] args) {
		FactorialGCD obj = new FactorialGCD();

		obj.gcdFactorial(3,4);

		System.out.println(obj.factorial(4));
	}
}


/* Challenges:

	- Euclidean Algorithm GCD
*/