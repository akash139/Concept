package HashSet;
import java.util.*;
public class Common {
	
	private static void Choc(String AliceChoc[], String BobChoc[]) {
		HashSet<String> choc = new HashSet<String>();
		
		for(int i =0;i<AliceChoc.length ;i++) {
			for(int j =0;j<BobChoc.length; j++) {
				if(AliceChoc[i] == BobChoc[j]) {
					choc.add(AliceChoc[i]);
					}
				}
			}
		System.out.println(choc);
		}
	public static void main(String[] args) {

		String AliceChoc[] = {"KitKat","Polo","Gems","Jam"};
		String BobChoc[] = {"Mango","KitKat","Polo", "Apple", "Jam"};
		System.out.println(Arrays.toString(AliceChoc));
		System.out.println(Arrays.toString(BobChoc));
		System.out.println("\nCommon Choc.");
		Choc(AliceChoc, BobChoc);
	}
}