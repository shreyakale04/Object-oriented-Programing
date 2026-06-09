package com.AbsExample;

public class Main {

	public static void main(String[] args) {
		
		Bank b1 = new HDFC();
		
		b1.checkBalance();
		b1.deposit(5000);
		b1.withdraw(6000);
		b1.checkBalance();

	}

}
