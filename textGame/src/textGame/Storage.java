package textGame;

import java.util.ArrayList;

public class Storage { //can contain items inside, on top, and underneath.
	
	String name;	//name of storage container

	ArrayList<Interactable> onTop = new ArrayList<Interactable>();	//location 0
	ArrayList<Interactable> inside = new ArrayList<Interactable>();	//location 1
	ArrayList<Interactable> under = new ArrayList<Interactable>();	//location 2
	
	Storage(String n) {
		name = n;
	}
	
	void add(Interactable i, int location) {
		switch(location) {
		case 0:
			onTop.add(i);
			break;
		case 1:
			inside.add(i);
			break;
		case 2:
			under.add(i);
			break;
		}
	}
	
	void add(ArrayList<Interactable> i, int location) {
		switch(location) {
		case 0:
			onTop.addAll(i);
			break;
		case 1:
			inside.addAll(i);
			break;
		case 2:
			under.addAll(i);
			break;
		}
	}
	
	void look(String location){
		
		switch(location) {
		case "on":
			System.out.println("On top of the "+ name + ":");
			System.out.println(onTop.toString());
			break;
		case "in":
		case "inside":
			System.out.println("Inside the "+ name + ":");
			System.out.println(inside.toString());
			break;
		case "under":
			System.out.println("Underneath  the "+ name + ":");
			System.out.println(under.toString());
			break;
		}
	}
	
	Interactable take(String item, int location) {
		ArrayList<Interactable> dataSet = new ArrayList<Interactable>();
		switch(location) {
		case 0:
			dataSet = onTop;
			break;
		case 1:
			dataSet = inside;
			break;
		case 2:
			dataSet = under;
			break;
		}
		
		for(Interactable temp: dataSet) {
			if(temp.name.equals(item)){
				return temp;
			}
		}
		return null;
		// fail case
	}
	
	void CheckContents() {
		// List the contents inside
	}
	
	void CheckTop() {
		
	}
}
