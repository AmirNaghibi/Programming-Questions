// Implement a method to perform String Compression. aabcccccaaa --> a2b1c5a3
import java.lang.StringBuilder;

class StringCompressionV2{
	
	String compressString(String str){
		StringBuilder sb = new StringBuilder();
		int[] asciiArray = new int[128];

		boolean flag=false;

		for (int i=0; i<str.length(); i++) {
			asciiArray[str.charAt(i)]++;
			if(((flag) && (str.charAt(i) != str.charAt(i-1)))||(i==str.length()-1)){
				int count = asciiArray[str.charAt(i-1)];
				// if((str.charAt(i-2)==str.charAt(i-1))){
				// 	count++;
				// }
				asciiArray[str.charAt(i-1)] = 0;
				sb.append(str.charAt(i-1));
				sb.append(count);
			}

			if(i==0)flag=true;
		}

		if(str.charAt(str.length()-1) != str.charAt(str.length()-2)){
			sb.append(str.charAt(str.length()-1));
			sb.append(1);
		}

		return sb.toString();

	}


	public static void main(String[] args) {
		StringCompressionV2 obj = new StringCompressionV2();
		String answer=obj.compressString("aabcccccaaabbc");
		System.out.println(answer);
	}
}


/* Challenges and Notes:

	- Tricky corner cases for the FIRST and LAST character.

*/