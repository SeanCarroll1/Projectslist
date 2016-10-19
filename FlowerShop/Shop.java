package FlowerShop;

import java.util.Scanner;

public class Shop 
{
	static Scanner in= new Scanner(System.in);
	
	public static void main(String [] args)
	{
		System.out.println("Welcome, would you like to buy a bouquet? \nPlease hit 1 to look around the shop and 0 to exit.");
		//Ask user if they want to buy a bouquet.
		
		if(in.nextInt()==1)
		{
			
			System.out.println("Would you like to add Roses to your bouquet? \nPlease hit 1 to add a rose to your bouquet and 0 to move on to the next flower.");
			//We then check which flowers they would like added.
			if(in.nextInt()==1)
			{		
				//Call roses method if they would like to add roses.
				roses();
			}
			//check to make sure there is still room in the bouquet
			if( Bouquet.getMax()>0)
			{
				//Add tulips if the user wishes too.
				Tulips();
			}
			
			if( Bouquet.getMax()>0)
			{
				Daffodils();
			}
			//Print out the total price of the bouquet and the amount of each flower present.
			System.out.println("Total price is: " +Bouquet.getTotalPrice() + 
					"\nThere are :" +Bouquet.getRose() + " Roses," 
					+ "\nThere are :" + Bouquet.getDaffodil() + " Daffodils,"
					+ "\nThere are :"+ Bouquet.getTulip() + " Tulips.");
		}
		
		System.out.println("Thank you for visiting our store.");
		
	}
	
	static void roses()
	{
		//Declare object
		Rose rose= new Rose();
		//Display the price for this flower.
		System.out.println("Each Rose costs :" + rose.getPrice());
		System.out.println("How many would you like?");
		//ask user the amount they would like, if there is not enough room , ask until the user enters a valid number.
		int amount=in.nextInt();
		
		while(amount>Bouquet.getMax())
		{
			System.out.println("Please enter an amount that there is room for.");
			amount=in.nextInt();
		}
		//Add to the bouquest, this will add too the total price and the amount of roses to the bouquet object.
		rose.add(amount);
		//let the user know how much space is left.
		System.out.println("There are "+ Bouquet.getMax() + " spots left.");
	}
	
	//Repeat the same process as roses for the tulips object.
	static void Tulips()
	{
		System.out.println("Would you like to add Tulips to your bouquet? \nPlease hit 1 to add a tulip to your bouquet and 0 to move on to the next flower.");
		
		if(in.nextInt()==1)
		{
			Tulip tulip= new Tulip();
			System.out.println("Each Tulip costs :" + tulip.getPrice());
			System.out.println("How many would you like?");
			
			int amount=in.nextInt();
			while(amount>Bouquet.getMax())
			{
				System.out.println("Please enter an amount that there is room for.");
				amount=in.nextInt();
			}
			tulip.add(amount);
			

			System.out.println("There are "+ Bouquet.getMax() + " spots left.");
		}
	}
	//Repeat the same process as roses for the Daffodils object.
	static void Daffodils()
	{
		System.out.println("Would you like to add Daffodils to your bouquet? \nPlease hit 1 to add a Daffodil to your bouquet and 0 to move on to the next flower.");
		
		if(in.nextInt()==1)
		{
			Daffodil daffodil= new Daffodil();
			System.out.println("Each Daffodil costs :" + daffodil.getPrice());
			System.out.println("How many would you like?");
		
			int amount=in.nextInt();
			while(amount>Bouquet.getMax())
			{
				System.out.println("Please enter an amount that there is room for.");
				amount=in.nextInt();
			}
			
			daffodil.add(amount);
			
		}
	}
	
}
