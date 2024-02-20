package collectionsframework;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("manju");
		al.add("supriya");
		al.add("prashu");
		System.out.println(al);
		System.out.println(al.contains("supriya"));
		al.clear();
		System.out.println(al);

	}

}
