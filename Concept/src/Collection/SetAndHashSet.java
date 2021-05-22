package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAndHashSet {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>(); // In set consists of only unique elements.
		s.add(5);								// Hashing doesn't give you value in sequence.
		s.add(34);
		s.add(92);
		s.add(64);
		s.add(5);
		s.add(24);
		System.out.println(s);
	
	
	Set<Integer> s1 = new TreeSet<Integer>(); // In TreeSet all elements will be sorted in ascending order.
	s1.add(5);								
	s1.add(34);
	s1.add(92);
	s1.add(64);
	s1.add(5);
	s1.add(24);
	System.out.println(s1);
	}
	}

