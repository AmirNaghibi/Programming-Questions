/*
	Write a RECURSIVE function to multiply two numbers without using '*' operator. Use bit shifting, +, -
*/

public class RecursiveMultiply{
	
	static int multiply(int a, int b){
		int sum=0;
		for (int i=0; i<a; i++) {
			sum += b;
		}
		System.out.println(sum);
		return sum;
	}

	static int multiplyRecursive(int a, int b){
		if(a==1) return b;
		return b + multiplyRecursive(a-1,b);
	}

	public static void main(String[] args) {
		int result = multiplyRecursive(10,4);
		System.out.println(result);
	}
}