//Andrew Bertrand
//Assignment 3
//Comet class
// 3/15/10

package comets;

import java.util.*;

//class for all comets in the game
public abstract class Comet extends SpaceObject{
	
	//creates another space object with the specified radius
	public Comet(double xPos, double yPos, double xVel, double yVel, double radius)
	{
		super(xPos, yPos, xVel, yVel, radius);
	}
	
	//all comets need an explode() method
	abstract Vector<Comet> explode();
}
