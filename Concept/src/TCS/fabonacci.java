package TCS;
import java.util.*;
public class fabonacci {
	
	static void fab(int n) {
		int a = 0, b = 1;
		int c ;
		for(int i = 1;i<=n;i++) {
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
	sc.close();
	 fab(no);

}
}