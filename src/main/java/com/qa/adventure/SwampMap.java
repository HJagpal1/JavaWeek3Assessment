package com.qa.adventure;

/**
 * Notes The swamp biome map is massive(Infinite). Within the swamp map, there
 * needs to an exit.
 * 
 * 
 * @author Harjeevan(Jeevan)
 *
 */
public class SwampMap extends Player {
	float a1 = Math.round(5* Math.random());
	float a2 = Math.round(5* Math.random());
	
	
	public float getA1() {
		return a1;
	}

	public void setA1(float a1) {
		this.a1 = a1;
	}

	public float getA2() {
		return a2;
	}

	public void setA2(float a2) {
		this.a2 = a2;
	}

	public void CreateSwampMap() {

	}

	public void CreateSwampExit() {
		//float dis = (float) Math.random();
			
		}

}
