/*
	Implement Stack Data Structure

    - Update: Previously, I used integer for push(int item), Now I use Generics T as type for more diverse data types. And I use Node for push method. .push(Node item)
*/

import java.util.Scanner;


class Stack{

    class Node<T>{
        T data;
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
    public Stack(){
        // stack is empty and has NO top node.
        System.out.println("You have made a stack!");
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
        System.out.println("/////");
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
        return null;
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




//******************************************************************************************************************************************
//******************************************************************************************************************************************
    public static class StackWithMin extends Stack {

        private Stack min;

        public StackWithMin() {
            min = new Stack();
        }


        public void push(int num) {
            if (super.isEmpty || (num <= min.peek().getData())) {
                min.push(num);
                System.out.println("Min Stack");
                min.printStack();
            } else{
                System.out.println("Min Stack");
                min.printStack();
            }
            super.push(num);

            System.out.println("Original Stack");
            super.printStack();
        }

        

        public void pop() {
            if (super.peek().getData() == min.peek().getData()) {
                min.pop();
                System.out.println("Min Stack");
                min.printStack();
            }else{
                System.out.println("Min Stack");
                min.printStack();
            }
            super.pop();

            System.out.println("Original Stack");
            super.printStack();
        }


        public int min() {
            System.out.println(min.peek().getData());
            return min.peek().getData();
        }

        void deleteAll(){
            super.deleteAll();
            min.deleteAll();
        }
    }
//******************************************************************************************************************************************
//******************************************************************************************************************************************

    public static void main(String[] args) {
        StackWithMin stackObj = new StackWithMin();
        Scanner scan = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println("Welcome to Stack Visuilizer!\nYou would iteract with a stack using the following commands:\n- To push the number 'N' insert: pushN\n- To pop a an item insert: pop\n- To delete all items, insert: deleteall\n TO EXIT, insert: control + Z");
        System.out.println("******************************************\n");

        while(true){
            System.out.println("Enter operation: ");
            String userInput = scan.next();

            String pushMaybe = userInput.substring(1,2);
            String popMaybe = userInput.substring(1,2);
            String deleteAllMaybe = userInput.substring(0,1);
            String minMaybe = userInput.substring(0,3);

            if (pushMaybe.equals("u")) {
                // get number
                String pushNumberString = userInput.substring(4);
                int pushNumber = Integer.parseInt(pushNumberString);

                stackObj.push(pushNumber);
            }

            if(popMaybe.equals("o")){stackObj.pop();}

            if (deleteAllMaybe.equals("d")) {stackObj.deleteAll();}

            if(minMaybe.equals("min")){stackObj.min();}
        }
//        stackObj.push(7);
//        stackObj.push(5);
//        stackObj.push(8);
//        stackObj.push(4);
//        stackObj.push(2);
//        stackObj.push(3);
//        stackObj.push(1);
//        stackObj.push(9);
//
//        stackObj.pop();
//        stackObj.min();
//        stackObj.pop();
//        stackObj.min();
//
//        stackObj.pop();
//        stackObj.pop();
//        stackObj.min();
//        stackObj.pop();
//        stackObj.min();
    }
}

/* Challenges and Notes:

	- Implementing DeleteAll Does not need a loop!
	- Determining whether the operation is push or pop (don't use substring(0,3) and stbstring(0,4))
		because, if use pop operation, substring(0,4) would give StringOutOfBoundsException
	- Scan second character to decide if its push or pop
	?? Appearance looks ugly when push numbers with different amount of digits. 2 vs 12345


	//////////////////////////////////////////////////////////////////////////////////////////
	FIND MIN O(1)
	To find the minimum element in a stack, I used another stack to keep track of minimum element.
	If the element to be inserted is smaller than the peek of min stack, I add it to min stack. otherwise
	only add to original stack.


	TO HAVE A MIN STACK, MAKE A CLASS EXTENDING STACK. IMPLEMENT PUSH, POP, MIN AND DELETE ALL FOR
	    THE NEW CLASS AND USE """"SUPER""" IN YOUR IMPLEMENTATION.
*/





