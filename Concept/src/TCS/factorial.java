package TCS;
import java.util.*;
public class factorial {
	public static int fact(int n) {
		if (n >1) {
			return (n * fact(n - 1));
		}
		return 1;
		}

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		System.out.println(fact(n));
		sc.close();

	}
}