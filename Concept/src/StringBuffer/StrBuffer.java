package StringBuffer;

import java.util.Scanner;

public class StrBuffer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inp = input.nextLine();
		
		StringBuffer name = new StringBuffer(inp);
		System.out.println(name);
		
		StringBuffer nam = new StringBuffer(inp).reverse();
		System.out.println(nam);
		
		if(name.toString().equals(nam.toString())) { 
			System.out.println("Is Palindrom");
		}else
		{
			System.out.println("Not a Palindrom");
		}
		input.close();
		
		
	}

}
