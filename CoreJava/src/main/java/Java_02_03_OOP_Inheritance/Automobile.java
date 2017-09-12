package Java_02_03_OOP_Inheritance;

/**
 * Java Inheritance Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Automobile 
{
	private String manufacturer;
	private int horsePower;
	
	public Automobile(String manufacturer, int horsePower)
	{
		this.setManufacturer(manufacturer);
		this.setHorsePower(horsePower);
	}
	
	public Automobile(int horsePower)
	{
		this(null, horsePower);
	}
	
	private void setManufacturer(String manufacturer)
	{
		// validation...
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer()
	{
		return this.manufacturer;
	}
	
	private void setHorsePower(int horsePower)
	{
		// validation...
		this.horsePower = horsePower;
	}
	
	public int getHorsePower()
	{
		return this.horsePower;
	}
}
