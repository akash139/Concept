package Arrays;
						//Reverse Array and Reverse String
import java.util.*;
public class ReverseString {
	static Scanner sc = new Scanner(System.in);
	public static void RevString(String str) {
	
		System.out.println("Using .toCharArray");
		char mark[] = str.toCharArray();
		for(int i = mark.length-1; i>=0; i--) {
			System.out.print(mark[i]+"");
			}
		
		System.out.println("\n"+"Reverse Array");
		String str3 = "123456789";
		for(int i = str3.length(); i>0; --i) {
			System.out.print(str3.charAt(i-1));
		}
		
		System.out.println("\n"+"Using String Builder");
        StringBuilder str2 = new StringBuilder(str);      // used string builder to reverse
        str2.reverse();
        System.out.println(str2);   
        }
	
	public static void RevString(int max) {
		String mark[] = new String[max];
		for(int i=0; i<mark.length;i++) {
			mark[i] = sc.nextLine();
		}
		System.out.println(Arrays.toString(mark));
		Collections.reverse(Arrays.asList(mark));
		for(int i =0;i<mark.length;i++) {
			System.out.print(mark[i]+" ");
		}
		System.out.println("\n"+Arrays.asList(mark));
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String str1 = sc.nextLine();
		RevString(str1);
		
		System.out.println("\nEnter the number of elements to insert");
		int max = sc.nextInt();
		sc.nextLine();
		RevString(max);
		
	}
}