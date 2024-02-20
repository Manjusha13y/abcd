package collectionsframework;


import java.util.Vector;

public class GenericVector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("manju");
		v.add("supriya");
		v.add("prashu");
		System.out.println(v);
		System.out.println(v.contains("supriya"));
		v.clear();
		System.out.println(v);

	}

}
