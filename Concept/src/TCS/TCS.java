package TCS;

import java.util.Scanner;
public class TCS {
	static float p =0.0f;
	static int q = 0;
	static int r = 0;
	
	static void check(int itemNo, int Quantity) {
		
		String itemName[] = {"Milk", "Cheese", "Ghee", "Bread"};
		int itemNumber[] = {101, 102, 103, 104};
		int Stock[] = {10, 20, 15,16};
		int price[] = {40, 50, 50,40};
	
		for(int i=0; i<itemNumber.length;i++) {
			if(itemNo == itemNumber[i] && Quantity < Stock[i]) {
				p = Quantity * price[i];
				q = Stock[i] - Quantity;
				
				System.out.println(itemName[i]+": "+p+" INR");
				System.out.println(itemName[i]+": "+q+" LEFT");
			}
			else if(itemNo == itemNumber[i] && Quantity > Stock[i]){
				System.out.println(itemName[i]+": NO STOCK");
				System.out.println(itemName[i]+": "+Stock[i]+" LEFT");
				}
		}
		
	}
	public static void main(String[] args)  {
		try {
		Scanner sc = new Scanner(System.in);
		int itemNo = sc.nextInt();
		int Quantity = sc.nextInt();
		sc.close();
		check(itemNo, Quantity);
		}catch(Exception e) {
			System.out.println("INVALID INPUT");
		}
	}
}