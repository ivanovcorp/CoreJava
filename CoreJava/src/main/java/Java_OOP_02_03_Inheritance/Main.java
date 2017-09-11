package Java_OOP_02_03_Inheritance;

/**
 * Java Inheritance Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Main {

	public static void main(String[] args) 
	{
		/*
		 * Inheritance 
		 * 
		 * 
		 * Superclass - Parent class, Base class
		 * 	- The class giving its members to its child class
		 * Subclass - Child class, Derived Class
		 * 	- The class taking members from its base class
		 * 
		 * Inheritance leads to hierarchies of classes and/or interfaces
		 * in an application.
		 * 
		 * Object is at the root of Java Class Hierarchy
		 * 
		 * Java supports inheritance through "extends" keyword.
		 */
		System.out.println("Cars and Buses inherit Automobile.");
		Car c1 = new Car(218, "diesel");
		Car c2 = new Car("BMW", 500, "petrol");
		System.out.println("Car1: " + c1.getHorsePower() + " " + c1.getTypeOfFuel());
		System.out.println("Car2: " + c2.getManufacturer() + " " + c1.getHorsePower() + " " + c1.getTypeOfFuel());
		
		Bus b1 = new Bus("SETRA", 580);
		System.out.println("Bus1: " + b1.getManufacturer() + " " + b1.getHorsePower());
		
		
		/*
		 * In Java there is no multiple inheritance. 
		 * Only multiple interfaces can be implemented.
		 */
		
		/*
		 * Access To Base Class Members
		 * 
		 * Use the "super" keyword
		 * 
		 * 
		 * Derived classes can access all public and protected members.
		 * Derived classes can access default members if in same package.
		 * Private fields are NOT inherited in subclasses(can't be accessed).
		 * 
		 * Derived classes can hide superclass variables.
		 * Use "super" and "this" to specify member access.
		 * 
		 * 
		 * A child class can redefine existing methods(override)
		 */
		
		/*
		 * When to use Inheritance
		 * 
		 * 
		 * Classes share IS-A relationship
		 * 
		 * Derived class IS-A-SUBSTITUTE for the base class
		 * 
		 * Share the same role
		 * 
		 * Derived class is the same as the base class but adds
		 * a little bit more functionality.
		 */
	}

}
