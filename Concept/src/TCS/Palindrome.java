package TCS;

import java.util.Scanner;

public class Palindrome {   
	private static void ToReverse(String input) {
	
		String reverse = new StringBuffer(input).reverse().toString();
		if(input.equals(reverse)) {
			System.out.println("Palindrom");
			}
		else {
			System.out.println("Not a Palindrom");
			}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		ToReverse(input);
		sc.close();
	}	
}