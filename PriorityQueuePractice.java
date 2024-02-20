package collectionsframework;

import java.util.ArrayDeque;
import java.util.LinkedList;


//import java.util.PriorityQueue;

public class PriorityQueuePractice {

	public static void main(String[] args) {
		ArrayDeque<Integer> a=new ArrayDeque<Integer>();
		a.add(2);
		a.offerFirst(3);
		a.offerLast(6);
		System.out.println(a);
		a.add(3);
		System.out.println(a);
		System.out.println(a.peek());
	   LinkedList<Integer> l1=new LinkedList<>();
	   l1.add(1);
	   l1.add(4);
	   l1.offerFirst(2);
	   l1.add(null);
	   System.out.println(l1.get(1));
	   System.out.println(l1);
	
		

	}

}
