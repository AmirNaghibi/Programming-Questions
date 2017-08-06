/*Implement modulu function and analyze its Runtime Complexity*/

public class Modulu{
	
	// returns a%b
	int mod(int a, int b){
		if(b<=0) return -1;
		int temp_a = a;
		while(temp_a>b){
			temp_a -= b;
		}
		return temp_a;
	}

	// More Elegant solution
	int mod_v2(int a, int b){
		if(b<=0) return -1;
		// q is quotient
		int q = a/b;
		return a - q*b;
	}
	public static void main(String[] args) {
		Modulu obj = new Modulu();
		int result = 123%4;
		System.out.println(result);
	}
}

/*Runtime Analysis: BigO : O(1) it's a constant runtime*/