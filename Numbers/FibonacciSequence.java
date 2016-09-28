package Numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSequence 
{
	public static void main(String[] args) 
	 {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number to generate sequence top" );
		int num= in.nextInt();
		
		in.close();
		
		
		int prev=0,p=1;
		System.out.print("[" +prev);
		
		while(p<=num)
		{
			System.out.print(", " +p);
			int temp=p;
			p=prev+p;
			prev=temp;
		}
		System.out.print("]");
	 }
}
