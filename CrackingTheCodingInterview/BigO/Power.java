/*
	Implement the power function and analyze its runtime.
*/


public class Power{
	
	// returns the int result of a^b
	int power(int a, int b){
		if(b<0) return -1;
		if(b==0) return 1;
		else
			return a * power(a, b-1);
	}


	public static void main(String[] args) {
		Power obj = new Power();
		int result = obj.power(2,3);
		System.out.println(result);
	}
}

/*Runtime analysis of power:
	Time complexity: O(b)
	Space complexity: O(b), b is the same as number of calls on call stack.
*/