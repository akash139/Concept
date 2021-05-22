package Collection;
import java.util.HashMap;
import java.util.Hashtable;

public class MapAndHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>(); 	// Hashing doesn't give you value in sequence.
																	// HashMap is not Synchronized.
		map.put("Name", "Akash");
		map.put("Nama1", "Aditi");						//	We can repeat values but keys can't be repeated.
		map.put("Name2", "Nisha");
		map.put("Name3", "Arun");
		System.out.println(map);

		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>(); 		
		map1.put(5, 11);
		map1.put(2, 9);						
		map1.put(7, 23);
		map1.put(99, 4);
		System.out.println(map1);
	
//-------------------------------------------------------------------------------------------------------------------//
		
		Hashtable<String, String> map2 = new Hashtable<String, String>(); 	// HashTable is Synchronized
		map2.put("Name", "Akash");
		map2.put("Nama1", "Aditi");						
		map2.put("Name2", "Nisha");
		map2.put("Name3", "Arun");

		System.out.println(map2);
	
		Hashtable<Integer, Integer> map3 = new Hashtable<Integer, Integer>(); 	// HashTable is Synchronized
		map3.put(5, 11);
		map3.put(2, 9);						
		map3.put(7, 23);
		map3.put(99, 4);
		System.out.println(map3);	
	}
}