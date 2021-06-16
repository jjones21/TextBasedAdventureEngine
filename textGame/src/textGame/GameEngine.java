package textGame;

import java.util.ArrayList;
import java.util.Scanner;

public class GameEngine {
	location currentLocation = null;
	ArrayList<Interactable> inventory = new ArrayList<Interactable>();
	Scanner sc= new Scanner(System.in);
	//String input;
	
	public void start() { //runs program
		System.out.println(currentLocation.introText);
		System.out.println("What will you do?");
		readInput();
		start();
	}
	
	public void readInput() { //parse input, plans for a revision without the use of a switch
		String[] input = sc.nextLine().toLowerCase().trim().split(" ");
		
		switch(input[0]) {
		case "enter":	//ideally synonymous words are recognized for convenience to the player
		case "goto":
			if(input.length < 2) {System.out.println("Go to where? (Usage: goto/enter <locationName>)"); break;} //not enough arguments
			
			location temp = currentLocation.getConnectionFromString(input[1]);
			if(temp == null) {
				System.out.println("\"" + input[1] + "\" not recognized.");
			}else currentLocation = temp;
			break;
			
		case "look":
			if(input.length < 3) {System.out.println("(Usage: look <on/in/under> <containerName>)"); break;} //not enough arguments
			if(currentLocation.getContainerFromString(input[2])==null) {System.out.println("\"" + input[2] + "\" not recognized."); break;}
			currentLocation.getContainerFromString(input[2]).look(input[1]);
			break;
		case "open":	//alternate way to look inside a container
			if(input.length < 2) {System.out.println("(Usage: open <containerName>)"); break;} //not enough arguments
			if(currentLocation.getContainerFromString(input[1])==null) {System.out.println("\"" + input[1] + "\" not recognized."); break;}
			currentLocation.getContainerFromString(input[1]).look("in");
			break;
		case "quit":
			System.out.println("Ending Program.");
			System.exit(0);
		case "?":
		case "help":
			System.out.println("--------------Recognized Commands--------------\nenter, goto, look, open, quit,\n-----------------------------------------------");
			break;
		default:
			System.out.println("\"" + input[0] + "\" not recognized.");
			break;
		}
	}
}
