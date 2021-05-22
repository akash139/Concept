package Stack;
import java.util.*;
public class StackOperation {
	static Scanner input = new Scanner(System.in);
	
	public static void push( Stack<Integer> q, int push) {
		System.out.println("Current statck: " +q);
		System.out.println("Push:" +q.push(push));
		System.out.println("New Stack: "+q);
		System.out.println();
	}
	private static void pop(Stack<Integer> q) {
		System.out.println("Current Stack: "+q);
		System.out.println("Pop: "+q.pop());
		System.out.println("New Stack: "+q);
		System.out.println();
	}
	
	public static void main(String[] args) {
	Stack<Integer> q = new Stack<Integer>();
	push(q,5);
	push(q,8);
	push(q,0);
	push(q,1);
	push(q,6);												//push element into the stack
	System.out.println("Peek of stack: "+q.peek()+"\n"); //last element of the stack which is inserted.
	pop(q);													//pop's out element from stack
	pop(q);
	if(q.isEmpty()) {										//check's whether stack isEmpty or not
		System.out.println("Empty Stack!, push the items. ");
	}else {
		System.out.println("~~~ Finally stack contains: "+q+" ~~~");
	}
	}
	
}
