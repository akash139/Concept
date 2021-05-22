package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Listt {

	public static void main(String[] args) {
		List list = new ArrayList<>();	//Adv. of list is we can specify the index where we want to add the element.
		list.add(5);					// list of object, all are object of Integer because generic contain Integer.
		list.add(0, 7);					//list are wrapper class
		list.add(6);					// list is mutable which means values can change
		list.add(2, 99);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		List<Object> listt = new ArrayList<Object>();
		listt.add(0, 78);
		listt.add(61);
		listt.add(2, 96);
		listt.add(1, list);
		System.out.println(listt);					//normal printing
		
		Iterator<Object> print = listt.iterator();	//printing using Iterator
		while(print.hasNext()) {
			System.out.print(print.next()+" ");
		}
		System.out.println();
		for(Object i: listt) {						//printing using enhanced for loop
			System.out.print(i+" ");
		}
	}
}