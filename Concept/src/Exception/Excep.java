package Exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Excep {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter a number: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println("Input is: " + n);

		try {
			int a[] = new int[4];
			a[5] = 84;

			int i = 10 / 0;
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { // Multiple Exception
			System.err.println("This is Exception: " + e);
		} finally {
			br.close();
			System.out.println("Byee!");
		}

	}

}
