public class Shiba extends Dog {
	
	public int sm; 
	
	public Shiba(String name, int year, int smart) {
		super(name, year); 
		this.sm = smart; 
	}
	
	public String smart() { 
		return("I am " + sm + " smart out of 10!"); 
	}
	
	
}
