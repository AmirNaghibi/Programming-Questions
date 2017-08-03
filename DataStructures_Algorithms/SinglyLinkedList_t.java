/*
	Implement Singly LinkedList data structure. 
	Methods: 
		- insertHead
		- insertTail
		- removeHead
		- removeTail
		- printLinkedList
		- countNumNodes
		- getHead
		- getTail

*/

// A node in LinkedList
// Each Node had an integer key and a 'link' to next node which
// 			is null initially.		
class Node{
	int key;
	Node next;
	// Construct a node with given key
	Node(int key){
		this.key=key;
		this.next=null;
	} 

	// get the key of the Node
	int getKey(){
		return this.key;
	}
}

// A SinglyLinkedList(i.e SLL) is made out of Nodes which is a class by itself.
//		Also it contains all the methods to modify the nodes.
class SinglyLinkedList_t{
	// SLL has head and tail pointer which are initially null.
	Node head;
	Node tail;
	SinglyLinkedList_t(){
		this.head=null;
		this.tail=null;
	}

	// get the head node
	Node getHead(){return this.head;}
	// get the tail node
	Node getTail(){return this.tail;}


	// insert a node at the begining of LL
	void insertHead(int key){
		// make a new Node
		Node node = new Node(key);
		// If both head and tail are null, point then to the new Node.
		if (this.head==null && this.tail==null) {
			this.head=node;
			this.tail=node;
		}else{
			node.next=head;
			head=node;
		}
	}

	// insert a node at the end of LL
	void insertTail(int key){
		// make a new Node
		Node node = new Node(key);
		// If both head and tail are null, point then to the new Node.
		if (this.head==null && this.tail==null) {
			this.head=node;
			this.tail=node;
		}else{
			this.tail.next=node;
			tail=node;
		}
	}

	// Remove node from begining of LinkedList
	void removeHead(){
		if (this.head==null) return;
		else if (this.head==this.tail) {this.head=this.tail=null;}
		else{
			this.head=this.head.next;
		}
	}


	// Remove node from end of LinkedList
	void removeTail(){
		if (this.tail==null) return;
		else if (this.head==this.tail) {this.head=this.tail=null;}
		else{
			Node temp=this.head;
			while(temp.next.next!=null){temp=temp.next;}
			temp.next=null;
		}
	}


	int countNumNodes(){
		Node temp = head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}

	// Print the LinkedList
	void printLinkedList(){
		// A temporary node that points to head and traverses through LL to print all items
		Node temp = this.head;

		while(temp != null){
			System.out.printf("%d -> ",temp.key);
			temp=temp.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		// Make a SLL object
		SinglyLinkedList_t obj = new SinglyLinkedList_t();
		obj.insertHead(10);
		obj.insertHead(20);
		obj.insertHead(30);
		obj.insertHead(40);
		obj.insertHead(50);
		obj.printLinkedList();

		// obj.insertTail(1);
		// obj.insertTail(2);
		// obj.insertTail(3);
		// obj.insertTail(4);
		// obj.insertTail(5);
		// obj.printLinkedList();

		// obj.removeHead();
		// obj.removeHead();
		
		// obj.removeTail();
		// obj.removeTail();
		

		System.out.println(obj.countNumNodes());
	}


}

/* Challenges!
	- Declaring a constructor NO return type is needed. NOT EVEN VOID.
		public className(parameters) or className(parameters)
	- 	Class within a class? Why? I chosed Node as a separate class than LL.
*/







