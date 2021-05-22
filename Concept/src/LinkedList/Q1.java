package LinkedList;

import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.push(1);
		l1.push(2);
		l1.push(3);
		l1.push(4);
		l1.push(6);
	System.out.println(l1);
	l1.pop();
	System.out.println(l1);
	
	Scanner sc = new Scanner(System.in);
	int max = sc.nextInt();
	LinkedList<Integer> marks =new LinkedList<Integer>();
	int mar[] = new int[max];
	for(int i=0; i<mar.length; i++) {
		marks.push(sc.nextInt());
	}
	System.out.println(marks);
	}

}
