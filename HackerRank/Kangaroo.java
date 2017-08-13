/*
	CodeForces Link: https://www.hackerrank.com/challenges/kangaroo
*/
import java.util.Scanner;

public class Kangaroo{

	// static String kangaroo(int x1, int v1, int x2, int v2) {
 //        if(v2>=v1) return "NO";
 //        // count 
 //        int c = 1;
 //        while(x2>x1){
 //            if(x1+(c*v1) == x2+(c*v2)) return "YES";
 //            c++;
 //        }
 //        return "NO";
 //    }

	static String kangaroo(int x1, int v1, int x2, int v2) {
        if(v2>=v1) return "NO";
        
        int c = (x2-x1)/(v1-v2);

        if (((x2-x1)/(v1-v2)) == (int)((x2-x1)/(v1-v2)) return "YES";
        	else return "NO";
    }
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x1 = scan.nextInt();
		int v1 = scan.nextInt();

		int x2 = scan.nextInt();
		int v2 = scan.nextInt();

		String result = kangaroo(x1,v1,x2,v2);
	}
}