import java.util.ArrayList;
import java.lang.StringBuilder;

public class StringCompression{
	
	String arrayListToString(ArrayList<Character> al){
		StringBuilder sb = new StringBuilder();
		for (char c : al) {
			sb.append(c);
		}
		return sb.toString();
	}	
	String compressString(String input){
		// a list of unique characters
		ArrayList<Character> compressedList = new ArrayList<Character>();
		for (char c: input.toCharArray()) {
			if (!compressedList.contains(c))
				compressedList.add(c);
		} // compressedList is populated with unique chars

		String result = arrayListToString(compressedList);
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		StringCompression obj = new StringCompression();
		obj.compressString("aaaabbbbccccdeefff");
	}
}