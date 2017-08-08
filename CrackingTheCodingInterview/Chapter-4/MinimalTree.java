/*
	Cracking the Coding Interview Chapter 4 : page : 109
	Given a sorted (increasing order) array with unique integer elements, 
		write an algorighm to create a binary search tree with minimal height.
*/


public class MinimalTree{
	
	private class Node{
		int data; 
		Node left;
		Node right;
		Node(int data){this.data=data; left=null; right=null;}
	}

	Node root;


	Node createMinBST(int[] array){
		return createMinBST(array, 0, array.length-1);
	}


	Node createMinBST(int[] arr, int left, int right){
		if(right < left) return null;
		int mid = (left+right)/2;
		
		Node root = new Node(arr[mid]);
		root.left = createMinBST(arr, left, mid-1);
		root.right = createMinBST(arr, mid+1, right);

		return root;
	}


	void in_order_traversal(Node root){
		if(root != null){
			in_order_traversal(root.left);
			System.out.printf("%d ",root.data);
			in_order_traversal(root.right);
		}
	}


	public static void main(String[] args) {
		MinimalTree obj = new MinimalTree();
		int[] treeArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		obj.root = obj.createMinBST(treeArray);
		System.out.println(obj.root.data);
		//obj.in_order_traversal(obj.root);
	}
}




/* NOTES:
	- Line 30: root.left = createMinBST(arr, left, mid-1);
		instead of left argument, I used 0, and result was incorrect.
*/











