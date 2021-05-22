package HashMap;
import java.util.*;
public class ESI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary: ");
		int Salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Design: ");
		String design = sc.nextLine();
		
		HashMap<Integer, String> details = new HashMap<Integer, String>();
		details.put(1, "System Associate");
		details.put(2, "Programmer");
		details.put(3, "Manager");
		details.put(4, "Clerk");
		if(Salary > 5000 && Salary < 20000 && design.equalsIgnoreCase(details.get(1))) {
			System.out.println("scheme c");
		}
		else if(Salary >= 20000 && Salary < 40000 && design.equalsIgnoreCase(details.get(2))) {
			System.out.println("scheme b");
		}
		else if(Salary >= 40000 && design.equalsIgnoreCase(details.get(3))) {
			System.out.println("scheme a");
		}
		else if(Salary < 5000 && design.equalsIgnoreCase(details.get(4))) {
			System.out.println("no scheme");
		}else {
			System.out.println("Wrong input");
		}
		System.out.println(details);
		sc.close();
	}

}
