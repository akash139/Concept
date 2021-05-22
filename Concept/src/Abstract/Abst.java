package Abstract;

							//Abstract class can have normal methods.
							//If a class extends abstract class we can't extends another class. so for that we use interface
abstract class Human{
	abstract void alive(Number a);
	void z() {
	System.out.println("in abstrac class");	
	}
}
class hum extends Human{
	void alive(Number i){
		System.out.println(i);
	}
}
public class Abst {
	public static void main(String[] args) {
		hum h = new hum();
		h.alive(9.6);
	
	}
}