package collectionsframework;

import java.util.*;
;

public class VectorAsStack {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("varun");
		v.add("kalyan");
		v.add("ram");
		System.out.println(v);
		Stack s = new Stack();
		s.addAll(v);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.push("2");
		System.out.println(s);
		System.out.println("peek element is:"+s.peek());
		System.out.println(s.search("kalyan"));
	}

}
