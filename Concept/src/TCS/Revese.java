package TCS;

import java.util.Scanner;

public class Revese {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer(sc.nextLine());
		System.out.println(str.reverse());
		
		
		for(int i = str.length(); i>0; --i) {
			System.out.print(str.charAt(i-1));
		}
		//can not be used in string buffer
		String str1 = sc.nextLine();
		char mark[] = str1.toCharArray();
		for(int i = mark.length-1; i>=0; i--) {
			System.out.print(mark[i]+"");
			}

		sc.close();
	}

}
