package TCS;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Date {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		
		System.out.println("\n"+java.time.LocalTime.now());
		System.out.println("\n"+java.time.LocalDateTime.now());
	}

}
