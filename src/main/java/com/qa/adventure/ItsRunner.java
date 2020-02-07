package com.qa.adventure;

import java.util.Scanner;

/**
 * Notes The player/user, is lost in a swamp
 * 
 * What is needed with in this class?
 * Two Scanners  --> This needs to be imported in 
 * 						--> First scanner to add players name
 * 						--> Second scanner for players to input players direction
 * 
 * @author Harjeevan (Jeevan)
 *
 */

public class ItsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pInsert = new Scanner(System.in); // pInsert --> Player Insert
		Scanner pDirect = new Scanner(System.in); // pDirect --> Player Direction

		Player player = new Player();

		SwampMap swamp = new SwampMap();
		swamp.CreateSwampMap(); // Create
		swamp.CreateSwampExit();

		/**
		 * A boolean loop is needed, as it will continue throw a loop
		 * until the player has found exit
		 */
		boolean loop;
//		boolean i = false ) {
//			
//		}
		/**
		 * 
		 */
		System.out.println("THE DAY IS THE FRIDAY 13TH FEBRUARY \r\n");
		System.out.println("Grey foggy clouds float oppressively close to you, \r\n"
				+ "reflected in the murky grey water which reaches up your shins.");
		System.out.println("Some black plants barely poke out of the shallow water.");
		System.out.println("Try \"north\", \"south\", \"east\", or \"west\"");
		System.out.println("You notice a small watch-like device in your left hand.  ");
		System.out.println("It has hands like a watch, but the hands don't seem to tell time. \r\n ");

		/**
		 * Player is able  to insert name here, players name will appear through out the game
		 */
		String playerName;
		System.out.println("Please enter name here : ");
		playerName = pInsert.next();

		System.out.println("Hello " + playerName);
		System.out.println("We seem to be lost!!");
		System.out.println("There must be a reason why we are?");
		System.out.println(playerName + "What is that on the floor, It looks like a compass");
		System.out.println("That can be useful " + playerName + " keep that in your hand.");
		System.out.println("Lets search for away out of here. \r\n \r\n");

		/**
		 * Instruction for the user. They will need to type N, E, S , W or L into the
		 * console.
		 */
		System.out.println("INSTRUCTIONS : ");
		System.out.println("Type N to go NORTH");
		System.out.println("Type E to go EAST");
		System.out.println("Type S to go SOUTH");
		System.out.println("Type W to go WEST");
		System.out.println("Type L if you are LOST \r\n \r\n");

		System.out.println("What direction do you want to go in?");

		
		/**
		 * 
		 */
		String playerDir;
		playerDir = pDirect.nextLine();
		while (playerDir.toString() == "N" || playerDir.toString() == "S" || playerDir.toString() == "E"
				|| playerDir.toString() == "W" || playerDir.toString() == "L") {
			if (playerDir == "N") {
				System.out.println(playerName +"You are going North");
			} else if (playerDir == "E") {
				System.out.println(playerName +"You are going East");
			} else if (playerDir == "S") {
				System.out.println(playerName +"You are going South");
			} else if (playerDir == "W") {
				System.out.println(playerName +"You Are going West");
			} else if (playerDir == "L"){
				System.out.println(playerName +"Are you lost?");
				System.out.println("You can do it, keep going");
			}else {
				System.out.println(playerName +"What is your next move?");
			}

		}
		
		

	}

}
