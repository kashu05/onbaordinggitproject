package com.amdocs;

public class SavingsAccount 
{
	
	public double getBalance()
	{
		System.out.println("Assume balance is retreived from db");
		return 7000.00;
		
	
	}
	
	public double withdraw(double amountToBeWithrawn) throws InsufficientBalanceException
	{
		System.out.println("Inside withdraw method");
		
		double currentBalance= getBalance();
		
		if( amountToBeWithrawn <currentBalance)
			currentBalance=currentBalance-amountToBeWithrawn;
		
		
		else
			throw new InsufficientBalanceException();
		
		updateBalanceIntoDB(currentBalance);
		return currentBalance;
		
	
	}
	
	
	public void updateBalanceIntoDB(double currentBalance) {
		
		System.out.println("Assume balance is updated ");
		
	}


	

}
