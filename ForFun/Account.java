package ForFun;

public class Account 
{
	private double balance;
	
	Account(double currentBalance)
	{
		this.balance=currentBalance;	
	}
	
	public void withdraw(double amount)
	{
		
			 balance-=amount;
	}
	
	
	public void lodgeMoney(double amount)
	{
		balance+=amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
}

