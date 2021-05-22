package AccessModifier;

class Mod {												 // only public, abstract and final access modifier is permitted.
	public void disp() {
		System.out.println("I'm public");
	}
}
public class Access {
	
	int i = 10;					//default access modifier will be visible in same package but not visible in other package
	public String j = "I'm public variable";	//public access modifier will we visible in same package and other package.
	private int k = 12;								//private access modifier will not be visible in same or other package.
	protected int l = 12;		//protected access modifier will be visible in same package but not visible in other package.
											//protected access modifier will work if new class extends the existing package.
	public static void main(String[] args) {
		Mod m = new Mod();
		m.disp();
	}
}
