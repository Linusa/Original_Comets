//Andrew Bertrand
//Assignment 3
//MediumComet class
// 3/15/10

package comets;

import java.util.*;

//class for all medium comets in the game
public class MediumComet extends Comet{
	
	//new space object with 30 radius
	public MediumComet(double xPos, double yPos, double xVel, double yVel)
	{
		super(xPos, yPos, xVel, yVel, 30);
	}
	
	//returns a vector with 3 small comets if necessary
	public Vector<Comet> explode()
	{
		Vector<Comet> fragments = new Vector<Comet>();
		for(int i = 0; i < 3; i++)
		fragments.add(new SmallComet(xPos, yPos, Math.random() * 5 - 2, 
				Math.random() * 5 - 2));
		
		return fragments;
	}

}
