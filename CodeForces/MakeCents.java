import java.util.Scanner;
import java.util.HashMap;


public class MakeCents{
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// get num test case
		int numTest = scan.nextInt();

		for(int i=0; i<numTest; i++){
			float total=0;
			// make a hashmap
			HashMap<String,Float> map = new HashMap<String,Float>();
			int numCurrencies = scan.nextInt();
			int numCompetition = scan.nextInt();

			// populate hashmap
			for(int j=0; j<numCurrencies; j++){
				String key = scan.next();
				float value = scan.nextFloat();
				map.put(key,value);
			}
			// PERFECT
			//System.out.println(map);

			for (int k=0; k<numCompetition; k++) {
				float amount = scan.nextFloat();
				String currencyKey = scan.next();

				if(currencyKey.equals("JD")){
					total += amount;
				}else{
						float value = map.get(currencyKey);

						float multiply = amount*value;

						total += multiply;
					}
			}

			System.out.println(total);

		}

	}
}