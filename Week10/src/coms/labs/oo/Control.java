package coms.labs.oo;

public class Control {

	public static void main(String[] args) {
	TestHashSet TestHashSet = new TestHashSet();
	
	System.out.println("----------First list----------");
	TestHashSet.printSet();
	System.out.println("");
	
	System.out.println("----------Added Entry----------");
	TestHashSet.addEntry("Vatican City --------");
	TestHashSet.printSet();
	System.out.println("");
	
	TestHashSet.matchEntry("Cyprus");
	System.out.println("");
	}
}
