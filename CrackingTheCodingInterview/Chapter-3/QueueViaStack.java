/*
	Implement a Queue(FIFO) via a Stack(LIFO)
*/

// Uses 2 stacks to implement Queue
public class QueueViaStack extends Stack_t {

	Stack_t mainStack;
	Stack_t tempStack;

	public QueueViaStack(){
		// WorkSpace
		mainStack = new Stack_t();
		// Used when pop
		tempStack = new Stack_t();
	}


	void enqueue(Node item){
		mainStack.push(item);
		//mainStack.printStack();
	}


	Node dequeue(){
		for (int i=1; i<mainStack.numNodes; i++) {
			tempStack.push(mainStack.pop());
			mainStack.top=mainStack.top.below;
		} // All items exept first in was pushed to temp stack

        //////////*#*#*#*#*#*#*#*#????/////// added <> to actual type. Warnings gone!
		Node dequeuedNode = new Node<>(mainStack.top);
		mainStack.top=null;

		// Push items back to main stack
		for(int i=0; i<tempStack.numNodes; i++) {
			mainStack.push(tempStack.top);
			tempStack.top=tempStack.top.below;
			tempStack.numNodes--;
		}

		tempStack.isEmpty=true;
		tempStack.top=null;


		mainStack.numNodes--;
		//mainStack.printStack();
		return dequeuedNode;
	}

	public static void main(String[] args) {
		QueueViaStack obj = new QueueViaStack();

        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(4);
        Node<Integer> node5 = new Node<Integer>(5);
		obj.enqueue(node1);
		obj.enqueue(node2);
		obj.enqueue(node3);
		obj.enqueue(node4);
		obj.enqueue(node5);
        obj.printStack();
		obj.dequeue();

        obj.printStack();
		//obj.dequeue();

	}
}






























