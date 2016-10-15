package ForFun;

import java.util.Scanner;

public class TestAccount 
{
	public static void main(String [] args)
	{
		Account test=new Account(5500);
		Scanner in= new Scanner(System.in);
		
		int user=1;
		
		while(user!=0)
		{
			System.out.println("Enter 1 to lodge money.");
			System.out.println("Enter 2 to withdraw money.");
			System.out.println("Enter 3 to check balance.");
			
			user=in.nextInt();
			
			if(user==0)
			{
				System.out.println("Exiting Program.");
				break;
			}
			else if(user==1)
			{
				
				System.out.println("Please enter the amount of money to lodge.");
				test.lodgeMoney(in.nextInt());
				System.out.println("Your balance is: " + test.getBalance() +".");
				
			}else if(user==2)
			{
				System.out.println("Please enter the amount of money to withdraw.");
				
				int amount=in.nextInt();
				
				if(amount>test.getBalance())
				{
					System.out.println("There is not enough in your account for this transaction.");
				}else
				{
					test.withdraw(amount);
				}
							
				System.out.println("Your balance is: " + test.getBalance() +".");
				
			}
			else if(user==3)
			{
				System.out.println("Your balance is: " + test.getBalance() +".");
			}
			else
			{
				System.out.println("Invalid number.");
			}
				
		}
		in.close();
		
	}

}
