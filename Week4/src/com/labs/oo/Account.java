package com.labs.oo;

public class Account implements ValidatedAccount {
	
	private String accountName;
	private int accountNumber;
	private String sortCode;
	private String branchName;
	private boolean inCredit;
	private double acctBalance;
	private static int currentNum = 0;
	
	public Account(String accountName, int accountNum, String sortCode, String branchName, boolean inCredit, double acctBalance) {
		
		this.accountName = accountName;
		this.accountNumber = currentNum;
		this.sortCode = sortCode;
		this.branchName = branchName;
		this.inCredit = inCredit;
		this.acctBalance = acctBalance;
	}
	
	public Account(String accountName, boolean inCredit, double acctBalance) {
		
		currentNum++;
		this.accountName = accountName;
		this.accountNumber = currentNum;
		this.inCredit = inCredit;
		this.acctBalance = acctBalance;
				
	}
	
	public void deposit(double depAmount) {
		
		acctBalance =  depAmount + acctBalance;
		
		
	}
	
	public void withdraw(double takeAmount) {
		
		acctBalance = acctBalance - takeAmount;
		
		if(acctBalance < 0) {
			
			System.out.println("Balance is negative!");
		}
			
		
	}
	
	public void getDetails() {
	
		System.out.println("\n" +this.getClass().getSimpleName()+ "\n" + acctBalance);
	}
	
	public void valuableAccount() {
		System.out.println(acctBalance);
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public boolean isInCredit() {
		return inCredit;
	}

	public void setInCredit(boolean inCredit) {
		this.inCredit = inCredit;
	}

	public double getAcctBalance() {
		return acctBalance;
	}

	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}

	@Override
	public String toString() {
		return "Account \nAccountName = " + accountName + "\nAccountNumber = " + accountNumber + "\nsortCode = " + sortCode
				+ "\nbranchName = " + branchName + "\ninCredit = " + inCredit + "\nacctBalance = " + acctBalance;
	}

}
