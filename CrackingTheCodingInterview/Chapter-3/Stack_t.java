class Stack_t{
    public static class Node<T>{
        T data;
        /////////#*#*#*#???? Removed <> from Node<T> below --> No Warning
        // You don't need <> anymore since your class names has already mentioned it.
        Node below;
        // A node has a data and a pointer to the Node below it.
        public Node(T data){
            this.data=data;
            this.below=null;
        }

        T getData(){return this.data;}
    }


    // top is a Stack Node pointer
    Node top;
    int numNodes;
    boolean isEmpty;


    // Constructor
    public Stack_t(){
        // stack is empty and has NO top node.
        //System.out.println("You have made a stack!");
        this.numNodes=0;
        this.isEmpty=true;
        this.top=null;
    }

    void printStack(){
        // A temporary Node that points to the top of the stack.
        Node temp=this.top;
        System.out.println("");
        /* %s actually works for them all, because all Object types have a .toString(), so they can all be converted to Strings for printing. */
        while(temp!=null){
            System.out.printf("|_%s_|\n",temp.data);
            temp=temp.below;
        }
        System.out.println("|===|");
    }


    void push(Node item){
        // make a new Node with given data
        //// Node newNode = new Node(item);
        // If the stack if empty, the top would be the Node we just pushed.
        if (this.isEmpty) {
            item.below=null;
            top=item;
            this.numNodes++;
            // set isEmpty to false
            this.isEmpty=false;
        }else{
            item.below=top;
            top=item;
            this.numNodes++;
        }
    }

    // MUST return the node it just removed.
    Node pop(){
        // If stack is empty, don't do anything.
        if(this.isEmpty){
            System.out.println("Stack is empty");
            return null;   
        }
            // IF only 1 Node in Stack,
        else if (this.top.below==null) {
            Node temp = null;
            top=null;
            this.isEmpty=true;
            this.numNodes--;
            return temp;
        }
        else{
            Node temp=top;
            top=top.below;
            this.numNodes--;
            return temp;
        }
    }

    boolean isStackEmpty(){return this.isEmpty;}
    Node peek(){return this.top;}
    int totalStackNodes(){return this.numNodes;}

    void deleteAll(){
        this.top=null;
        this.numNodes=0;
        this.isEmpty=true;
        System.out.println("ALL ITEMS HAVE BEEN DELETED!");
        this.printStack();
    }

    public static void main(String[] args) {
        // Stack_t obj = new Stack_t();
        // Node<Integer> node1 = new Node<Integer>(1);
        // Node<Integer> node2 = new Node<Integer>(2);
        // Node<Integer> node3 = new Node<Integer>(3);
        // Node<Integer> node4 = new Node<Integer>(4);
        // Node<Integer> node5 = new Node<Integer>(5);
        // obj.push(node1);
        // obj.push(node2);
        // obj.push(node3);
        // obj.push(node4);
        // obj.push(node5);
        // obj.printStack();

        // obj.pop();
        // obj.pop();
        // obj.pop();
        // obj.pop();
        // obj.pop();
        // obj.pop();
                
        // obj.printStack();

        //==================================================================
        //==================================================================
        // String Stack
        Stack_t stackString = new Stack_t();
        Node<String> nodeST1 = new Node<String>("A");
        Node<String> nodeST2 = new Node<String>("B");
        Node<String> nodeST3 = new Node<String>("C");
        Node<String> nodeST4 = new Node<String>("D");
        Node<String> nodeST5 = new Node<String>("E");
        stackString.push(nodeST1);
        stackString.push(nodeST2);
        stackString.push(nodeST3);
        stackString.push(nodeST4);
        stackString.push(nodeST5);
        stackString.printStack();

        stackString.pop();
        stackString.pop();
        stackString.printStack();


    }
} 

