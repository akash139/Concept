package TCS;
import java.util.*;
public class CarRent{
    public static int computeRental(int distance, int hours){
      
    	if(distance<250 && hours<8){
    	   return 2000;
        }
        else if(distance>250 && hours<8){
           return 2000 + ( distance - 250 ) * 20;
        }
        else if(distance<250 && hours>8){
            return 2000 + (hours-8) * 100;
        }
        else if(distance>250 && hours>8){
           return 2000 + (distance - 250) * 20;
        }
        else {
        	return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int hours =  sc.nextInt();
        sc.close();
        System.out.println(computeRental(distance, hours));
    }
}