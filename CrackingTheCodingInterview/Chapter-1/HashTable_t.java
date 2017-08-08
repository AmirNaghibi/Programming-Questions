// implement HashTable with a hash function

// An item in hashTable
class HashEntry{
	int key;
	int value;
	// constructor
	// NOTE: CONSTRUCTOR DOES NOT HAVE RETURN TYEP
	HashEntry(int key, int value){
		this.key=key;
		this.value=value;
	}

	int getKey(){return this.key;}
	int getVal(){return this.value;}
}


//====================================================================

class HashTable_t{
	static int size;
	HashEntry[] arr;
	int numElm = 0;

	// make a new array of hashEntry with given size
	// NOTE: CONSTRUCTOR DOES NOT HAVE RETURN TYEP
	HashTable_t(int size){
		this.size=size;
		arr= new HashEntry[size];
	}

	// get hashCode given an entry
	int getHashCode(HashEntry he){
		return he.getKey() % this.size;
	}

	// NOT NEED FOR THIS PART
	// number of elements hashed into the table so far
	// int getNumElm(){
	// 	int count=0;
	// 	for (int i=0; i<this.size; i++) {
	// 		if (arr[i].getKey()!=0) {
	// 			count++;
	// 		}
	// 	}
	// 	return count;
	// }


	// insert HashEntries into hashTable
	void put(HashEntry he){
		if (this.numElm==this.size) {
			System.out.println("Insertion for " + he.getKey()+" failed.The HashTable is full");
			return ;
		}
		// get a hashCode for the entry
		int hashCode = this.getHashCode(he);
		//int index = hashCode%this.size;
		// arr[index].getKey!=0 ----> arr[index]!=null;
		while(arr[hashCode]!=null){
			//System.out.println(hashCode);
			hashCode = (hashCode+1)%this.size;
		} 
		// ready to insert
		arr[hashCode]=he;
		// increment the counter for number of elements in hashtable
		this.numElm++;
		System.out.println("Success "+he.getKey());
	}


	// retrive HashEntry's value given key
	int get(int key){
		int hashCode=key%this.size;
		//int index=hashCode%this.size;
		int end = this.size;

		// arr[hashCode].getKey()!=key  && arr[hashCode]!=null --->> does 
		// 		not work! we can hit a cell that is null so arr[hashCode].getKey()!=key
		// 		gives nullPointerException. You must check if its null FIRST
		while(arr[hashCode]!=null && arr[hashCode].getKey()!=key && end!=0){
			System.out.println("Looking at "+arr[hashCode].getKey());
			hashCode = (hashCode+1)%this.size;
			end--;
		} // either of the while condition can be false

		if (end==0 || arr[hashCode]==null) {
			System.out.println("Not found");
			return -1;
		}else{
			System.out.println(arr[hashCode].getVal() + " found!");
			return arr[hashCode].getVal();
		}
	}


	// Print the HashTable
	void printHashTable(){
		for (int i=0; i<this.size; i++) {
			if (arr[i]!=null) {
				System.out.printf("%d:%d ",i,arr[i].getVal());
			}	
		}
		System.out.println(" ");
	}




	public static void main(String[] args) {
		System.out.println("Processing...");
		// construct a hashTable of size 10
		HashTable_t obj = new HashTable_t(30);

		// HashEntries
		HashEntry he22 = new HashEntry(22,2200);
		HashEntry he33 = new HashEntry(33,3300);
		HashEntry he44 = new HashEntry(44,4400);
		HashEntry he88 = new HashEntry(88,8800);
		HashEntry he66 = new HashEntry(66,6600);
		HashEntry he55 = new HashEntry(55,5500);
		HashEntry he52 = new HashEntry(52,5200);
		HashEntry he92 = new HashEntry(92,9200);
		HashEntry he85 = new HashEntry(85,8500);
		HashEntry he42 = new HashEntry(42,4200);
		HashEntry he93 = new HashEntry(93,9300);

		HashEntry he11 = new HashEntry(11,1100);

		obj.put(he22);
		
		obj.put(he44);
		obj.put(he88);
		//obj.put(he66);
		//obj.put(he55);
		obj.put(he52);
		obj.put(he92);
		obj.put(he85);
		obj.put(he42);
		obj.put(he93);
		obj.put(he33);

		//obj.put(he11);
		obj.printHashTable();
		System.out.println("");
		System.out.println("");

		obj.get(92);
		obj.get(85);
		
	}
}










