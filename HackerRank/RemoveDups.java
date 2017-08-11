/* Write a method that removes douplicate from a LinkedList

	1. copy all elements of LL to a set
	2. clear all elements of LL
	3. copy all elements of Set to the LL
	NOTE: a Set is a data structure with no douplicates 
*/

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDups{
	
	void removeDuplicates(LinkedList<Integer> ll){
		Set s = new HashSet<Integer>();
		s.addAll(ll);
		ll.clear();
		ll.addAll(s);
	}

	public static void main(String[] args) {
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		RemoveDups obj = new RemoveDups();

		myLinkedList.add(1);
		myLinkedList.add(1);
		myLinkedList.add(2);
		myLinkedList.add(2);
		myLinkedList.add(3);
		myLinkedList.add(3);
		myLinkedList.add(4);
		myLinkedList.add(4);
		myLinkedList.add(5);
		myLinkedList.add(5);
		myLinkedList.add(6);
		myLinkedList.add(6);
		


		// print the origial list
		for (int i=0; i<myLinkedList.size(); i++) {
			System.out.printf("%d ",myLinkedList.get(i));
		}
		System.out.println(" ");

		// call remove duplicates
		obj.removeDuplicates(myLinkedList);

		// print the updated list
		for (int i=0; i<myLinkedList.size(); i++) {
			System.out.printf("%d ",myLinkedList.get(i));
		}
		System.out.println(" ");



	}
}