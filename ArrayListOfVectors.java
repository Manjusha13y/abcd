package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class ArrayListOfVectors {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
	    Integer a[]= {3,4,5};
	    v.addAll(Arrays.asList(a));
	    System.out.println(v);
	    Integer b[]= {6,7,8};
	    Vector<Integer> v1= new Vector<>(Arrays.asList(b));
	    System.out.println(v1);
	    //ArrayList of Vectors
	    ArrayList<Integer> al = new ArrayList<>();
	    al.addAll(v);
	    al.addAll(v1);
	    System.out.println(al);
	    System.out.println(al.get(2));
	    System.out.println(al.contains(3));
	    System.out.println(al.containsAll(v1));
	    al.remove(6);
	    System.out.println(al);
	    

	}

}
