package Arrays;
import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		
		int Arr[] = {9,8,7,6,5,4};
		System.out.println("Bubble Sort "+Arrays.toString(Arr));
		
		for(int i = 0; i<Arr.length-1; i++) {
			for(int j = 0; j<Arr.length-i-1;j++) {
				if(Arr[j] > Arr[j+1]){
				int	temp = Arr[j];
					Arr[j] = Arr[j+1];
					Arr[j+1] = temp;
				}
				System.out.println("i = "+i+" and j = "+j+Arrays.toString(Arr));
			}
			System.out.println();
		}
		System.out.println("Sorted Array "+Arrays.toString(Arr));
		Arrays.sort(Arr);
		System.out.println("\nSorted Array using .sort method "+Arrays.toString(Arr));	
	}
}