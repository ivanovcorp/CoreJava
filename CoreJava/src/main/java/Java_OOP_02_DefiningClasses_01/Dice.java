package Java_OOP_02_DefiningClasses_01;

import java.util.Random;

public class Dice
{
    int sides;
    String types;

    public Dice(int sides, String types)
    {
    	this.setSides(sides);
    	this.setTypes(types);
    }
    
    public Dice(int sides)
    {
    	this(sides, null);
    }
    
    public int roll()
    {
        Random rnd = new Random();
        int rollResult = rnd.nextInt(100);
        
        return rollResult;
    }
    
    public void setTypes(String types) 
    {
		this.types = types;
	}
    
    public String getTypes() 
    {
		return types;
	}
    
    public void setSides(int sides) 
    {
		this.sides = sides;
	}
    
    public int getSides() 
    {
		return sides;
	}
}
