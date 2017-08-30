/*
	Implementation of Binary Search Tree. Methods:
	- insert(Node node)
	- numNodes()
	- isEmpty()
	- isBST()
	- in_order()
	- pre_order()
	- post_order()
*/


public class BinaryTree{
	
	private class Node{
		int data;
		Node left, right;
		// constructor
		Node(int data){this.data=data; left=right=null;}
	}

	Node root;
	int totalNumberOfNodes;
	// constructor
	BinaryTree(){this.root=null; this.totalNumberOfNodes=0;}


	//==========================================================
	// 						  GENERAL METHODS
	//==========================================================
	boolean isEmpty(){
		if(this.totalNumberOfNodes==0) return true;
		else
			return false;
	}


	int numNodes(){
		return this.totalNumberOfNodes;
	}


	void insert(Node newNode){
		this.root = insert(newNode,this.root);
	}
	Node insert(Node node, Node currentParent){
		if(currentParent==null) return node;
		// update right subtree
		else if(node.data > currentParent.data){
			currentParent.right = insert(node, currentParent.right);
		}
		// update left subtree
		else if(node.data < currentParent.data){
			currentParent.left = insert(node, currentParent.left);
		}
		return currentParent;
	}


	//==========================================================
	// 				   TREE TRAVERSAL METHODS
	//==========================================================
	void pre_order(Node root){
		if(root != null){
			System.out.println(root.data);
			pre_order(root.left);
			pre_order(root.right);
		}
	}


	void in_order(Node root){
		if(root != null){
			in_order(root.left);
			System.out.println(root.data);
			in_order(root.right);
		}
	}


	void post_order(Node root){
		if(root != null){
			post_order(root.left);
			post_order(root.right);
			System.out.println(root.data);
		}
	}



	public static void main(String[] args) {
		
	}
}