package TCS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class StringIsPresent {

	public static void main(String[] args)throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the word to be found: ");
		String word = sc.next();
		boolean flag = false;
		int count = 0;
		System.out.println("Contents of the line");
		
		Scanner sc2 = new Scanner(new FileInputStream("E:\\file1.txt"));
		while(sc2.hasNextLine()) {
			String line = sc2.nextLine();
			System.out.println(line);
			if(line.indexOf(word)!=-1) {
				flag = true;
				count = count +1;
				//count =+1;
			}
		}
		if(flag) {
			System.out.println("File contains the specific word: ");
			System.out.println("Number of occurrences is: "+count);
		} else {
			System.out.println("File does not contains word");
		}	
		sc.close();
	}
	
}