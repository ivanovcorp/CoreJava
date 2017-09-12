package Java_03_01_OOP_Advanced_InterfacesAndAbstraction;

/**
 * Java Interfaces and Abstraction Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Document implements Printable
{

    @Override
    public void print()
    {
        System.out.println("Printing document.");
    }

}