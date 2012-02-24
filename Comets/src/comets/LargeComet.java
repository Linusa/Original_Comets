//Andrew Bertrand
//Assignment 3
//LargeComet class
// 3/15/10

package comets;

import java.util.*;

//class for all large comets
public class LargeComet extends Comet{
	
	//new space object with 40 radius
	public LargeComet(double xPos, double yPos, double xVel, double yVel)
	{
		super(xPos, yPos, xVel, yVel, 40);
		
	}
	
	//returns two medium comets when explode() is called
	public Vector<Comet> explode()
	{
		Vector<Comet> fragments = new Vector<Comet>();
		fragments.add(new MediumComet(xPos, yPos, Math.random() * 5 - 2, 
				Math.random() * 5 - 2));
		fragments.add(new MediumComet(xPos, yPos, Math.random() * 5 - 2, 
				Math.random() * 5 - 2));
		return fragments;
	}

}
