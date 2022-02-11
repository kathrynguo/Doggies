public class Oodle extends Dog {
	
	public boolean sh; //sheds
	
	public Oodle(String name, int year, boolean shed) {
		super(name, year); 
		this.sh = shed; 
	}
	
	public String shed() {
		if (this.sh == true) {
			return("I do not shed!"); 
		}
		else {
			return("I shed :("); 
		}
	}
	
	
}
