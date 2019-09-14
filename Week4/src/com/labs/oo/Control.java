package com.labs.oo;

public class Control {

	public static void main(String[] args) {
		Account a1 = new Account("Matthew Magee", true, 75);
		DepositAccount da1 = new DepositAccount("s2tg23tg", 0, null, null, false, 0, 0);
		CurrentAccount c1 = new CurrentAccount("qfqegf", false, 0);
						
		da1.getDetails();
	}

}
