package TCS;
import java.util.HashSet;
public class ExtraQuestions {
	public class Arrayss {
		public void main(String[] args) {
			
			String s1 = "abc";
			String s2 = "abc";
			System.out.println("s1 == s2 is:" + s1 == s2);
			System.out.println( s1 == s2);
			
			String s3 = "AkashK";
			int start = 1;
			char end = 5;
			System.out.println(start + end);
			System.out.println(s3.substring(start, end));
		
			HashSet shortSet = new HashSet();
			for (short i = 1; i < 10; i++) {
				shortSet.add(i);
				shortSet.remove(i - 1);
			}
			
			String x = "abc";
			String y = "abc";
			x.concat(y);
			System.out.print(x);

			int xx = 10*10-10;
			System.out.println(xx);
			}
		}
	}