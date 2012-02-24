//Andrew Bertrand
//Assignment 3
//SpaceObject class
// 3/15/10

package comets;

//class for all space objects in the game
public abstract class SpaceObject{
	
	double xPos, yPos, radius;
	protected double xVelocity, yVelocity;
	static double playfieldHeight, playfieldWidth;
	
	//creates the new space object with the information
	public SpaceObject(double xPos, double yPos, double xVel, double yVel,
			double radius)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		xVelocity = xVel;
		yVelocity = yVel;
		this.radius = radius;
	}
	
	//returns the radius
	double getRadius()
	{
		return radius;
	}
	
	//returns the xPos
	public double getXPosition()
	{
		return xPos;
	}
	
	//returns the yPos
	public double getYPosition()
	{
		return yPos;
	}
	
	//moves the object in accordance with the velocity and sets it to the
	//opposite side of the screen if necessary
	public void move()
	{
		this.xPos += xVelocity;
		this.yPos += yVelocity;
		
		if(xPos - radius > playfieldWidth)
			xPos = 0 - radius;
		else if(xPos + radius < 0)
			xPos = playfieldWidth + radius;
		if(yPos - radius > playfieldHeight)
			yPos = 0 - radius;
		else if(yPos + radius < 0)
			yPos = playfieldHeight + radius;
	}
	
	//compares the radii of objects to see if they overlap
	//returns true if they do
	public boolean overlapping(SpaceObject rhs)
	{
		if(Math.sqrt(Math.pow((Math.abs(xPos - rhs.getXPosition())), 2) + Math.pow(Math.abs((yPos - rhs.getYPosition())), 2)) < (radius + rhs.getRadius()))
			return true;
		else
			return false;
		
	}

}
