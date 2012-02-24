//Andrew Bertrand
//Assignment 3
//Ship class
// 3/15/10

package comets;

//class for the player's ship
public class Ship extends SpaceObject{
	
	double angle;
	
	//new space object with radius 10, and facing the 0 direction
	public Ship(double xPos, double yPos, double xVel, double yVel)
	{
		super(xPos, yPos, xVel, yVel, 10);
		angle = 0;
	}
	
	//increases the velocity as necessary but keeps the speed less than 10
	public void accelerate()
	{
		xVelocity += 0.1 * Math.sin(angle);
		yVelocity += 0.1 * Math.cos(angle);
		
		if(Math.sqrt(Math.pow(xVelocity, 2) + Math.pow(yVelocity, 2)) > 10)
		{
			xVelocity -= 0.1 * Math.sin(angle);
			yVelocity -= 0.1 * Math.cos(angle);
			
		}
	}
	
	//creates a new shot when called
	public Shot fire()
	{
		return new Shot(xPos, yPos, 3 * Math.sin(angle) + xVelocity, 3 * 
				Math.cos(angle) + yVelocity);
	}

	//returns the angle the ship is facing
	public double getAngle() 
	{
		return angle;
	}
	
	//increases the angle facing when called
	public void rotateLeft()
	{
		angle += 0.1;
	}
	
	//decreases the angle when called
	public void rotateRight()
	{
		angle -= 0.1;
	}
	
	

}
