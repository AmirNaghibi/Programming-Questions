public class SquareRoot{
	
	// return square root of input 
	int square(int n){
		if(n<0) return -1;

		for(int i=0; i*i<=n; i++){
			if(i*i==n) return i;
		}

		System.out.println("Input n is not a perfect square.");
		return -1;

	}
	public static void main(String[] args) {
		SquareRoot obj = new SquareRoot();
		int result = obj.square(6);
		System.out.println(result);
	}
}
/*BigO analysis: the for loop in square function goes from i=0 to i^2=n. In other words, it
	it goes loops until i=sqrt(n). So O(sqrt(n)) */
