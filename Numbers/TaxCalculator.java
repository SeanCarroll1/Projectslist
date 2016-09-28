package Numbers;

import java.util.Scanner;

public class TaxCalculator 
{
	public static void main(String[] args) 
	 {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter cost." );
		double cost= in.nextDouble();
		
		System.out.println("Please enter Tax Rate." );
		double taxRate= in.nextDouble();
		
		in.close();
		
		System.out.println("Tax price is: " + (cost*(taxRate/100)));
		
		System.out.println("Total price is: " + (cost*(taxRate/100)+cost));
	 }
}
