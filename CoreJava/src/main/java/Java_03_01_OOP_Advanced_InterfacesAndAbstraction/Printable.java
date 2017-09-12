package Java_03_01_OOP_Advanced_InterfacesAndAbstraction;

/**
 * Java Interfaces and Abstraction Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public interface Printable
{
    int MIN = 5;

    void print();

    default void msg()
    {
        System.out.println("Default method.");
    }

    static String typeOfInterface()
    {
        return "This is Printable interface";
    }
}