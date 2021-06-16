package textGame;
import java.util.ArrayList;

public class test {

	
	public static void main(String[] args) {	//creates several objects as an example scene
	
		GameEngine test1 = new GameEngine();
		location livingRoom = new location("living_room");
		location kitchen = new location("kitchen");
		location bedroom = new location("bedroom");
		Storage refrigerator = new Storage("refrigerator");
		Interactable sandwitch = new Interactable("sandwitch");
		
		livingRoom.connections.add(kitchen);
		livingRoom.connections.add(bedroom);
		bedroom.connections.add(livingRoom);
		kitchen.connections.add(livingRoom);
		
		livingRoom.introText = "You enter the living_room and see a shelf and two doors leading to the kitchen and bedroom.";
		bedroom.introText = "There is a bed in the center of the room, and a door leading to the living_room";
		kitchen.introText = "In the kitchen there is a refrigerator and a door leading back to the living_room";
		
		refrigerator.add(sandwitch, 1);
		kitchen.containers.add(refrigerator);
		
		test1.currentLocation = livingRoom;
		test1.start();
	}
	
}
