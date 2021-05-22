package Hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTablee {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Akash");
		ht.put(2, "Kumar");
		ht.put(3, "Prasad");
		
		System.out.println(ht);
		for(Map.Entry m : ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println();
		ht.forEach((x,y) -> System.out.println(x+" "+y));
		
		
	}

}
