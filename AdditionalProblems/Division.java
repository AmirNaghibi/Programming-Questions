import java.lang.IllegalArgumentException;
 
// int long
// float, double
public class Division{
	
	static double divideDouble(double a, double b) throws IllegalArgumentException{
		if (b == 0) {
    		throw new IllegalArgumentException("Argument 'divisor' is 0");
		}else
			System.out.println(a/b);
			return a/b;	
	}



	static double divideFloat(float a, float b) throws IllegalArgumentException{
		if (b == 0) {
    		throw new IllegalArgumentException("Argument 'divisor' is 0");
		}else
			System.out.println(a/b);
			return a/b;	
	}



	public static void main(String[] args) {
		// divideDouble(4,21);
		// divideFloat(4,21);
		// long result = 2200000000;
		System.out.println(9132200008768680000L);
		// System.out.println(5.0001d);
		// System.out.println(5L);

	}
}