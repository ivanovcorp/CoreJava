package Java_02_04_OOP_Polymorphism;

/**
 * Java Polymorphism Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Main {

	public static void main(String[] args)
	{
		/*
		 * Polymorphism
		 *
		 *
		 * Ability of an object to take on many forms.
		 *
		 * Example:
		 * public interface Animal{}
		 * public abstract class Mammal{}
		 * public class Person extends Mammal implements Animal{}
		 *
		 * Person IS-A Person
		 * Person IS-A Animal
		 * Person IS-A Mammal
		 * Person IS-A Object
		 */
	    Animal person = new Person("Human", "male"); // Animal is reference type. Person object type.
	    Mammal person1 = new Person("Human", 23, "female"); // Mammal is reference type. Person object type.
	    Person person2 = new Person("Human", "male");// Person is reference type. Person object type.
	    // Variables are saved in reference type
	    // We can use only reference methods
	    // If you need object method you need to cast it or override it.

	    person.sleep(10);
	    System.out.println(person1.getAge());
	    person2.feed();

	    /*
	     * Keyword "instanceof"
	     * Check if object is instance of specific class.
	     */
	    System.out.println();
	    System.out.println("Check if objects are instances of Person class.");
	    if (person instanceof Person)
	        System.out.println(((Person) person).getSex());
	    if (person.getClass() == Person.class)
	        System.out.println(((Person) person1).getSex());

	    /*
	     * Types of polymorphism
	     *
	     * Runtime polymorphism - also known as Dynamic Polymorphism
	     *  - Method overriding
	     *
	     * Compile time polymorphism - also known as Static Polymorphism
	     *  - Method overloading
	     *  - Argument lists could differ in:
	     *    - Number of parameters
	     *    - Data type of parameters
	     *    - Sequence of Data type of parameters
	     */
	    Mammal person3 = new Person("Bunny", "female"); // runtime polymorphism

	    int sum = sum(3, 6, 10);// compile time polymorphism
	    double sum2 = sum(3.1, 4.5, 10.5);// compile time polymorphism

	    /*
	     * Rules for overloading method
	     *
	     * - Overloading can take place in the same class or in its sub-class.
	     * - Constructor in Java can be overloaded
	     * - Overloaded methods must have a different argument list.
	     * - Overloaded method should always be the part of the same class(can also
	     * take place in sub class), with same name but different parameters.
	     * - They may have the same or different return types.
	     */

	    /*
	     * Rules for overriding a method
	     *
	     * - Overriding can take place in sub-class.
	     * - Argument list must be the same as that of the parent method
	     * - The overriding method must have same return type
	     * - Access modifier cannot be more restrictive
	     * - Private, static and final methods can NOT be overriden
	     * - The overriding method must not throw new or broader checked exceptions.
	     */

	    /*
	     * Abstract classes
	     *
	     * They can NOT be instantiated
	     * An abstract class may or may not include abstract methods.
	     * If it has at least one abstract method, it must be declared abstract.
	     * To use abstract class, you need to extend it.
	     *
	     * Abstract Classes Elements
	     * - Can have fields
	     * - Can have constructors
	     * - Can hold methods with code in them
	     * - Every abstract method MUST be overrided by it's childs
	     */
	}

	public static int sum(int a, int b, int c)
	{
	    return (a + b + c);
	}

	public static double sum(double a, double b, double c)
    {
        return (a + b + c);
    }
}
