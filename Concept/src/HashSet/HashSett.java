package HashSet;
import java.util.*;
//In HashSet we can't store duplicate variable i.e array.
// Collections of items which are unique
public class HashSett {
	public static void main(String[] args) {
		HashSet<Integer> score = new HashSet<Integer>();
		score.add(1);
		score.add(7);
		score.add(8);
		System.out.println(score);
		for(int i:score) {
		System.out.print(i+" "); 
	}
	System.out.println();
	
	HashSet<String> Chocc = new HashSet<String>();
	Chocc.add("Z");
	Chocc.add("Z");
	Chocc.add("B");
	Chocc.add(null);
	Chocc.add("akash");
	System.out.println(Chocc.size());
	System.out.println(Chocc);
	System.out.println(Chocc.contains("Z"));
	
	System.out.println("Using Scanner HashSet");
	Scanner sc = new Scanner(System.in);
	int max = sc.nextInt();
	HashSet<Integer> Age = new HashSet<Integer>(max);
	int Age1[] = new int [max];
	for(int i =0; i<Age1.length;i++) {
		Age.add(sc.nextInt());
		}
	//Iterator's
	System.out.println(Age);
	Iterator<Integer> i = Age.iterator();
	while(i.hasNext())
	System.out.print(i.next()+" ");
	System.out.println();
	Age.forEach(x -> System.out.print(x+" "));
	System.out.println();

//convert HashSet to ArrayList
	ArrayList<Integer> arr = new ArrayList<Integer>(Age);
//reverse HashSet
	Collections.reverse(arr);
	for(int zz : arr) {
		System.out.print(zz+" ");
		}
	sc.close();
	}
	}

