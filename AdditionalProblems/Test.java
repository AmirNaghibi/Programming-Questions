import java.util.ArrayList;
import java.util.Arrays;


public class Test{

	static void permutaion(String str){
    permutaion(str,"");
	}
	
	static void permutaion(String str, String prefix){
	    if(str.length() == 0){
	        System.out.println(prefix);
	    } else{
	        for(int i=0; i < str.length(); i++){
	            String rem = str.substring(0,i) + str.substring(i+1);
	            permutaion(rem, prefix + str.charAt(i));
	        }
	    }
	}


	static void insertAllLocations(String main, String app){
		if(main==null) {System.out.println(app); return ;}
		if(app==null) {System.out.println(main); return ;}

		for(int i=0; i<=main.length(); i++){
			String result = main.substring(0,i) + app + main.substring(i,main.length());
			System.out.println(result);
		}
	}	

	public static void main(String[] args) {
		/*
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		//System.out.println(array);

		ArrayList<ArrayList<Integer>> main = new ArrayList<ArrayList<Integer>>();
		main.add(array);
		main.add(array2);
		//System.out.println(main);

		ArrayList<ArrayList<Integer>> side = new ArrayList<ArrayList<Integer>>();
		for(ArrayList<Integer> inner : main){
			ArrayList<Integer> newArr = new ArrayList<Integer>();
			for(int i : inner){
				newArr.add(i);
			}
			newArr.add(77);
			side.add(newArr);
		}

		for(ArrayList<Integer> a : side){
			main.add(a);
		}

		System.out.println(main);
		*/

		// int j = 0123456;
		// String x = "0123456";
		// x = x.substring(0, 0) + "." + x.substring(0, x.length());
		// System.out.println(x);

		// String y = "0123456";
		// y = y.substring(0, 1) + "." + y.substring(1, y.length());
		// System.out.println(y);

		// String z = "0123456";
		// z = z.substring(0, 2) + "." + z.substring(2, z.length());
		// System.out.println(z);
		insertAllLocations("a","b");
	}
}