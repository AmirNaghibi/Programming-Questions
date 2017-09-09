


public class FindStringInString{
	
	static void containsString(String input, String target){
		if(input.length() < target.length()){
			System.out.println("NO");
			return ;
		}

		int targetIndex=0;
		int currIndex = 0;

		while(currIndex<input.length()){

			if(input.charAt(currIndex) == target.charAt(targetIndex)){
				targetIndex++;
				currIndex++;
				if(targetIndex==target.length()){
					System.out.println("YES");
					return ;
				}
			}
			else
				currIndex++;
		}
		System.out.println("NO");
	}

	public static void main(String[] args) {
		containsString("hereiamstackerrank","hackerrank");
	}
}