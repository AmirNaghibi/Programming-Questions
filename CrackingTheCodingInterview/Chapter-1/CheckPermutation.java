import java.util.ArrayList;


class CheckPermutation{
	ArrayList<Character> array;

	boolean isPermutation(String str_1, String str_2){
		if (str_1.length() != str_2.length()) {return false;}
		int[] asciArray = new int[128];
		for (int i=0; i<str_1.length(); i++) {
			char c = str_1.charAt(i);
			int index=(int)c;
			asciArray[index]++;
		}

		for (int i=0; i<str_2.length(); i++) {
			char c = str_2.charAt(i);
			int index=(int)c;
			asciArray[index]--;
			if (asciArray[index]<0){return false;}
		}
		return true;
	}




	public static void main(String[] args) {
		CheckPermutation obj = new CheckPermutation();

		boolean result = obj.isPermutation("ubca","cabu");

		System.out.println(result);
	}
}

/* Method 1: Sort both strings and compare. Use char[] content; and java.util.Arrays.sort(content)
			return new String(content);
	
	Method 2: use 128 array. for each char, increament the correct array index. for each char
			on other string, decreament the correct index. if index is less than zero, false
*/