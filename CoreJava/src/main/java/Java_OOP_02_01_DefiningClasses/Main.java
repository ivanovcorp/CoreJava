package Java_OOP_02_01_DefiningClasses;

/**
 * Java Defining Classes Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Main
{

    public static void main(String[] args)
    {
        /*
         * Abstract Data Type
         *
         * Data type whose representation is hidden from the client
         * You don't need to know the implementation to use an ADT
         */

        /*
         * Defining simple classes
         *
         * class is a concrete implementation of an ADT
         * classes provide structure for describing and creating objects
         */
        Dice dice1 = new Dice(1, "Dice1");

        /*
         * Class members
         *
         * Class is made up of state and behavior
         *  - fields store state
         *  - methods describe behavior
         */
        dice1.sides = 6;
        dice1.types = "dice";
        
        int sides = dice1.sides; // field(state)
        String types = dice1.types; // field(state)

        //dice1.roll(); // method(behavior)

        /*
         * A class can have many instances(objects)
         */
        Dice dice2 = new Dice(4, "Dice2");
        Dice dice3 = new Dice(5, "Dice3");

        /*
         * Object reference
         *
         * Declaring a variable creates a reference in the stack
         * "new" keyword allocates memory on the heap.
         */
        dice1 = new Dice(10, "Dice1");

        /*
         * Classes vs. Objects
         *
         * Classes provide structure for describing and creating objects
         * An object is a single instance of a class.
         */

        /*
         * Fields have type and name
         */


        /*
         * Practical Problem
         *
         * Create a class BankAccount
         */
        BankAccount acc = new BankAccount();
        acc.id = 1;
        acc.balance = 15;

        System.out.printf("Account ID %d, balance %.2f%n", acc.id, acc.balance);
        
        /*
         * Modifiers
         * 
         * 
         * Classes and class members have modifiers
         * Modifiers define visibility 
         * 
         */

        /*
         * Methods
         * 
         * 
         * Store executable code(algorithm) that manipulate state
         */
        System.out.println("Result of the roll is: " + dice1.roll());
        
        /*
         * Getters and Setters
         * 
         * 
         * Used to create accessors and mutators(getters and setters)
         */
        dice1.setSides(10);
        System.out.println("Getter for sides: " + dice1.getSides());
        dice1.setTypes("Dice Dice");
        System.out.println("Getter for types: " + dice1.getTypes());
        
        /*
         * Constructors
         * 
         * 
         * Special methods, executed during object creation
         * Constructors set object's initial state.
         * You can have multiple constructors in the same class
         */
        Dice dice5 = new Dice(17, "Dice6");
        Dice deice6 = new Dice(4);
        
        
        /*
         * Static members 
         * 
         * 
         * They are shared class-wide
         * Access static members through the class name.
         * You don't need an instance.
         */
        System.out.println("Currently created dices count: " + Dice.getCountOfCreatedDices());
        
        
    }

}



