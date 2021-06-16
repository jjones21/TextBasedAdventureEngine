package textGame;

public class Interactable {
	
	String name;
	String description;
	
	Interactable(String n){
		name = n;
	}

	public void examine() {
		System.out.println(description);
	}
	
	public void use() {
		
	}
	
	public String toString() {
		return name;
	}
}
