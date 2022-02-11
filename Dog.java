public class Dog {
	
	public String name; 
	public int year;
	
	public String brand; 

	public void eat(String brand1){
		System.out.println("Please place my Chewy.com order"); 
		brand = brand1; 
		System.out.println("My favorite brand of food is " + brand); 
		
	}
	
	public void sleep(){
		System.out.println("Please fluff my dog bed"); 
	}
	
	public String bark(){
		return("Woof woof woof woof woofwoofwoof"); 
	}
	
	public Dog(String dogName, int yearOfBirth){
		this.name = dogName; 
		this.year = yearOfBirth; 
	}
	
	public String toString(){
		return("My name is " + name + " and I was born in " + year);
	}
}
