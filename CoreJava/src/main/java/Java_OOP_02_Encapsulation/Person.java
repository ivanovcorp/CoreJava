package Java_OOP_02_Encapsulation;

/**
 * Java Encapsulation Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Person 
{
	private String name;
	private int age;
	
	private static int DEFAULT_AGE = 18;
	
	public Person(String name, int age)
	{
		this.setName(name);
		this.setAge(age);
	}
	
	public Person(String name)
	{
		this(name, DEFAULT_AGE);// constructor chain
	}
	
	private void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	private void setAge(int age)
	{
		this.age = age;		
	}
	
	public int getAge()
	{
		return this.age;
	}
}
