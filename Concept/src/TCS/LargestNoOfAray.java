package TCS;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class LargestNoOfAray {
	static Scanner sc = new Scanner(System.in);
	public static void arr(int max) {
		
		Integer arr1[] = new Integer[max];
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[max-1]);
		
		Arrays.sort(arr1, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[0]);
		}
	public static void main(String[] args) {	
			int max = sc.nextInt();
			arr(max);
	}
}