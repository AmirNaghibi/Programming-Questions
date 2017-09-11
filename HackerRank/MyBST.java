/*
	Implement Binary Search Tree and pre-order, in-order and post-order traversal.
*/

// no libraries needed

// Node class for node Object
class Node{
	int key;
	Node left; 
	Node right;
	public Node(int key){
		this.key = key;
		this.left = null;
		this.right = null;
	}
}


// BST class
public class MyBST{
	public Node treeRoot;

	public MyBST(){
		this.treeRoot = null;
	}

	// insert method
	void insert(int nodeKey, Node root){
		// make a new node with given key
		Node tempRoot = root;
		Node newNode = new Node(nodeKey); 
		if(tempRoot==null){
			System.out.println("Final Add");
			tempRoot = newNode;
			return;
		}else{
			Node toAdd = new Node(nodeKey);
			while(tempRoot != null){
				if(toAdd.key > tempRoot.key) tempRoot = tempRoot.right;
				if(toAdd.key < tempRoot.key) tempRoot = tempRoot.left;
			}
			tempRoot = toAdd;
			System.out.println("END");
			return;
		}	
	}

	// TREE TRAVERSALS: 

	// preorder traversal
	void pre_order_traversal(Node root){
		if (root != null) {
			System.out.println(root.key);
			pre_order_traversal(root.left);
			pre_order_traversal(root.right);
		}
	}



	// in order traversal
	void in_order_traversal(Node root){
		if (root != null) {
			in_order_traversal(root.left);
			System.out.println(root.key);
			in_order_traversal(root.right);
		}
	}



	// post order traversal
	void post_order_traversal(Node root){
		if (root != null) {
			post_order_traversal(root.left);
			post_order_traversal(root.right);
			System.out.println(root.key);
		}
	}


	public static void main(String[] args) {
		System.out.println("Binary Search Tree");
		MyBST obj = new MyBST();
		obj.insert(20,obj.treeRoot);
		obj.insert(10,obj.treeRoot);
		//obj.insert(30,obj.root);
		// obj.insert(5,obj.root);
		// obj.insert(15,obj.root);
		// obj.insert(25,obj.root);
		// obj.insert(35,obj.root);
		// obj.insert(20,obj.root);
		// obj.insert(20,obj.root);
		// obj.insert(20,obj.root);
		// obj.insert(20,obj.root);
		// obj.insert(20,obj.root);
		// obj.insert(20,obj.root);
		// obj.insert(20,obj.root);
		// obj.insert(20,obj.root);
		//obj.pre_order_traversal(obj.root);
	}
     
}






