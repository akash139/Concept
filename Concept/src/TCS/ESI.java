package TCS;
import java.util.*;
public class ESI {
	public static void scheme(int salary , String des) {
		if(salary > 5000 && salary < 20000 && des == "System Associate") {
			System.out.println("scheme c");
			}
		else if(salary >= 20000 && salary < 40000 && des.equals("Programmer")) {
				System.out.println("scheme b");
			}
		else if(salary >= 40000 && des.equals("Manager")) {
				System.out.println("scheme a");
			}
		else if(salary < 5000 && des.equals("Clerk")) {
				System.out.println("no scheme");
			}
		else if(salary == 0 && des.equals(null)) {
			System.out.println("Invalid Input");
		}else {
			System.out.println("No Output");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary;
		String des;
		int max = sc.nextInt();
		HashMap<Integer, String> e1 = new HashMap<Integer, String>(max);
		int ar[] = new int[max];
		for(int i =0; i<ar.length; i++) {
			salary = sc.nextInt();
			sc.nextLine();
			des = sc.nextLine();
			e1.put(salary, des);
			ESI.scheme(salary, des);
		}
		System.out.println(e1);
	}
}
