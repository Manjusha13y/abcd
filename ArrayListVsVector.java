package collectionsframework;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListVsVector {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("1");
		v.add("2");	
		v.add("11");
		v.add("22");	
		v.add("123");
		v.add("25");	
		v.add("14");
		v.add("24");	
		v.add("15");
		v.add("28");
		v.add("16");
		v.add("29");
		System.out.println("size of vector"+v.size());
		System.out.println("capacity of vector"+v.capacity());
		ArrayList al = new ArrayList();
		al.add("anu");
		al.add("sai");
		al.add("satya");
		al.add("anu1");
		al.add("sai1");
		al.add("satya1");
		al.add("anu2");
		al.add("sai2");
		al.add("satya2");
		al.add("anu3");
		al.add("sai3");
		al.add("satya3");
		al.add("anu4");
		al.add("sai4");
		al.add("satya4");
		al.add("anu5");
		al.add("sai5");
		al.add("satya5");
		System.out.println("size of arraylist"+al.size());
		System.out.println("no capacity for ArrayList");
		

	}

}
