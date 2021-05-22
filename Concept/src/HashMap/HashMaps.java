package HashMap;
import java.util.*;
public class HashMaps {
	
	public static void main(String[] args) {
		System.out.println("Both Integer");
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();	
		map.put(1, 11);
		map.put(2, 0);
		map.put(3, 33);
		System.out.println(map);
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("String, Integer");
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		h1.put("Akash", 1);
		h1.put("Kumar", 2);
		h1.put("Prasad", 3);
		System.out.println(h1);
		for(String i: h1.keySet()) {
			System.out.print(i +" "+h1.get(i));
		}
		for(Map.Entry m : h1.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("Integer, String");
		HashMap<Integer, String> h2 = new HashMap<Integer, String>();	
		h2.put(1, "Akash");
		h2.put(2, "Kumar");
		h2.put(3, "Prasad");
		System.out.println(h2);
		for(Map.Entry m : h2.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("Both String");
		HashMap<String, String> h4= new HashMap<String, String>();	
		h4.put("A", "Akash");
		h4.put("K", "Kumar");
		h4.put("P", "Prasad");
		System.out.println(h4);
		for(Map.Entry m : h4.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		h4.forEach((Name, Age) -> System.out.println("Name: "+Name+" Age: "+Age)); // print using forEach
		}
	}
