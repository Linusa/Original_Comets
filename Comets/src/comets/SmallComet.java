//Andrew Bertrand
//Assignment 3
//SmallComet class
// 3/15/10

package comets;

import java.util.*;

//class for all the small comets
public class SmallComet extends Comet{
	
	//new space object with 20 radius
	public SmallComet(double xPos, double yPos, double xVel, double yVel)
	{
		super(xPos, yPos, xVel, yVel, 20);
	}
	
	//returns an empty comets vector when the comet dies
	public Vector<Comet> explode()
	{
		Vector<Comet> fragments = new Vector<Comet>();
		return fragments;
	}

}
