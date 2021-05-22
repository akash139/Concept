package TCS;
import java.util.Scanner;
public class fabonacciRec {
	static int a = 0, b = 1, c;
	public static void Rec(int i) {
		if(i>=1) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			Rec(i-1);
		}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		System.out.println(a+"\n"+b);
		Rec(no);
		sc.close();
	}

}
