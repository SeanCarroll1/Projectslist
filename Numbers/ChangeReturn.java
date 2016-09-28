package Numbers;

import java.util.Scanner;
//Program to calculate the change given after purchase.
//The Program informs the user of the coins he will be given

public class ChangeReturn
{
	 public static void main(String[] args) 
	 {
		 Scanner in = new Scanner(System.in);
	     System.out.println("Please enter the cost.");
	     
	     double cost = in.nextDouble();
	     
	     System.out.println("Please enter the money given.");
	     
	     double money = in.nextDouble();
	     in.close();
	     
	     int change=(int) ((money-cost)*100);
	     
	     System.out.println("The change returned is: " + (double)change/100 );// change(cost,money));
	     
	     //Divide quarter equivalent to find how many quarters are in change.
	     int quarters =  (change/25);
	     // Take the sum from change.
	     change-=(quarters*25);
	    
	     //Repeat for each coin.
	     int dimes= (change/10);
	     change-=(dimes*10);
	   
	     int nickels= (change/5);
	     change-=(nickels*5);
	   
	     int pennies = (change/1);
	     
	     System.out.println("Quarters: " 
	     + quarters +"\n" +"Dimes: " + dimes
	     + "\n" + "Nickels: " + nickels +"\n" + "Pennies: " + pennies);
	     
	     
	 }
	 
	
}
