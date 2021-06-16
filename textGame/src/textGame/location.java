package textGame;

import java.util.ArrayList;

public class location {	//can be navigated to by the player through connections, can contain interactable items and containers for storing items.

	String name;		//name of the location
	String introText;	//text that displays on entry of location
	ArrayList<Interactable> interactables = new ArrayList<Interactable>();
	ArrayList<Storage> containers = new ArrayList<Storage>();
	ArrayList<location> connections = new ArrayList<location>();
	
	location(String s){
		name = s;
	}
	
	public location getConnectionFromString(String s){
		for(location temp: connections) {
			if(temp.name.equals(s)){
				return temp;
			}
		}
		return null;
	}
	
	public Storage getContainerFromString(String s){
		for(Storage temp: containers) {
			if(temp.name.equals(s)){
				return temp;
			}
		}
		return null;
	}
	
	public Interactable getItemFromString(String s) {
		for(Interactable temp: interactables) {
			if(temp.name.equals(s)){
				return temp;
			}
		}
		return null;
	}
	
}
