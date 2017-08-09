import java.util.LinkedList;
import java.util.HashSet;
import java.util.ArrayList;

class RemoveDups2_1{

	void printLinkedList(LinkedList<Integer> list){
		for (int i=0; i<list.size(); i++) {
			System.out.printf("%d -> ",list.get(i));
		}
		System.out.println("NULL");
	}

	// Remove all the 
	void removeDuplicates(LinkedList<Integer> list){
		// HashSet cannot have duplicate
		HashSet<Integer> set = new HashSet<Integer>();
		// ArrayList to hold duplicate elements
		ArrayList<Integer> duplicatesBuffer = new ArrayList<Integer>();

		for (int i=0; i<list.size(); i++) {
			// If add is not successful (i.e item already exist in Set)
			if (!set.add(list.get(i))) {
				// Remove the element at that index from the LL
				duplicatesBuffer.add(list.get(i));
			}
		} // By the end of loop, duplicatesBuffer has all duplicate elements

		for (int i=0; i<duplicatesBuffer.size(); i++) {
			list.removeFirstOccurrence(duplicatesBuffer.get(i));
		}
	}
	
	public static void main(String[] args) {
		RemoveDups2_1 obj = new RemoveDups2_1();
		LinkedList<Integer> ll = new LinkedList<Integer>();

		
		for (int i=0, j=0; i<=10 && j<=10; i++,j++) {
			ll.add(i);
			ll.add(j);
		}

		obj.printLinkedList(ll);

		obj.removeDuplicates(ll);
		obj.printLinkedList(ll);
	}
}


/* Challenges
	- When you remove an element, the indecies would change. Iteration problem.
	- Indicate the type of elements in LinkedList and Set

*/