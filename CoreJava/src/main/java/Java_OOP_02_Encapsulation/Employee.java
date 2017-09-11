package Java_OOP_02_Encapsulation;

/**
 * Java Encapsulation Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Employee 
{	
	private String name;
	private double salary;
	
	public Employee(String name, double salary)
	{
		this.setName(name);
		this.setSalary(salary);
	}
	
	private void setName(String name)
	{
		if (name.contentEquals("") || name.length() < 3)
		{
			throw new IllegalArgumentException("Please enter a valid name.");
		}
		this.name = name;		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	private void setSalary(double salary)
	{
		if (salary < 450)
		{
			throw new IllegalArgumentException("Salary can not be less than 450!");
		}
		this.salary = salary;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
}
