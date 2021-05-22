package Collection;

import java.util.ArrayList;
import java.util.List;

public class Genericss {

	public static void main(String[] args) {
		// Collection can have any type of data because everything is object is collections. 
		// To restrict we can use special concept which is generics.
		// We always use Collection<Object, generics
		List<String> o = new ArrayList<>();
		o.add("Akash");
		o.add("CSE");
		o.add("Using Generics");
		o.forEach((x)-> System.out.print(x+" "));
	}

}
