package Numbers;

import java.util.Scanner;

public class FactorialFinder 
{
	public static void main(String[] args) 
	 {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int num= in.nextInt();
		in.close();
		
		int sum=num;
		
		//Using recursive method to get factorials.
		System.out.print(num);
		System.out.print(" = " + RecursiveFactorial(num-1,sum));
		
		//Using a For loop to get factorials.
		System.out.println();
		System.out.print(num);
		for(int i=num-1; i>0; i--)
		{
			System.out.print(" X " + i);
			sum*=i;
		}
		
		System.out.print(" = " + sum);
		
	 }
	
	
	public static int RecursiveFactorial (int num,int sum)  
	{  
		
		  System.out.print(" X " + num); 
		  sum*=num;
		  num--;
		  if (num == 0)
		  {
			  return sum; 
		  }
	     
	  return RecursiveFactorial(num,sum);  
	}  
}
