package Vector;

import java.util.Vector;

public class Vecto {

	//In vector if you exceed the limit it will increase it's capacity by 100% where as in ArrayList it increases by 50%.
	//Vector waste lot's of memory.
	//ArrayList are faster them vector.
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(00);
		v.add(11);
		v.add(22);
		v.add(33);
		v.add(44);
		v.add(55);
		System.out.println("Capacity of Vector: "+v.capacity());
		System.out.println("Elements of Vector: "+v);
		
	}

}
