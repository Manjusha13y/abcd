package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListOperations {

	public static void main(String[] args) {
		Integer[] a= {1,2,3,4};
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(1);
		a1.add(2);
		ArrayList<Integer> a2 =new ArrayList<Integer>(Arrays.asList(a));
		a1.addAll(a2);
		System.out.println("iterating list");
		for(Object i:a1) {
		 System.out.println(i);	
		}
		System.out.println("size:"+a1.size());
		System.out.println(a1.containsAll(a2));
		System.out.println(a1.contains(1));
		System.out.println(a1.get(2));
		a1.set(3, 5);
		System.out.println(a1);
		a1.remove(2);
		System.out.println(a1);
		a1.removeAll(a2);
		System.out.println(a1);
		
	}

}
