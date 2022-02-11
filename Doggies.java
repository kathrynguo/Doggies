import java.util.ArrayList; 

public class Doggies {

	public static void main(String[] args){
		
		ArrayList dog = new ArrayList(); 
		
		Shiba s1 = new Shiba("Pancake", 2020, 11); 
		//s1.eat("Blue Buffalo"); 
		Shiba s2 = new Shiba("Cheddar", 2022, 12);
		Shiba s3 = new Shiba("Turtle", 2017, 9); 
		
		Oodle o1 = new Oodle("Waffle", 2021, true); 
		Oodle o2 = new Oodle("Peanut", 2020, true); 
		Oodle o3 = new Oodle("Noodle", 2019, true); 
		//o1.eat("Purina"); 
		
		dog.add(s1); 
		dog.add(o1); 
		dog.add(s2); 
		dog.add(o2);
		dog.add(s3); 
		dog.add(o3);  
		
		System.out.println(dog);
		
		Oodle o4 = new Oodle("Cocoa", 2019, true); 
		
		dog.remove(4); 
		dog.add(4, o3); 
		dog.set(5, o4); 
		
		System.out.println(dog);
	}
}
