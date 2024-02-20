package collectionsframework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class VectorOperations {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("manu");
		v.add("manju");
		v.add("manoj");
		v.add("mani");
		Vector v1 = new Vector();
		v1.add("krish");
		v1.add("pramodh");
		v.addAll(0,v1);
		String[] s = {"manik","nani"};
		//1 approach 
		v.addAll(Arrays.asList(s));
		//Vector v2 = new Vector(Arrays.asList(s));
		//v.addAll(v2);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.get(0));
		v.remove(4);
		//v.removeAll(v2);
		System.out.println(v);
		v.set(1, "ramu");
		System.out.println(v);
		//System.out.println(v.containsAll(v2));
		System.out.println(v.contains("ramu"));
		
		Iterator i = v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
