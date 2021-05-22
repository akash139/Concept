package Arrays;

public class ReverseStringArray {
	public static void main(String args[]){  
	int n[] = {4,9,4,3,6,7};
		for(int i = 0;i<n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
		for(int i = n.length-1; i>=0; i--) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
		
	String nn[] = {"A", "b","z", "x", "q", "w", "z"};
		for(String i : nn) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i = nn.length-1; i>=0; i--) {
			System.out.print(nn[i]+" ");
		}
		System.out.println();
	String name[] = {"Akash", "Zerbra", "hello", "zero"};
		for(String i:name) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i = name.length-1; i>=0; i--) {
			System.out.print(name[i]+" ");
		}	
	}
} 