package Wrapper;

public class Wrapper {

	public static void main(String[] args) {
		int i = 5;
		
		Integer k = new Integer(50);
		int kk = k.intValue();
		
		
		Integer value = i; 		//AutoBoxing or Wrapping
		int ii = value; 			//unboxing or unwrapping
								//primative are faster then Wrapper Class.
								//wrapper classes are used in Hybernate(ORM) or collection framework.
		String s = "1256";
		int n = Integer.parseInt(s);
		System.out.println(n);
		
	}

}
