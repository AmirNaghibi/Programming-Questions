/*
	Input a Stack, output a sorted stack in ascending order (i.e smallest on top)
*/

public class SortStack extends Stack_t{

	Stack_t sortStack(Stack_t main){
		Stack_t sorted = new Stack_t();

		while(!main.isStackEmpty()){
			Node curr = main.pop();
			while(!sorted.isStackEmpty() && ((int)curr.getData() > (int)sorted.peek().getData())){
				main.push(sorted.pop());
			}
			sorted.push(curr);
		}
		return sorted;
	}

	public static void main(String[] args) {
		SortStack obj = new SortStack();

		Node<Integer> node1 = new Node<Integer>(1);
		Node<Integer> node2 = new Node<Integer>(2);
		Node<Integer> node3 = new Node<Integer>(3);
		Node<Integer> node4 = new Node<Integer>(4);
		Node<Integer> node5 = new Node<Integer>(5);
		Node<Integer> node6 = new Node<Integer>(6);
		Node<Integer> node7 = new Node<Integer>(7);
		Node<Integer> node8 = new Node<Integer>(8);
		Node<Integer> node9 = new Node<Integer>(9);

		obj.push(node7);
		obj.push(node5);
		obj.push(node9);
		obj.push(node3);
		// obj.push(node4);
		// obj.push(node2);
		// obj.push(node1);
		// obj.push(node8);
		// obj.push(node6);

		obj.printStack();

		SortStack mySortedStack = new SortStack();
		mySortedStack.sortStack(obj).printStack();
	}
}