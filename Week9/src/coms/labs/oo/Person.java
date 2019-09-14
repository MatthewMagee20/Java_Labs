package coms.labs.oo;

public class Person {
	String fname;
	String sname;
	String city;
	
	public Person(String fname, String sname, String city) {
		this.fname = fname;
		this.sname = sname;
		this.city = city;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString()
	{
		String s = "This person is called: "+fname+" "+sname+
				"\nLives in: "+city+
				"\n";
		
		return s;
	}

}
