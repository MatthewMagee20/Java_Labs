package com.labs.oo;

public class Employee extends Person {
	private Job job;
	private int personelNumber = nextNumber++;
	private Date startDate;
	private static int nextNumber =1;
	
	
	public Employee(String firstName, String surName, Date dateOfBirth, String gender, Job job, int personelNumber, Date startDate, int nextNumber) {

			super(firstName, surName, dateOfBirth, gender);

		}


	public Job getJob() {
		return job;
	}


	public void setJob(Job job) {
		this.job = job;
	}


	public int getPersonelNumber() {
		return personelNumber;
	}


	public void setPersonelNumber(int personelNumber) {
		this.personelNumber = personelNumber;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public int getNextNumber() {
		return nextNumber;
	}


	public void setNextNumber(int nextNumber) {
		this.nextNumber = nextNumber;
	}
	
	public String toString() {
		return super.toString() +
				"\nJob: " +job+
				"\nPersonel Number: "+personelNumber+
				"\nStart Date: " +startDate
				;
		}
}
