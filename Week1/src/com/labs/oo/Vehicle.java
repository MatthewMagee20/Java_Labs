package com.labs.oo;

/****************************************
* Control
* Author: Matthew Magee
* Date: 31/01/2019
*****************************************/

class Vehicle {
	
	private String ownerName;
	private String regNum;
	private int miles;
	private String colour;
	
	public Vehicle(String ownerName) 
	{
		this.ownerName = ownerName;
	}
	
	public Vehicle(String owner, String reg, int mile, String colours) 
	{
		
		this.ownerName = owner;
		this.regNum = reg;
		this.miles = mile;
		this.colour = colours;
	}
		
		public String toString()
		{
			String s = "Owner: " + this.ownerName +"\n"
					+ "Reg: " + this.regNum +"\n"+
					"Miles: " +this.miles + "\n"+
					"Colour: " +this.colour;
		
			return s;
		}
	
	}