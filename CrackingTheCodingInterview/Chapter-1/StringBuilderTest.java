import java.lang.StringBuilder;



class StringBuilderTest{

	String joinWords(String[] words){
		StringBuilder sb = new StringBuilder();

		for(String w : words){
			sb.append(w);
		}
		String result = sb.toString();
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		String[] arr = new String[]{"amir ","arnel ","arya ","ashkan ","aloyna"};

		StringBuilderTest obj = new StringBuilderTest();
		obj.joinWords(arr);
	}
}