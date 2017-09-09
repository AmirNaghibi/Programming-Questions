/*
	Steve has a string, , consisting of  lowercase English alphabetic letters. In one operation, 
	he can delete any pair of adjacent letters with same value. For example, string "aabcc" would 
	become either "aab" or "bcc" after operation.

	Steve wants to reduce  as much as possible. To do this, he will repeat the above operation as 
	many times as it can be performed. Help Steve out by finding and printing 's non-reducible form!
*/

public class ReduceString{
	

	// removes the FIRST set of adjacent chars in a string
	static String removeAdjChar(String str){
		if(str.length()==0 || str.length()==1) return str;

		int index=0;
		while(index < str.length()-1){
			if(str.charAt(index)==str.charAt(index+1)){
				str = str.substring(0,index) + str.substring(index+2);
				return str;
			}
			index++;
		}
		return str;
	}


	// checks if a string has same adjacent chars
	static boolean sameAdjChar(String str){
		if(str.length()==0 || str.length()==1) return false;
		int index=0;

		for(int j=0; j<str.length()-1; j++){
			if(str.charAt(index)==str.charAt(index+1))
				return true;
			index++;
		}
		return false;
	}


	// repeatedly calles the removeAdjChar until there is not more same adj chars.
	static String remvoeAllAdjChars(String str){
		while(sameAdjChar(str)){
			str = removeAdjChar(str);
		}
		if(str.length()==0){
			return "Empty String";
		}
		else
			return str;
	}



	public static void main(String[] args) {
		String s = new String("aaabccddd");
		String result = remvoeAllAdjChars(s);

		System.out.println(result);
	}
}