import java.util.ArrayList;

class StackArray3_1<T>{
	ArrayList<T> array;
	// Index where a new element can be inserted.
	int freeIndex;

	//Constructor
	private StackArray3_1(){
		this.array= new ArrayList<T>();
		this.freeIndex=0;
	}

	void push(T item){
		// Add the item of type T in the array at index: freeIndex
		array.add(freeIndex,item);
		// Increment the freeIndex
		this.freeIndex++;
		//System.out.println("PUSHED "+item);
	}

	void pop(){
		// freeIndex !=0, decrement ONCE and Return.
		while(this.freeIndex!=0){
			this.freeIndex--;
			System.out.println("POPPED "+this.array.get(freeIndex));
			return ;
		}
		
	}


	void printStack(){
		int tempIndex=freeIndex-1;
		while(tempIndex>=0){
			System.out.println(array.get(tempIndex));
			tempIndex--;
		}
	}

	public static void main(String[] args) {
		// StackArray3_1<Integer> objI = new StackArray3_1<Integer>();

		// objI.push(7);
		// objI.push(6);
		// objI.push(5);
		// objI.push(4);
		// objI.push(3);
		// objI.push(2);
		// objI.push(1);

		// objI.printStack();

		// objI.pop();
		// objI.pop();
		// objI.pop();
		// objI.pop();
		// objI.pop();
		// objI.pop();
		// objI.pop();
		// objI.pop();
		// objI.pop();
		// objI.pop();
		// objI.pop();

		// objI.printStack();


		// Stack of Strings
		StackArray3_1<String> objS = new StackArray3_1<String>();

		objS.push("Mehdi");
		objS.push("Khosroua");
		objS.push("Maliheh");
		objS.push("Elaheh");
		objS.push("Amir");
		objS.push("Arya");
		objS.push("Milan");

		objS.printStack();

	}

}



/* Challenges and Notes!
	- Used Java Generics
	- Used ITELLIJ IDEA to Debug!! It was very helpful in pinpointing the error.
	- For PrintStack, the tempIndex has to be less than freeIndex. There is nothing at freeIndex.
*/