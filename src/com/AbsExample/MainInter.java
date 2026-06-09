package com.AbsExample;

public class MainInter {

	public static void main(String[] args) {
		
		Payment p1 = new CreditCardPayment();
		Payment p2 = new UPIpayment();
		p1.pay(4000);
		p2.pay(2000);

	}

}
