/*
	Two numbers represented by LinkedList. ex: 2583:  3 -> 8 -> 5 -> 2
	Add the two numbers together and return sum as linked list
*/

import java.util.LinkedList;
import java.util.ArrayList;


public class SumLists{
	
	int addNums(LinkedList ll_1, LinkedList ll_2){
		String number_1 = "";
		for (int i=ll_1.size()-1; i>-1; i--) {
			number_1 += (int)ll_1.get(i);
		}
		//System.out.println(number_1);

		String number_2 = "";
		for (int i=ll_2.size()-1; i>-1; i--) {
			number_2 += (int)ll_2.get(i);
		}
		//System.out.println(number_2);

		int num1 = Integer.parseInt(number_1);
		int num2 = Integer.parseInt(number_2);

		int result = num1 + num2;
		return result;
	}


	void toLinkedList(int number){
		ArrayList<Integer> array = new ArrayList<Integer>();
		LinkedList<Integer> resultLL = new LinkedList<Integer>();

		int temp = number;
		do{
			array.add(temp % 10);
			temp /=10;
		}while(temp > 0);

		for (int i=0; i<array.size(); i++) {
			resultLL.add(array.get(i));
		}

		for (int i=0; i<resultLL.size(); i++) {
			System.out.printf("%d -> ",resultLL.get(i));
		}
		System.out.printf("null");
		System.out.println(" ");
	}


	public static void main(String[] args) {
		SumLists obj = new SumLists();
		LinkedList<Integer> ll_1 = new LinkedList<Integer>();
		LinkedList<Integer> ll_2 = new LinkedList<Integer>();
		// 617
		ll_1.add(7);
		ll_1.add(1);
		ll_1.add(6);
		
		// 295
		ll_2.add(5);
		ll_2.add(9);
		ll_2.add(2);
		//System.out.println(ll_2);

		//obj.addNums(ll_1,ll_2);
		obj.toLinkedList(obj.addNums(ll_1,ll_2));
	}
}