package Numbers;

import java.util.Scanner;

public class NextPrimeNumber 
{
	public static void main(String[] args) 
	 {
		Scanner in = new Scanner(System.in);
		//System.out.println("Please enter a limit to begin." );
		//int limit= in.nextInt();
		//in.close();
		//loop to print out all primes to a limit given
		/*for(int i=1; i<=limit; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}*/
		
		
		int finish=1;
		//while loop finding a prime number until the user enters a zero
		int i=2;
		while(finish==1)
		{
			if(isPrime(i))
			{
				System.out.println(i);
				System.out.println("Please enter zero to stop." );
				finish=in.nextInt();
			}
			i++;
			
		}
		in.close();
		System.out.println("The program is finished." );
	
	 }
	
	static boolean isPrime(int n)
	{
		if (n%2==0) 
			{
				return false;
			}
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) 
	    {
	        if(n%i==0)
	        {
	        	return false;
	        }
	            
	    }
	    
	    return true;
	    
	}
}
