// Implement Singly Linked List

public class SinglyLinkedList{
	

	// A node in a singly linked list
	// each node has a Unique ID
	// 		and a pointer to the next node.
	public static class Node{
		int ID;
		Node next;
		// constructor
		 Node(int id){
			this.ID = id;
			this.next = null;
		}
	}


	// each linked list has two pointers
	// 		Start : points to the first Node
	// 		End : points to the last Node 
	Node start;
	Node end;

	// constructor
	SinglyLinkedList(){
		this.start=null;
		this.end=null;
	}



	// return true if the Linked List is Empty
	boolean isEmpty(){
		// ternary statement
		return (start==null) ? true:false;
	}



	// insert a Node into the Singly Linked List
	void insert(Node newNode){
		if(this.isEmpty()){
			this.start=newNode;
			this.end=newNode;
		}else{
			// connect the last node to new node
			this.end.next = newNode;
			// update the end pointer
			this.end = newNode;
		}
	}



	// return true if the linked list contains the node with given id
	boolean contains(int id){
		if(this.isEmpty()){
			System.out.println("The linked list is empty.");
			return false;
		}
		// make a temporary Node pointer
		Node temp = start;
		while(temp.ID != id){
			// move the pointer
			temp = temp.next;
			// hit the null means node with given id not found
			if(temp==null)
				return false;
		}
		// found the Node with given ID
		return true;
	}



	// remove the node with given ID from the linked list
	void removeNodeWithId(int id){
		// if linked list does not contain the node with given id
		if(!this.contains(id)){
			System.out.println("Node does not exist inside the linked list");
			return ;
		}

		// if the node exist : 
		// find the node
		Node temp = this.start;
		if(temp.ID==id){
			this.start=start.next;
			temp.next=null;
			// we are done!
			return ;
		}

		// target node is not the first node
		while(temp.next.ID != id){
			temp = temp.next;
		}
		// found the node for which the next node is the target
		Node middle = temp.next;
		temp.next = middle.next;
		middle.next = null;
		System.out.println("Removed node with ID "+id);
		// we are done 
		return;
	}



	// Print the Linked List
	void printLinkedList(){
		if(this.isEmpty()){
			System.out.println("The linked list is empty");
			return ;
		}
		// linked list is not empty
		Node temp = start;
		while(temp!=null){
			System.out.printf("%d --> ",temp.ID);
			temp = temp.next;
		}
		System.out.println("NULL");
	}




	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);


		SinglyLinkedList sl = new SinglyLinkedList();
		sl.insert(n1);
		sl.insert(n2);
		sl.insert(n3);
		sl.insert(n4);
		sl.insert(n5);
		sl.insert(n6);


		sl.printLinkedList();


		sl.removeNodeWithId(4);
		sl.printLinkedList();
	}
}