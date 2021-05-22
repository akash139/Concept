package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.Vector;

public class DeQueuee {

	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(9);
		dq.add(5);
		dq.add(7);
		dq.add(67);
		dq.addFirst(6);
		dq.addLast(82);
		System.out.println("Elements of Dequeue: "+dq);
	
		dq.pollLast();
		System.out.println("DeQueue pollLast: "+dq);
	
		dq.pollFirst();
		System.out.println("DeQueue pollFirst: "+dq);
		
		dq.removeFirst();
		System.out.println("DeQueue removeFirst: "+dq);
		
		dq.removeLast();
		System.out.println("DeQueue removeLast: "+dq);
	
	}

}
