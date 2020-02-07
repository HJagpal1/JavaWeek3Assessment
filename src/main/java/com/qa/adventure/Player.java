package com.qa.adventure;

/**
 * Notes
 * What is needed? 
 * 
 * 
 * @author Harjeevan(Jeevan)
 *
 */
public class Player {
	
	public float xPos ; //= Math.round();
	public float yPos ; // = Math.round((5* random()));
	private String n = "North";
	private String s = "South";
	private String e = "East";
	private String w = "West";
	private String direct; //= "Direction";
	
	@SuppressWarnings("unused")
	private double locate;
	
	public String move() {
		direct = direct .toLowerCase();
		switch(direct) {
		case "North":
			locate += 5.0; //+= will allow the character to go North
			return "move " + n;
		case "South":
			locate -= 5.0;//-= will allow the character to go South
			return "move " + s;
		case "East":
			locate += 2.0;
			return "Move" + e;//+= will allow the character to go East
		case "West":
			locate -= 2.0;
			return "Move" + w; //-= will allow the character to go West
		
		}
		return "What direction are we going next";
		
	}
	
	public String compass() {
		
		return " ";
	}
	
	
	
	//Getters and Setters for players position
	public double getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public double getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	


	
}
