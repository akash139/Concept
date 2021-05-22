package HashMap;
import java.util.*;
public class MIS {
	static Scanner input = new Scanner(System.in);
	public static void Emp(int max) {
		HashMap<Integer, String> Emp= new HashMap<Integer, String>(max);
		int[] sal = new int[max];
		
		for(int i = 0; i<sal.length ; i++) {	
			System.out.println("Emp Salary: ");
			int Salary = input.nextInt();
			input.nextLine();
			System.out.println("Emp Designation: ");
			String design = input.nextLine();
			Emp.put(Salary, design);		
	
		System.out.println(Emp);
		if(Salary > 5000 && Salary < 20000 && design.equalsIgnoreCase(Emp.get(Salary))){
			System.out.println("scheme c\n");
		}
		else if(Salary >= 20000 && Salary < 40000 && design.equalsIgnoreCase(Emp.get(Salary))){
			System.out.println("scheme b\n");
		}
		else if(Salary >= 40000 && design.equalsIgnoreCase(Emp.get(Salary))){
			System.out.println("scheme a\n");
		}
		else if(Salary < 5000 && design.equalsIgnoreCase(Emp.get(Salary))){
			System.out.println("no scheme\n");
		}
	}
}
	public static void main(String[] args) {
		System.out.println("Enter no of Employee: ");
		int max = input.nextInt();
		Emp(max);
		}	
}