/*
parse my lunch bill, which contains the base price, tips, discounts, 
coupons, and extras and find out if my lunch was $0 or less. 
i.e did i have a free lunch?
*/

import java.util.Scanner;

public class FreeLunch{
	
	// constructor
	void FreeLunch(){}

	void free(double base, double tip, double discount, double extra, int coupon){
		double total = (base*((tip/100)+1)*(1-(discount/100)))+extra-coupon;
		System.out.println("The total is "+total);
		if (total<=0) {
			System.out.println("Congradulations! You had a free lunch");
		}else
			System.out.println("You should pay for your lunch");
	}
	public static void main(String[] args) {
		
		FreeLunch myFreeLunch = new FreeLunch();
		System.out.println("Welcome to Free Lunch Calculator!");

		// METHOD 1
		// base
		Scanner base = new Scanner(System.in);
		System.out.println("What is the base price?");
		double userBase = base.nextDouble();

		// tip
		Scanner tip = new Scanner(System.in);
		System.out.println("What is the tip percentage?");
		double userTip = tip.nextDouble();

		// discount
		Scanner discount = new Scanner(System.in);
		System.out.println("What is the discount percentage?");
		double userDiscount = discount.nextDouble();

		// extra
		Scanner extra = new Scanner(System.in);
		System.out.println("What is the extra amount?");
		double userExtra = extra.nextDouble();

		// coupon
		Scanner coupon = new Scanner(System.in);
		System.out.println("What is the coupon amount?");
		int userCoupon = coupon.nextInt();


		// call free
		// double, int, int, double, int
		//System.out.println("before");
		myFreeLunch.free(userBase,userTip,userDiscount,userExtra,userCoupon);
		//System.out.println("after");
	}
}