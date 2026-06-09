package com.AbsExample;

public class HDFC extends Bank {
	
	private double balance = 15000;
	
	@Override
	void withdraw(double amount){
		
		if(amount<=balance){
			
			balance -= amount;
			System.out.println("Withdraw Successfully : " + amount);
		}else{
			System.out.println("Insufficient balance");
		}
	}
	@Override
	void deposit(double amount){
		
		if(amount > 0){
			balance += amount;
			System.out.println("Deposit Successfully : " + amount);
		}
		else{
			System.out.println("Amount must be positive : ");
		}
	}
	@Override
	void checkBalance(){
		
		System.out.println("Balance : " + balance);
	}
 
}
