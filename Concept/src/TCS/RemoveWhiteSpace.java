package TCS;
import java.util.Scanner;

public class RemoveWhiteSpace {


	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String string = sc.nextLine();
		 string = string.replaceAll(" ", "");
		 sc.close();
		 System.out.println(string);
	}
}
