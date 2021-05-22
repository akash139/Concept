package AnonymousInnerClass;
class A{
	public void show() {
		System.out.println("In A show()");
	}
}
public class Anno {
	public static void main(String[] args) {
		A a = new A() {							// Anonymous class which doesn't have name.
			public void show() {				// Code optimization is the main reason behind anonymous class
				System.out.println("I'm the best");
				super.show();
			}
		};
		a.show();
	}
}
