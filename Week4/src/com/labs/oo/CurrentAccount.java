package com.labs.oo;

public class CurrentAccount extends Account {
private double penaltyAmount;
	
	public CurrentAccount(String accountName, int accountNum, String sortCode, String branchName, boolean inCredit, double acctBalance, double penaltyAmount) {
		
		super(accountName, accountNum, sortCode, branchName, inCredit, acctBalance);
		this.penaltyAmount = penaltyAmount;
		
	}

	public CurrentAccount(String aName, boolean iCred, double aBal) {
		super(aName, iCred, aBal);
	}
	
	
	public void withdraw(double takeAmount) {
		
		if((super.getAcctBalance()-takeAmount) < 0) {
			
			System.out.println("\n Insufficient funds");
		}
		else {
			super.withdraw(takeAmount);
		}
	}
	
	public String checkCredit(){
		
		if(isInCredit()) {
			return "\n In credit!";
		}
		else {
			return "\n not";
		}
	
	}
	
	public void CheckCredit(String warning) {
		
		if((getAcctBalance() < 100) && (getAcctBalance() > 0) ){
			
			System.out.println(warning);
		}
		else {
			System.out.println(warning);
		}
	}

	public double getPenaltyAmount() {
		return penaltyAmount;
	}

	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
	
	public String toString() {
		return "\nCurrent " + super.toString() + "penalty amount = " + penaltyAmount + "\n";
	}
}
