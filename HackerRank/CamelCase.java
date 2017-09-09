/*
	Given a camelCase string with the fist word all lower case, return
	the total number of words in the string.
*/




public class CamelCase{
	

	static int countWords(String s){
		if(s.length()==0) return 0;

		int total=0;

		for(int i=0; i<s.length(); i++){
			int ascii = (int) s.charAt(i);
			if(ascii>= 65 && ascii<=90)
				total++;
		}
		return total+1;
	}


	public static void main(String[] args) {
		int result = countWords("theUniversityOfBritishColumbiaIsBeautiful");

		// %03d upto 3 digits
		System.out.printf("%03d%n",result);
	}
}