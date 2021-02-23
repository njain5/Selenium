package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//takes value in Key value pair.
		//hashmap and hashtable both are almost similar
		//hashmap is not synchronised and thread safe
		//hashmap accepts null values 
		//hashmap can be iterated
		//hash table and vector are the only classes that uses enumeration
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Nikhil");
		hm.put(1, "Rajasthan");
		hm.put(2, "Loves");
		hm.put(3, "Dedicated");
		
		System.out.println(hm.get(2));
		//hm.remove(2);
		Set<Entry<Integer, String>> hset= hm.entrySet();
		/*Iterator<Entry<Integer, String>> it = hset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		Iterator it = hset.iterator();
		while(it.hasNext()) {
			Map.Entry m = (Map.Entry)it.next();
			System.out.println(m.getKey() + " - " + m.getValue());
			
		}
		

	}

}
