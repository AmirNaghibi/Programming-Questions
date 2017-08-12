import java.util.ArrayList;
/*
	Given two strings, write a method to decide if one is a permutation of the other.
	god & dog   
*/

public class CheckPermutation{
	public ArrayList<String> permutationList = new ArrayList<String>();
	// return a string array of all permutation of a string

	void permutation(String str){
		permutation(str,"");
	}

	void permutation(String str, String prefix){
		if (str.length()==0) {
			//System.out.println(prefix);
			permutationList.add(prefix);
		} else{
			for (int i=0; i<str.length(); i++) {
				String rem = str.substring(0,i) + str.substring(i+1);
				permutation(rem,prefix+str.charAt(i));
			}
		}
	}

	boolean isPermutationOf(String a, String b){
		permutation(a);
		return permutationList.contains(b);
	}

	public static void main(String[] args) {
		CheckPermutation obj = new CheckPermutation();
		System.out.println(obj.isPermutationOf("secure","rescue"));
	}
}	