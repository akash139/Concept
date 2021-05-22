package LinkedList;
import java.util.*;

public class Linked {
	
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(4);
		System.out.println(l.get(1));
		System.out.println(l);
		System.out.println(l.pop());
		System.out.println(l);
	}
}