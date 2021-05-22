package Queue;
import java.util.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class BasicQueue {
	
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>(); //FIFO
		q.add(6);
		q.add(1);
		q.add(8);
		q.add(3);
		q.add(86);
		
		System.out.println("Elements of Queue: "+q);
		System.out.println("Remove Element from Queue: "+q.remove());
		System.out.println("New Queue: "+q);
		System.out.println("Head of Queue: "+q.peek());
		System.out.println("Size of Queue: "+q.size());
		System.out.println("Poll in Queue: "+q.poll());
		System.out.println("Head of Queue: "+q.peek());
		System.out.println("~~Final Queue ~~ "+q);
		System.out.println();
		
		Queue<String> qq = new PriorityQueue<String>(); //FIFO
		qq.add("Q");
		qq.add("A");
		qq.add("Z");
		qq.add("P");
		qq.add("K");
		
		System.out.println("Elements of Queue: "+qq);
		System.out.println("Remove Element from Queue: "+qq.remove());
		System.out.println("New Queue: "+qq);
		System.out.println("Head of Queue: "+qq.peek());
		System.out.println("Size of Queue: "+qq.size());
		System.out.println("Poll in Queue: "+qq.poll());
		System.out.println("Head of Queue: "+qq.peek());
		System.out.println("~~Final Queue ~~ "+qq);
		
	}

}
