/*
	Implement a function to check if a LinkedList is a Palindrome
*/
import java.util.LinkedList;
import java.util.ArrayList;


public class PalindromeLL{
	
	boolean isPalindrome(LinkedList l){
		// if even number of items
		int linkedListSize = l.size();

		if (l.size()%2 ==0) {
			ArrayList firstHalfForward = new ArrayList();
			ArrayList secondHalfBackward = new ArrayList();

			for (int i=0; i< linkedListSize/2; i++) {
				firstHalfForward.add(l.get(i));
			}

			for (int i=linkedListSize-1; i>(linkedListSize/2)-1; i--) {
				secondHalfBackward.add(l.get(i));
			}

			if (firstHalfForward.equals(secondHalfBackward)) {
				return true;
			}else{
				return false;
			}
		}

		// if odd number of items
		if (l.size()%2 !=0) {
			ArrayList firstHalfForward = new ArrayList();
			ArrayList secondHalfBackward = new ArrayList();

			for (int i=0; i< linkedListSize/2; i++) {
				firstHalfForward.add(l.get(i));
			}

			for (int i=linkedListSize-1; i>(linkedListSize/2); i--) {
				secondHalfBackward.add(l.get(i));
			}

			if (firstHalfForward.equals(secondHalfBackward)) {
				return true;
			}else{
				return false;
			}
		}
		return true;
	}


	void printLinkedList(LinkedList l){
		for (int i=0; i<l.size(); i++) {
			System.out.printf("%d -> ",l.get(i));
		}
		System.out.printf("null");
		System.out.println(" ");
	}

	public static void main(String[] args) {
		PalindromeLL obj = new PalindromeLL();
		LinkedList<Integer> ll_1 = new LinkedList<Integer>();
		 ll_1.add(1);
		 ll_1.add(2);
		 ll_1.add(3);
		// ll_1.add(4);
		 ll_1.add(3);
		 ll_1.add(2);
		 ll_1.add(1);
		 ll_1.add(7);

		 obj.printLinkedList(ll_1);
		System.out.println(obj.isPalindrome(ll_1));

	}
}