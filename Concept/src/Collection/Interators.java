package Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Interators {
	public static void main(String[] args) {
		Collection arr = new ArrayList(); 				// Collection is a interface.
		arr.add(5);
		arr.add("Ok");
		System.out.println(arr);
		
		Iterator it = arr.iterator();
		while(it.hasNext()) {							// it.hasNext() method will check do we have next element. 
			System.out.println(it.next());				
		}
		
		Collection<Object> arr1 = new ArrayList<>();	//in Object we can specify everything
		arr1.add("Akash");
		arr1.add(011);
		arr1.add(35.6f);
		arr1.add(78945612.5555565946);
		arr1.addAll(arr);
		System.out.println(arr1);
		arr1.forEach((x) -> System.out.print(x+" "));
	}
}