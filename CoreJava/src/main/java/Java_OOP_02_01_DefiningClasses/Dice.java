package Java_OOP_02_01_DefiningClasses;

import java.util.Random;

/**
 * Java Defining Classes Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Dice
{
	private static int dicesCreated = 0;
	
    int sides;
    String types;

    public Dice(int sides, String types)
    {
    	this.setSides(sides);
    	this.setTypes(types);
    	incrementDices();
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
    
    public static void incrementDices()
    {
    	dicesCreated++;
    }
    
    public static int getCountOfCreatedDices()
    {
    	return dicesCreated;
    }
}
