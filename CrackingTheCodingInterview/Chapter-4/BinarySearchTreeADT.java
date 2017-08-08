/** Created on July 1, 2017 by Amir Naghibi
	Implement BST data structure
*/


public class BinarySearchTreeADT{
	// Private Node class
	public static class Node{
		int data;
		Node right;
		Node left;
		// constructor
		Node(int data){this.data=data; right=left=null;}
	}

	// root node
	Node root;
	// For each insertion, the root node and some of the children nodes have to get updated.
	void insert(Node node){
		root = insert(root, node);
	}

	Node insert(Node currentParent, Node newNode){
		if(currentParent==null) return newNode;
		else if(newNode.data > currentParent.data){currentParent.right = insert(currentParent.right, newNode);}
		else if(newNode.data < currentParent.data){currentParent.left  = insert(currentParent.left , newNode);}
		// return the current parent. In the calling function, root calls insert with currentParent as root.
		return currentParent;
	}

// 	public int findHeight(){
//     if(this==null){
//         return -1;
//     }
//     else{
//         Node node = root;
//         return findHeight(node);
//     	}
// 	}

// 	private int findHeight(Node aNode){
//     int heightLeft = 0;
//     int heightRight = 0;
//     if(aNode.left!=null)

//         heightLeft = findHeight(aNode.left);
//     if(aNode.right!=null)
//         heightRight = findHeight(aNode.right);
//     if(heightLeft > heightRight){
//         return heightLeft+1;
//     }
//     else{
//         return heightRight+1;
//     }
// }






// 	int findHeight(Node aNode) {
//     if (aNode == null) {
//         return -1;
//     }

//     int lefth = findHeight(aNode.left);
//     int righth = findHeight(aNode.right);

//     if (lefth > righth) {
//         return lefth + 1;
//     } else {
//         return righth + 1;
//     }
// }





	int findHeight(Node aNode){
		if(aNode == null || (aNode.left == null && aNode.right == null)) return 0;
    	return 1 + Math.max(findHeight(aNode.left), findHeight(aNode.right));
	}


	int heightLeft(Node node){
		if(node == null || node.left==null)return 0;
		return 1 + findHeight(node.left);
	}


	int heightRight(Node node){
		if(node == null || node.right==null)return 0;
		return 1 + findHeight(node.right);
	}


	boolean in_order_check_balanced(Node root){
		if(root != null){
			in_order_check_balanced(root.left);
			if(Math.abs(heightLeft(root)-heightRight(root))>1)return false;
			in_order_check_balanced(root.right);
		}
		return true;
	}

	// in_order traversal of tree nodes
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
		
		Node n9 = new Node(9);
		Node n10 = new Node(10);
		Node n11 = new Node(11);
		

		obj.insert(n5);
		obj.insert(n3);
		obj.insert(n7);
		obj.insert(n2);
		obj.insert(n4);
		obj.insert(n6);
		obj.insert(n8);

		obj.insert(n9);
		// obj.insert(n10);
		// obj.insert(n11);

		// obj.in_order(obj.root);
		// System.out.println("");
		int result = obj.findHeight(obj.root);
		System.out.println(obj.in_order_check_balanced(obj.root));
	}
}


/*
	NOTES:
		- Determining the height of a Tree
		- BST insertion, Update nodes as you insert a new Node
*/








