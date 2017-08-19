
public class BST {
    Node root;

    public BST(){
        root = null;
    }
	//    public BST(int item){
	//        root = new Node(item);
	//    }

    private class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(int item){

        root = add(item, root);
    }

    private  Node add(int item, Node p ){
        if(p == null){
            p = new Node(item);
        }
        else if(item < p.data) p.left = add(item, p.left);
        else if(item > p.data) p.right = add(item, p.right);
        return p;
    }

    public void inorder(){
         inorder(root);
    }

    private void inorder(Node p){
        if(p == null) return;
        inorder(p.left);
        System.out.print(p.data + " ");
        inorder(p.right);
    }

    public void print() {
    printHelper(root, "");
    }

  	/**
  	 * Print the BST rooted at root, with indent preceding all output lines.
  	 * The nodes are printed in in-order.
  	 * @param root The root of the tree to be printed.
  	 * @param indent The string to go before output lines.
  	 */

 	private static void printHelper(Node root, String indent) {
 	  if (root == null) {
 	    System.out.println(indent + "null");
 	    return;
 	  }

 	  // Pick a pretty indent.
 	  String newIndent;
 	  if (indent.equals("")) {
 	    newIndent = ".. ";
 	  }
 	  else {
 	    newIndent = "..." + indent;
 	  }

 	  printHelper(root.left, newIndent);
 	  System.out.println(indent + root.data);
 	  printHelper(root.right, newIndent);
 	}


    public static void main(String[] args) {
		BST obj = new BST();

		obj.insert(8);
		obj.insert(4);
		obj.insert(12);
		obj.insert(2);
		obj.insert(6);
		obj.insert(10);
		obj.insert(14);

		obj.print();
	}
}
	