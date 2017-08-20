import java.util.Scanner;

public class MagicalBamboo{
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numTestCase = scan.nextInt();

myloop:		for(int i=0; i<numTestCase; i++){
			int numBamboo = scan.nextInt();

			int firstBamboo = scan.nextInt();
			
			if(firstBamboo%2==0){
				for(int j=0; j<numBamboo-1; j++){
					int height = scan.nextInt();
					if(height%2==1){
						System.out.println("no");
						continue myloop;
					}
				}
			}
			else{
				for(int k=0; k<numBamboo-1; k++){
					int height = scan.nextInt();
					if(height%2==0){
						System.out.println("no");
						continue myloop;
					}
				}
			}
			System.out.println("yes");
		}
	}
}