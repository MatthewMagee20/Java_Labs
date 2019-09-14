package com.labs.oo;

public class Animal {
	private String aName;
	private String aBreed;
	private int aAge;
	private boolean aDomesticAnimal;
	private String aColour;
	private boolean old;

	public Animal(String Name, String Breed, int Age, boolean DomesticAnimal, String Colour)
	{
		this.aName = Name;
		this.aBreed = Breed;
		this.aAge = Age;
		this.aDomesticAnimal = DomesticAnimal;
		this.aColour = Colour;
	}
	
	
	public String toString()
	{
		String Check = "";
		
		if(this.aDomesticAnimal)
		{
			Check =  "domestic";
		}
		else
		{
			Check = "not domestic";
		}
		
		String s = "The animal name is called " + this.aName + ", " + "is a " + this.aBreed + ", " + "is " +this.aAge + " years old," + 
		" is " + Check + " and is " +this.aColour;
	
		return s;
	}
	
	public void makeNoise()
	{
		switch(aBreed) 
		{
			case "Dog":
				System.out.println("woof");
			break;
		}
		
		switch(aBreed) 
		{
			case "Cat":
				System.out.println("miaow");
			break;
		}
			
	}
	
	public void makeNoise(boolean old)
	{
		if(old)
		{
			System.out.println("old");
		}
		
		else
		{
			makeNoise();
		}
		
	}	
	
	
	//Getters and Setters
	public String getaName() 
	{
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaBreed() {
		return aBreed;
	}

	public void setaBreed(String aBreed) {
		this.aBreed = aBreed;
	}

	public int getaAge() {
		return aAge;
	}

	public void setaAge(int aAge) {
		this.aAge = aAge;
	}

	public boolean isaDomesticAnimal() {
		return aDomesticAnimal;
	}

	public void setaDomesticAnimal(boolean aDomesticAnimal) {
		this.aDomesticAnimal = aDomesticAnimal;
	}

	public String getaColour() {
		return aColour;
	}

	public void setaColour(String aColour) {

		this.aColour = aColour;
	}
	
	public boolean isOld() {
		return old;
	}

	public void setOld(boolean old) {
		this.old = old;
	}
	
}
