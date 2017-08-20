import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class LazyPhysicsCat{
	
	public static void main(String[] args) {
		// double s,r=19.31852,a=30;
  //     	s=(Math.pow(r,2)/2)*((3.14*a/180)-Math.sin((3.14/180)*a));
  //     	System.out.println("\nArea of a Circle Segment = "+s);
		double pi = 22/7;
		double radius = 19.31852;
		double angle = 30;
		double sur_area = (Math.pow(pi*radius,2) * (angle/360));
		System.out.println(sur_area);
	}
}