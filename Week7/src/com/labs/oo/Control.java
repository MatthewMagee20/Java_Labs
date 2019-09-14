package com.labs.oo;

public class Control {
	public static void main(String[] args) {
		Date dob = new Date(0,0,2019);
		Date s1 = new Date(1,2,2015);
		
		Job j1 = new Job(29.000, "Architect", 123456);
		
		Employee e1 = new Employee("Matthew","Magee",dob,"male", j1, 0, s1, 0);
		Employee f1 = new Employee("Matthew","Magee",dob,"male", j1, 0, s1, 0);
		
		System.out.println(e1);
		System.out.println("");
		System.out.println(f1);
		
	}
}
