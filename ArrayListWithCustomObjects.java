package collectionsframework;

import java.util.ArrayList;

public class ArrayListWithCustomObjects {

	public static void main(String[] args) {
		ArrayList<CustomObject> al = new ArrayList<>();
		CustomObject o = new CustomObject(7,8,9);
		al.add(new CustomObject(1,2,3));
		al.add(new CustomObject(4,5,6));
		//al.add(o);
		ArrayList<CustomObject> al2= new ArrayList<>();
		al2.add(o);
		al.addAll(al2);
        System.out.println(al);
        System.out.println(al.get(1));
        for(CustomObject obj:al) {
        	System.out.println(obj);
        }
        System.out.println(al.contains(o));
        System.out.println(al.containsAll(al2));
        System.out.println(al);
        al.removeAll(al2);
        System.out.println(al);
        
	}

}
