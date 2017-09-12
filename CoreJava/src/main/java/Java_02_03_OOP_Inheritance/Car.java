package Java_02_03_OOP_Inheritance;

/**
 * Java Inheritance Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Car extends Automobile // inheritance 
{
	private String typeOfFuel;

	public Car(int horsePower, String typeOfFuel) 
	{
		//super(horsePower);		
		this(null, horsePower, typeOfFuel);
	}
	
	public Car(String manufacturer, int horsePower, String typeOfFuel)
	{
		super(manufacturer, horsePower);
		this.setTypeOfFuel(typeOfFuel);
	}
	
	private void setTypeOfFuel(String typeOfFuel)
	{
		// validation...
		this.typeOfFuel = typeOfFuel;
	}
	
	public String getTypeOfFuel()
	{
		return this.typeOfFuel;
	}
	
}
