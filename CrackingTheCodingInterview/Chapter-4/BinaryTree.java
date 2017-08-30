/*
	Implementation of Binary Search Tree. Methods:
	- insert(Node node)
	- numNodes()
	- isEmpty()
	- isBST()
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
	// 						   METHODS
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



	public static void main(String[] args) {
		
	}
}