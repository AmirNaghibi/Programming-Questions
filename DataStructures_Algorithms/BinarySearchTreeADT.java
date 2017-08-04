/** Created on July 1, 2017 by Amir Naghibi
	Implement BST data structure
*/


public class BinarySearchTreeADT{
	// Private Node class
	private static class Node{
		int data;
		Node right;
		Node left;
		// constructor
		Node(int data){this.data=data; right=left=null;}
	}

	// root node
	Node root;

	void insert(Node node){
		root = insert(root, node);
	}

	Node insert(Node currentParent, Node newNode){
		if(currentParent==null) return newNode;
		else if(newNode.data > currentParent.data){currentParent.right = insert(currentParent.right, newNode);}
		else if(newNode.data < currentParent.data){currentParent.left  = insert(currentParent.left , newNode);}
		return currentParent;
	}


	void in_order(Node root){
		if(root != null){
			in_order(root.left);
			System.out.printf("%d ",root.data);
			in_order(root.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTreeADT obj = new BinarySearchTreeADT();

		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		

		obj.insert(n5);
		obj.insert(n3);
		obj.insert(n7);
		obj.insert(n2);
		obj.insert(n4);
		obj.insert(n6);
		obj.insert(n8);

		obj.in_order(obj.root);
		System.out.println("");
	}
}









