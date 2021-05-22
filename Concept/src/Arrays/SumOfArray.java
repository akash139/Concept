package Arrays;
import java.util.*;
public class SumOfArray {
	// Drawback of array is once it is created it is not expandable.
	// you can't change the size of array.
	
	// It is faster to fetch data.
	// Dynamic array - Increase the size of array by double. but it creates wasteage of element.
	static Scanner sc = new Scanner(System.in);
	public static void arr(int max) {
		int arr1[] = new int[max];
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		int sum = 0;
		for(int i : arr1)
			sum = sum + i;
			System.out.println(sum);
			
		}
	public static void main(String[] args) {
		int max = sc.nextInt();
		arr(max);
		}
	}

