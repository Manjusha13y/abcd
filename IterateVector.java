package collectionsframework;

import java.util.Iterator;
import java.util.Vector;

public class IterateVector {

	public static void main(String[] args) {
           //iterating vector using iterator method
		Vector v = new Vector();
		v.add("manju");
		v.add("supriya");
		v.add("prashanthi");
		Iterator i = v.iterator();
		System.out.println("vector elements by iterator()");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		  //using for loop
		System.out.println("vector elements by for");
		for(int j=0;j<v.size();j++) {
			System.out.println(v.get(j));
		}
		  //using foreach
		System.out.println("vector elements by for each");
		for(Object s:v) {
			System.out.println(s);
		}
		

	}

}
