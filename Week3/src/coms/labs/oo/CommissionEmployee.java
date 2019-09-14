package coms.labs.oo;

public class CommissionEmployee extends Employee {
	
	double comEarned;
	
	public CommissionEmployee(String fName, String sName, int sNumber, double aSalary, double cEarned) {
		super(fName, sName, sNumber, aSalary);
		
		this.comEarned = cEarned;	
	}
	
	public double calculatePay(){
		
		return (double) super.calculatePay() + comEarned;
	}
	
	public String toString()
	{	
		return super.toString() + "\nCommission Earned: "+ comEarned;
	}

}
