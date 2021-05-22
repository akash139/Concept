package ForEach;

class A{
	public int arr (int ... n) { // int ... act as a Array
		int sum = 0;
		for(int i : n) {
			sum = sum + i;
		}
		return sum;
	}
}
public class ForEah {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.arr(1,2,3,4,5));
	}

}
