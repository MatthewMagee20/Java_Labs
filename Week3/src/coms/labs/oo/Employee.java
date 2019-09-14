package coms.labs.oo;

public class Employee {
	private String firstName;
	private String surName;
	private int staffNumber;
	private double annualSalary;
	
	public Employee(String fName, String sName, int sNumber, double aSalary)
	{
		this.firstName = fName;
		this.surName = sName;
		this.staffNumber = sNumber;
		this.annualSalary = aSalary;
	}

	public double calculatePay()
	{
		return (double) annualSalary/12;
	}
	
	public String toString()
	{
		String s = "\nThe employee is called " + this.firstName+ " " + this.surName+
				" and has a salary of " + this.annualSalary + " . " + 
				"Their staff number is " +this.staffNumber +
				" and monthly salary is " + calculatePay();
				;
				
				return s;
	}
}
