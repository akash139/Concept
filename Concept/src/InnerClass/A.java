package InnerClass;

class B{
	void B() {
		System.out.println("Inside B Class");
	}
	class C{
		void C() {
			System.out.println("Inside INNER C class");
		}
	}
}
public class A {
	public static void main(String[] args) {
		B b = new B();
		b.B();
		
		B.C c = b.new C();
		c.C();
	}

}
