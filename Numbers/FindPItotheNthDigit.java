package Numbers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FindPItotheNthDigit 
{
	public static void main(String[] args) 
	 {
		 
	        Scanner in = new Scanner(System.in);
	        //Ask user to enter number  (radius).
	        System.out.println("Please enter a number.");
	        double num = in.nextDouble();
	       //Ask user to enter amount of places.
	        System.out.println("Please enter the amount of decimal places.");
	        int n = in.nextInt();
	        
	        in.close();
	        //Using Math.pi we calculate the area of a circle.
	        double sum =Math.PI * Math.pow(num, 2);
	        
	       //We can convert to a double.
	        double result= new BigDecimal(sum).setScale(n, RoundingMode.HALF_UP).doubleValue();
	        //Or use as a bigDecimal as it can store more places.
	        BigDecimal decAns=new BigDecimal(sum).setScale(n, RoundingMode.HALF_UP);
	        
	        if(n>100)
	        {
	        	System.out.println("Too many decimal places.");
	        }
	        else
			{
				
		        System.out.println(result + "\n" + decAns);
			}
	        	
	        }
			

}
