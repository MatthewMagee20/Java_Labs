package com.labs.oo;



public class Control {
	public static void main(String[] args) 
	{
		
		//Create new object and print
		Animal Dog = new Animal("Mike", "Dog", 5, true, "White and black");
		System.out.println(Dog); 
		
		Animal Cat = new Animal("Toby", "Cat", 6, true, "orange");
		System.out.println(Cat); 
		
		System.out.println(""); //Empty line
		
		Dog.setaName("Sam");
		//breed, age....
		
		System.out.println(Dog.getaName()); //print name
		Dog.makeNoise(); //woof
		
		System.out.println(""); //Empty line
		
		Cat.setaName("Cal");
		//breed, age....
		
		System.out.println(Cat.getaName()); //Toby
		Cat.makeNoise(); //miaow
		
	}

}
