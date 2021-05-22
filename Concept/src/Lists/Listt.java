package Lists;
import java.util.*;
public class Listt {

	public static void main(String[] args) { 
		//In list it's an ordered collections of object . It can have dublicate values.
		List<String> l1 = new ArrayList<String>();
		l1.add("Akash");
		l1.add("Kumar");
		l1.add("Prasad");
		l1.add("Akash");

		l1.forEach((A) -> System.out.print(A+" "));
		System.out.println(l1);
		List<String> l2 =new LinkedList<String>();
		l2.add("54");
		l2.add("Akashh");
		System.out.println(l2);
	}
}