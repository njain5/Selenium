package practice;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List is an ordered collection
		//List Can contain duplicate values.
		//List is an Interface -- ArrayList, LinkedList, Vector
		//Array has fixed size, while arraylist can have dynamic size. 
		//can add values at any index or remove from any index.
		ArrayList<String> a = new ArrayList<String>();
		a.add("Nikhil");
		a.add("Raja");
		a.add("Niharika");
		System.out.println(a);
		a.add(0, "Selenium");
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.contains("Selenium"));
		System.out.println(a.indexOf("Nikhil"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		a.remove(2);
		System.out.println(a);
		a.remove("Selenium");
		System.out.println(a);
		a.removeAll(a);
		System.out.println(a);
		
		
	}

}
