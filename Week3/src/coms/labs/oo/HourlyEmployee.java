package coms.labs.oo;

public class HourlyEmployee extends Employee {
	double hoursWorked;
	double hourlyRate;
	
	public HourlyEmployee(String fName, String sName, int sNumber, double aSalary, double hWorked, double hRate) {
		super(fName, sName, sNumber, aSalary);
		
		this.hoursWorked = hWorked;
		this.hourlyRate = hRate;
			
	}
	
	public double calculatePay()
	{
		return (double) hoursWorked*hourlyRate;
		
	}
	
	public String toString()
	{	
		return super.toString() + "\nHours Worked: "+hoursWorked +
				"\nHourly Rate: " +hourlyRate +
				"\nTotal pay: "
				;	
	}
}
