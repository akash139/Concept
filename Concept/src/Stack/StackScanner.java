package Stack;
import java.util.*;

public class StackScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stages = new Stack<Integer>();
		
		System.out.println("Enter Max elements into Stack: ");
		int max = sc.nextInt();
		
		System.out.println("Enter elements to insert");
		for(int i = 0;i<max; i++) {
			stages.push(sc.nextInt());
		}
		System.out.println(stages);
		
		System.out.println("Pop an element");
		stages.pop();
		System.out.println(stages);
	}
	}
