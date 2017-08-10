




public class Modulu{

	int mod(int a, int b){
		int dividened = a;
		int divisor = b;
		int quotient = dividened/divisor;

		int quotient_divisor_product = quotient*divisor;
		int remainder = dividened - quotient_divisor_product;

		System.out.println(remainder);
		return remainder;
	}
	

	public static void main(String[] args) {
		Modulu obj = new Modulu();
		//obj.mod(38,7);
		obj.mod(50,9);
	}
}