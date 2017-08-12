import java.util.ArrayList;
import java.util.Iterator;


class MyIterator{

	public static void main(String[] args) {
		ArrayList<String> myArray = new ArrayList<String>();
		myArray.add("Amir");
		myArray.add("UBC");
		myArray.add("CPSC");
		myArray.add("CO-OP");
		Iterator it = myArray.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String)element);
		}
	}
}