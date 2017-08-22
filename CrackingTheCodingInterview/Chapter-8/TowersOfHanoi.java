


import java.util.Scanner;

public class TowersOfHanoi {

   public static void solve(int n, String start, String auxiliary, String end) {
       if (n == 1) {
           System.out.println(start + " -> " + end);
       } else {
           solve(n - 1, start, end, auxiliary);
           System.out.println(start + " -> " + end);
           solve(n - 1, auxiliary, start, end);
       }
   }


   // another implementation
   public static void solveHanoi(int n, String start, String end, String auxiliary) {
       if(n==1) System.out.println(start+" -> "+end);
       else{
        // move n-1 from first to second
        solveHanoi(n-1, start, auxiliary, end);
        System.out.println(start+" -> "+end);
        solveHanoi(n-1,auxiliary,end,start);
       }
   }

   public static void main(String[] args) {
       //System.out.println("Enter number of discs: ");
       Scanner scanner = new Scanner(System.in);
       //int discs = scanner.nextInt();
       solveHanoi(3, "A", "C", "B");
       System.out.println("\n\n\n");
       solve(3, "A", "B", "C");
   }
}