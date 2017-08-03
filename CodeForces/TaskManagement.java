/*
	http://codeforces.com/gym/101439/attachments/download/5742/2017-yandexalgorithm-qualification-round-en.pdf
*/

import java.util.Scanner;
import java.util.ArrayList;


class TaskManagement{
	
	// n : number of tasks 
	// arr: array of tasks
	static int countNumberOfLoops(ArrayList<Integer> arr){
		int targetTask = 1;
		int finalTask = arr.size();
		int index=0;
		int count =0;

		while(targetTask != finalTask+1){
			if(index%arr.size()==0) count++;
			if(arr.get(index%arr.size())==targetTask) targetTask++;
			index++;
		}
		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// make a static array of size n
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i=0; i<n; i++) {
			int item = scan.nextInt();
			arr.add(item);
		}

		countNumberOfLoops(arr);
	}
}

/*
	import java.util.Scanner;
	import java.util.ArrayList;


	public class TaskManagement{
	
	// n : number of tasks 
	// arr: array of tasks
	static int countNumberOfLoops(ArrayList<Integer> arr){
		int loopCount = 1;
        for (int i=0; i<arr.size()-1; i++) {
            if (arr.get(i) > arr.get(i+1)) {
                loopCount++;
            }
        }
        
		return loopCount;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// make a static array of size n
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i=0; i<n; i++) {
			int item = scan.nextInt();
			arr.add(item);
		}

		countNumberOfLoops(arr);
	}
}
*/