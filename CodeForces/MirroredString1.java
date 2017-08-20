import java.util.Scanner;
import java.lang.StringBuilder;


public class MirroredString1{


	static boolean checkChar(char c){
		//if(s.equals('A'|'H'|'I'|'M'|'O'|'T'|'U'|'V'|'W'|'X'|'Y')) return true;
		boolean answer;
		switch(c){
			case 'A' : answer=true;
			break;
			case 'H' : answer=true;
			break;
			case 'I' : answer=true;
			break;
			case 'M' : answer=true;
			break;
			case 'O' : answer=true;
			break;
			case 'T' : answer=true;
			break;
			case 'U' : answer=true;
			break;
			case 'V' : answer=true;
			break;
			case 'W' : answer=true;
			break;
			case 'X' : answer=true;
			break;
			case 'Y' : answer=true;
			break;
			default : answer=false;
			break;
		}
		return answer;
	}


	public static String isPalindrome(String s){
		StringBuilder sb = new StringBuilder();
		for(int i=s.length()-1; i>=0; i--){
			sb.append(s.charAt(i));
		}
		if (sb.toString().equals(s)) {
			return "yes";
		}else{
			return "no";
		}
	}

	
	public static void isMirrored(String str){
		for(int i=0; i<str.length(); i++){
			if(!checkChar(str.charAt(i))) {
				System.out.println("no");
				return ;
			}
		}
		System.out.println(isPalindrome(str));
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for(int i=0; i<testCase; i++){
			String in = scan.next();
			isMirrored(in);
		}
	}
}