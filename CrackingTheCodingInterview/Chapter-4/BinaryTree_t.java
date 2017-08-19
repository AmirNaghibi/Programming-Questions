/*
	Implement Binary Tree and 3 binary tree traversals: pre-order, in-order, post-order
*/

class BinaryTree_t{
	
	private static class Node<T>{
		T data;
		Node right;
		Node left;
		public Node(T data){this.data=data; right=null; left=null;}
	}

	void inOrderTraversal(Node node){
		if (node!=null) {
			inOrderTraversal(node.left);
			System.out.println(node.data);
			inOrderTraversal(node.right);
		}
	}


	void preOrderTraversal(Node node){
		if (node!=null) {
			System.out.println(node.data);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}


	void postOrderTraversal(Node node){
		if (node!=null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.println(node.data);
		}
	}

	public static void main(String[] args) {
		BinaryTree_t obj = new BinaryTree_t();

		Node<Integer> nodeI_1 = new Node<Integer>(1);
		Node<Integer> nodeI_2 = new Node<Integer>(2);
		Node<Integer> nodeI_3 = new Node<Integer>(3);
		Node<Integer> nodeI_4 = new Node<Integer>(4);
		Node<Integer> nodeI_5 = new Node<Integer>(5);
		Node<Integer> nodeI_6 = new Node<Integer>(6);
		Node<Integer> nodeI_7 = new Node<Integer>(7);

		nodeI_1.left  = nodeI_2;
		nodeI_1.right = nodeI_3;

		nodeI_2.left  = nodeI_4;
		nodeI_2.right = nodeI_5;

		nodeI_3.left  = nodeI_6;
		nodeI_3.right = nodeI_7;

		System.out.println("In order traversal: ");
		obj.inOrderTraversal(nodeI_1);

		System.out.println("Pre order traversal: ");
		obj.preOrderTraversal(nodeI_1);

		System.out.println("Post order traversal: ");
		obj.postOrderTraversal(nodeI_1);
		

	}
}