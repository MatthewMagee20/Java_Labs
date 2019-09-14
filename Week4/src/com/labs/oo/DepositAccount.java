package com.labs.oo;

public class DepositAccount extends Account {
	
	private double interestRate;
	
	public DepositAccount(String aName, int aNum, String sCode, String bName, boolean iCred, double aBal, double interestRate) {
		
		super(aName, aNum, sCode, bName, iCred, aBal);
		
		this.interestRate = interestRate;
	}

	public void withdraw(double takeAmount) {
	
		System.out.println("\n You cannot withdraw from this account");

		}
	
	public double getinterestRate() {
		return interestRate;
	}
	
	public void setinterestRate() {
		this.interestRate = interestRate;
	}
	
	public String toString() {
		return "\nDeposit " + super.toString() + "\nInterestRate = " + interestRate + "\n";
	}

}
