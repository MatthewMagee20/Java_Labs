package coms.labs.oo;

public class Control {
public static void main(String[] args) {
	
		
		Person p1 = new Person("Matthew","Magee","Vtown");
		Person p2 = new Person("John","Paul","Dublin");
		Person p3 = new Person("Top","Lad","Limerick");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		//Create array list
		ArrayList<Person> People = new ArrayList<Person>();
		
		People.add(new Person("Matthew","Magee","Vtown"));
		People.add(new Person("John","Paul","Dublin"));
		People.add(new Person("Top","Lad","Limerick"));
		
		//Clone list
		ArrayList<Person> PeopleClone = (ArrayList<Person>)People.clone();

		System.out.println("---- Array Print ----");
		//Print contents
		for(int i = 0; i < People.size(); i++) {   
		    System.out.print(People.get(i));
		}
		
		//Print size
		System.out.print("\nSize of array: "+People.size());
		
		System.out.print("\n");
		
		//Print Clone
		System.out.println("\n---- Clone ----");
		
		System.out.print(PeopleClone);
		
		GUI GUI = new GUI("Lab 10"); 
		
		
}
}
