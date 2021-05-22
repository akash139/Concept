package Lists;
import java.util.*;
public class ReveseLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(7);
		ll.add(1);
		ll.add(3);
		System.out.println(ll);

		LinkedList<Integer> ll1 = new LinkedList<>();

		ll.iterator();
		ll.descendingIterator().forEachRemaining(ll1::add);

		System.out.println(ll1);
	}
}
