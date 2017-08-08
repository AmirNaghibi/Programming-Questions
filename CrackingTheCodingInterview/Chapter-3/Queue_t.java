/*
	Implement Queue Data Structure.
*/


public class Queue_t{
	// Node is a generic type
	private static class Node<T>{
		T data;
		Node previous;
		public Node(T data){this.data=data;this.previous=null;}

		T getData(){return this.data;}
	}


	Node front;
	Node back;
	boolean isEmpty;
	int numNodes;
	public Queue_t(){
		front=null;
		back=null;
		isEmpty=true;
		numNodes=0;
	}

	int numberOfNodes(){return numNodes;}

	void enqueue(Node node){
		if (this.isEmpty) {front=back=node; node.previous=null;numNodes++; this.isEmpty=false;}
		else{back.previous=node; back=node; node.previous=null;numNodes++;}
	}

	Node deQueue(){
		if(this.isEmpty)return null;
		if(front==back){Node temp=front;front=back=null;numNodes--; this.isEmpty=true;return temp;}
		else{
			Node temp=front;
			front=front.previous;
			temp.previous=null;
			numNodes--;
			return temp; 
		}

	}

	void printQueue(){
		Node temp=front;
		System.out.printf("FRONT ");
		for (int i=0; i<numNodes; i++) {
			System.out.printf("%s ",temp.getData());
			temp=temp.previous;
		}
		System.out.printf("BACK \n");
	}

	public static void main(String[] args) {
		//Queue_t myQueue = new Queue_t();
		// Integer Nodes
		// Node<Integer> nodeI_1 = new Node<Integer>(1);
		// Node<Integer> nodeI_2 = new Node<Integer>(2);
		// Node<Integer> nodeI_3 = new Node<Integer>(3);
		// Node<Integer> nodeI_4 = new Node<Integer>(4);
		// Node<Integer> nodeI_5 = new Node<Integer>(5);

		// myQueue.enqueue(nodeI_1);
		// myQueue.enqueue(nodeI_2);
		// myQueue.enqueue(nodeI_3);
		// myQueue.enqueue(nodeI_4);
		// myQueue.enqueue(nodeI_5);

		// myQueue.deQueue();
		// myQueue.deQueue();
		// myQueue.deQueue();
		// myQueue.deQueue();
		// myQueue.deQueue();

		// System.out.println("Number of Nodes: "+myQueue.numberOfNodes());
		// myQueue.printQueue();


		//=============================================================================
		//=============================================================================
		// String Nodes
		Queue_t myQueueString = new Queue_t();

		Node<String> nodeS_1 = new Node<String>("A");
		Node<String> nodeS_2 = new Node<String>("B");
		Node<String> nodeS_3 = new Node<String>("C");
		Node<String> nodeS_4 = new Node<String>("D");
		Node<String> nodeS_5 = new Node<String>("E");

		myQueueString.enqueue(nodeS_1);
		myQueueString.enqueue(nodeS_2);
		myQueueString.enqueue(nodeS_3);
		myQueueString.enqueue(nodeS_4);
		myQueueString.enqueue(nodeS_5);

		myQueueString.deQueue();
		myQueueString.deQueue();
		// myQueueString.deQueue();
		// myQueueString.deQueue();
		// myQueueString.deQueue();

		System.out.println("Number of Nodes: "+myQueueString.numberOfNodes());
		myQueueString.printQueue();

	}
}





