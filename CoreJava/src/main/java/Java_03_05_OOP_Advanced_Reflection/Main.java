package Java_03_05_OOP_Advanced_Reflection;

/**
 * Java Generics Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Main 
{

	public static void main(String[] args) 
	{	
		/*
		 * What is Metaprogramming?
		 * 
		 * 
		 * Programming technique in which computer programs have the ability
		 * to treat programs as their data.
		 * 
		 * Programs can be designed to:
		 * 	- Read
		 *  - Generate
		 *  - Analyze
		 *  - Transform
		 * 
		 * Modify itself while running.
		 */
		
		/*
		 * What is Reflection?
		 * 
		 * 
		 * In Java, reflection is a form of metaprogramming since the program
		 * can examine information about itself.
		 * 
		 * Extensibility features
		 * 
		 * Class libraries and visual development enviornments 
		 * 
		 * Debuggers and test tools.
		 * 
		 * If it is possible to perform an operation without using reflection, 
		 * then it is preferable to avoid using it.
		 * 
		 * Performance Overhead
		 * 
		 * Security Restrictions
		 * 
		 * Exposure of internals
		 */
		
		/*
		 * The Class Object
		 * 
		 * 
		 * Obtain its java.lang.Class object
		 * 	- if you knowthe name
		 */
		Class myObject = MyObject.class;
		// - if you don't know the name at compile time
		try 
		{
			Class cls = Class.forName("MyObject");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		/*
		 * Obtain class name.
		 */
		// - fully qualified class name
		String className = myObject.getName();
		// - class name without the packaging name 
		String simpleClassName = myObject.getSimpleName();
		
		/*
		 * Base class and Interfaces
		 */
		// obtain base class
		Class className2 = myObject.getSuperclass();
		// obtain interfaces
		Class[] interfaces = myObject.getInterfaces();
		/*
		 *  Interfaces are also represented by Class objects in Java Reflection
		 *  Only the interfaces specifically declared implemented by a given class
		 *  is returned.
		 */
		
		
		/*
		 * Practical Problem
		 * 
		 * 
		 * Import Reflection.class 
		 * Using reflection print:
		 *  - This claas type
		 *  - Super class type
		 *  - All Interfaces
		 *  - Instantiate object using reflection and print it
		 * Dont change anything in class.
		 */
		System.out.println("Practical problem.");
		Class myClass = Reflection.class;
		System.out.println(myClass);
		System.out.println(myClass.getSuperclass());
		Class[] interfaces2 = myClass.getInterfaces();
		for (Class interfc : interfaces2)
		{
			System.out.println(interfc);
		}
		
		try 
		{
			Reflection rfclCl = (Reflection) myClass.newInstance();
			System.out.println(rfclCl);
		} 
		catch (InstantiationException | IllegalAccessException e) 
		{		
			e.printStackTrace();
		}
		
		// slide 13
	}

}
