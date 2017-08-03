/**Implement BST and print the tree in-order.*/


public class BST{

	private static class Node{
		int data;
		Node right;
		Node left;
		//constructor HAS NO RETURN TYPE
		private Node(int data){this.data=data;}
	}

	Node root;
	//constructor HAS NO RETURN TYPE
	private BST(){this.root=null;}

	public void insertNode(Node node){
		this.root = insertNode(root, node);
	}

	private Node insertNode(Node currentParent, Node newNode){
		if(currentParent==null) currentParent=newNode;
		else if(newNode.data > currentParent.data) 
			currentParent.right = insertNode(currentParent.right, newNode);
		else if(newNode.data < currentParent.data)
			currentParent.left = insertNode(currentParent.left, newNode);

		return currentParent;
	}

	private void print_in_order(Node root){
		if(root!=null){
			print_in_order(root.left);
			System.out.printf("%d \n",root.data);
			print_in_order(root.right);
		}
	}



	public static void main(String[] args) {
		BST tree = new BST();

		Node n1 = new Node(8);
		tree.insertNode(n1);
		tree.insertNode(new Node(4));
		tree.insertNode(new Node(12));
		tree.insertNode(new Node(2));
		tree.insertNode(new Node(6));
		tree.insertNode(new Node(10));
		tree.insertNode(new Node(14));

		tree.print_in_order(tree.root);
	}
}