package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapss {
	public static void main(String[] args) {
		int i, Age;
		String Name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of entries: ");
		int max = sc.nextInt();
		
		HashMap<Integer, String> Emp = new HashMap<Integer, String>(max);
		String[] s = new String[max];
		for( i = 0; i<s.length; i++) {
			Age = sc.nextInt();
			sc.nextLine();
			Name = sc.nextLine();
			Emp.put(Age, Name);
		}
		System.out.println(Emp);
		
		Emp.forEach((Agee, Namee) -> System.out.println(Agee+" "+Namee));
		}
	}