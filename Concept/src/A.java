import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class A {
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
	        else if(distance == 0 && hours == 0){
	        	return 0;
	        }
	    	return 1;
	    }
	 }
class B{
	 public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 
		 int distance = Integer.parseInt(br.readLine());
		 int hours = Integer.parseInt(br.readLine());
		 int result = A.computeRental(distance, hours);
		 
		 bw.write(String.valueOf(result));
		 bw.newLine();
		 br.close();
		 bw.close();
	 } 
	 }