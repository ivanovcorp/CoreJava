package Java_OOP_02_Encapsulation;

/**
 * Java Encapsulation Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Main 
{

	public static void main(String[] args) 
	{
		/*
		 * Encapsulation
		 * 
		 * 
		 * Process of wrapping code and data togeather into a single
		 * unit.
		 * Object fields must be not accessable.
		 * Use getters and setters for data access.
		 */
		Person ivan = new Person("Ivan", 25);
		Person geri = new Person("Gergana");		
		System.out.println("Using Encapsulation, create 2 persons and print their "
				+ "name and age.");
		System.out.println();
		System.out.println("Person 1: " + ivan.getName() + " " + ivan.getAge());
		System.out.println("Person 2: " + geri.getName() + " " + geri.getAge());
		
		/*
		 * Keyword "this"
		 * 
		 * 
		 * "this" is a reference to the current object
		 * "this" can refer current class instance variable
		 * "this" can invoke current class method
		 * "this" can invoke current class constructor
		 * "this" can be pass like argument in method or constructor call
		 * "this" can be returned from method
		 * 
		 * Check Person class for examples.
		 */
		
		
		/*
		 * Access modifiers
		 * 
		 * 
		 * Private Access Modifier
		 * 	- Main way that an object encapsulates itself and hides data from outside world.
		 * 	- Class and interfaces CANNOT be private
		 * 	- Can only be accessed within the declared class itself
		 * 
		 * Protected Access Modifier
		 * 	- Can be accessed only by the subclasses in other package.
		 *  - Protected CANNOT be applied to class and interfaces.
		 *  - Preventing a nonrelated class from trying to use it
		 *
		 * Default Access Modifier
		 *  - Do not explicitly declare an access modifier
		 *  - Available to any other class in the same package
		 *  
		 * Public Access Modifier 
		 *  - A Class, method, constructor declared inside a public class can be accessed form any class belonging to
		 *  the Java Universe
		 *  - Imports are needed if we try to access public class in different package.
		 *  - The main() method of an application has to be public.
		 */
		
		
		
		/*
		 * Data Validation
		 */
		System.out.println();
		Employee e1 = new Employee("Pesho", 872.23);
		System.out.println("Employee1: " + e1.getName() + " " + e1.getSalary());
		Employee e2 = new Employee("Gosho", 72.23);
		//System.out.println("Employee2: " + e2.getName() + " " + e2.getSalary()); // Throws exception from validation.
		// 24 slide.
	}

}
