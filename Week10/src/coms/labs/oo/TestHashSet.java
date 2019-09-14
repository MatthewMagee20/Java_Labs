package coms.labs.oo;

import java.util.*;
import java.util.stream.Collectors;

import javax.lang.model.element.Element;

public class TestHashSet {
	
	static Set<String> countries = new HashSet<String>();

	public TestHashSet() 
	{
		countries.addAll(Arrays.asList("Albania", "Andorra", "Austria", "Belarus", "Belgium", "Bosnia Herzegovina", "Bulgaria", "Croatia", "Cyprus", "Czech Republic", "Denmark", "Estonia", "Hungary", "Iceland", "Ireland", 
							"Italy", "Kosovo", "Latvia", "Liechtenstein",
							"Lithuania", "Luxemburg", "Macedonia", "Malta", "Moldova", "Monaco", "Montenegro", "Norway", "Poland",
							"Portugal", "Romania", "Russia", "San Marino", "Serbia", "Slovakia", "Slovenia", "Spain",
							"Sweden", "Switzerland", "the Netherlands", "the United Kingdom", "Turkey", "Ukraine"));
	}
	
	public void printSet() 
	{
			
		Iterator<String> MyIterator = countries.iterator();
		 
		while (MyIterator.hasNext())
		{
			System.out.println(MyIterator.next());
		}
		
	}
	
	public void addEntry (String country)
	{	
		
		 countries.add(country);
	}
	
	public void matchEntry(String country) 
	{	
		 boolean blnExists = countries.contains(new String());
		    System.out.println("Exists in HashSet ? : " + blnExists);
	}
}
