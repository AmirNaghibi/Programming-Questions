// Implement an Algorithm to determine if a string has all unique characters.


class IsUnique{
	
	boolean isUniqueString(String input){
		int[] asciiArr = new int[128];
		for (char c: input.toCharArray()) {
			if (asciiArr[(int)c]!=0) {
				return false;
			}else{
				asciiArr[(int)c]=(int)c;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		IsUnique obj = new IsUnique();

		boolean result = obj.isUniqueString("UBCC");
		System.out.println(result);
	}
}