package com.labs.oo;

public class Date {

	private int day;
	private int month;
	private int year;

	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDate(int date) {
		if (day < 1 || day > 32) {
			throw new IllegalArgumentException("Day can't be 0 or greater than 31");
		}
		this.day = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			throw new IllegalArgumentException("Month can't be 0 or greater than 12");
		}
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() 
    { 
	
		return day+"/"+month+"/"+year;
		
		
    }
}


