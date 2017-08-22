
public class Stack_V2{
	
	private static class Node<T>{
		Node bottom;
		T data;
		Node(T data){this.data=data; bottom=null;}
	}

	Node top;
	int numNodes;
	Stack(){top=null;numNodes=0;}

	int getNumNodes(){return numNodes;}
	boolean isEmpty(){return numNodes==0 ? true:false;}


	void push(Node node){
		if(top==null) {this.top=node;numNodes++;}
		else{
			node.bottom=top;
			this.top=node;
			this.numNodes++;
		}
	}


	void pop(Stack stack){
		if(stack.isEmpty()) {System.out.println("Stack is empty"); return;}
		else
			stack.top = stack.top.bottom;
	}


	static void printStack(Stack stack){
		Node temp = stack.top;
		for(int i=0; i<stack.getNumNodes(); i++){
			System.out.printf("| %d |\n",temp.data);
			temp=temp.bottom;
		}
		System.out.println("|===|");
	}

	public static void main(String[] args) {
		Node n1 = new Node<Integer>(1);
		Node n2 = new Node<Integer>(2);
		Node<Integer> n3 = new Node<Integer>(3);
		Node<Integer> n4 = new Node<Integer>(4);

		Stack_V2 stack_1 = new Stack_V2();
		stack_1.push(n1);
		stack_1.push(n2);
		stack_1.push(n3);
		stack_1.push(n4);
		printStack(stack_1);
		System.out.println("\n\n\n\n");



		Node<Integer> n5 = new Node<Integer>(5);
		Node<Integer> n6 = new Node<Integer>(6);
		Node<Integer> n7 = new Node<Integer>(7);
		Node<Integer> n8 = new Node<Integer>(8);

		Stack_V2 stack_2 = new Stack_V2();
		stack_2.push(n5);
		stack_2.push(n6);
		stack_2.push(n7);
		stack_2.push(n8);
		printStack(stack_2);
		
	}
}