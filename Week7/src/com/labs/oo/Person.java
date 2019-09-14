package com.labs.oo;

public class Person {
	private String firstName;
	private String surName;
	private Date dateOfBirth;
	private String gender;
	
	Person(String firstName, String surName, Date dateOfBirth, String gender){
		this.setFirstName(firstName);
		this.setSurName(surName);
		this.setDateOfBirth(dateOfBirth);
		this.setGender(gender);
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "Firstname: " +firstName +
				"\nSurname: " +surName +
				"\nDOB: " +dateOfBirth +
				"\nGender " +gender;
}
}
