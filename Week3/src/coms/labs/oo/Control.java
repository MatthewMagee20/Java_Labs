package coms.labs.oo;

public class Control {
public static void main(String[] args) {
		
		Employee e1 = new Employee("Yesnaa","IB",123456,232343.00);
		System.out.print(e1);
		System.out.println(e1.calculatePay());
		
		HourlyEmployee h1 = new HourlyEmployee("good","scran",1234567,19000.00,12.00,11.50);
		System.out.print(h1);
		System.out.print(h1.calculatePay());	
		
		CommissionEmployee c1 = new CommissionEmployee("matthew","magee",1234556,190000.00,1213.0);
		System.out.print(c1);
		System.out.print(c1.calculatePay());
		
		
	}
}
