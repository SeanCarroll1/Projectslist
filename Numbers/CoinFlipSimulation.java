package Numbers;

import java.util.Random;
import java.util.Scanner;

public class CoinFlipSimulation 
{
	public static void main(String[] args) 
	 {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the amount of flips.");
		int limit=in.nextInt();
		
		Random rand = new Random();
		//Declare variables for both sides.
		int tails=0,heads=0;
		
		for(int i=0; i<limit; i++)
		{
			//Check if the random number is 0 if so heads incremented else tails.
			if(rand.nextInt(2)==0)
			{
				heads++;
			}else
			{
				tails++;
			}
		}
		
		System.out.println("Landed on heads:" + heads);
		System.out.println("Landed on tails:" + tails);
	 }
}
