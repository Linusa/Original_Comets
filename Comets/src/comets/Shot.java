//Andrew Bertrand
//Assignment 3
//Shot class
// 3/15/10

package comets;

//class for all the shots
public class Shot extends SpaceObject{
	
	int age;
	
	//new space object with radius 3, and has just been created
	public Shot(double xPos, double yPos, double xVel, double yVel)
	{
		super(xPos, yPos, xVel, yVel, 3);
		age = 0;
	}
	
	//returns the ship's age
	public int getAge()
	{
		return age;
	}
	
	//moves the ship and increases its age
	public void move()
	{
		super.move();
		age++;
	}
	

}
