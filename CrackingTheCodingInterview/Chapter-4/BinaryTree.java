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
import java.util.ArrayList;
import java.util.AbstractQueue;

public class BinaryTree{
	
	private static class Node{
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

	
	static boolean isBST(Node node){
		ArrayList<Integer> al = new ArrayList<Integer>();
		populateArrayHelper(al,node);
		return isInAscendingOrder(al);
	}

	static void populateArrayHelper(ArrayList<Integer> array, Node treeNode){
		in_order(array, treeNode);
	}

	static boolean isInAscendingOrder(ArrayList<Integer> array){
		if (array.size()==0) {
			System.out.println("Array is Empty");
			return false;
		}

		int temp = array.get(0);
		for(int i=1; i<array.size(); i++){
			if((int)array.get(i) < temp) return false;
			else
				temp = array.get(i);
		}
		return true;
	}



	//==========================================================
	// 				   TREE TRAVERSAL METHODS
	//==========================================================
	static void pre_order(Node root){
		if(root != null){
			System.out.println(root.data);
			pre_order(root.left);
			pre_order(root.right);
		}
	}


	static void in_order(ArrayList<Integer> arr,Node root){
		if(root != null){
			in_order(arr,root.left);
			arr.add(root.data);
			in_order(arr,root.right);
		}
	}


	static void post_order(Node root){
		if(root != null){
			post_order(root.left);
			post_order(root.right);
			System.out.println(root.data);
		}
	}


	


	public static void main(String[] args) {
		BinaryTree bTree_search = new BinaryTree();

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);


		bTree_search.insert(n4);
		bTree_search.insert(n2);
		bTree_search.insert(n6);
		bTree_search.insert(n1);
		bTree_search.insert(n3);
		bTree_search.insert(n5);
		bTree_search.insert(n7);


		// n2.left=n5;
		// n2.right=n1;
		// n4.left=n6;
		// n4.right=n3;
		// n7.left=n2;
		// n7.right=n4;

		//boolean result2 = bTree_search.isBST(n7);

		
		// boolean result = bTree_search.isBST(bTree_search.root);
		// System.out.println(result);

		Node n10 = new Node(10);
		Node n20 = new Node(20);
		Node n30 = new Node(30);

		n20.left=n30;
		n20.right=n10;

		boolean result = isBST(n4);
		System.out.println(result);
	}
}









