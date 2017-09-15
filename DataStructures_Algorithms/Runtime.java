
/*
	The runtime for this question is O(n^2);
	the outer loop runs for n iteration. 
	during the first iteration of i, j runs n times
	during the second iteration of i, j runs n-1 times 
	during the thrid iteration of i, j runs n-1 times
	and so on ...
	So the total number of iterations of j is
	n + (n-1) + (n-2) + (n-3) + ... + 1 = n(n+1)/2  ------> O(n)


	The total runtime is n * O(n) == O(n^2)
*/

public class Runtime{
	
	public static void main(String[] args) {
		int i,j;

		for(i=50; i>=1; i--){
			for(j=1; j<=i; j++){
				System.out.printf("*");
			}
			System.out.printf("\n");
		}		
	}	
}