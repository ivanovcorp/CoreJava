package Java_03_01_OOP_Advanced_InterfacesAndAbstraction;

/**
 * Java Interfaces and Abstraction Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Main
{
    public static void main(String[] args)
    {
        /*
         * Abstraction
         *
         *
         * Abstraction means ignoring irrelevant features, properties, or functions
         * and emphasizing the relevant ones to the project we develop.
         * Abstraction helps managing complexity.
         * Abstraction lets you focus on what the object does instead of how it does it.
         *
         * There are two ways to achieve abstraction in Java
         *  - Interfaces(100% abstraction)
         *  - Abstract class(0% - 100% abstraction)
         */

        /*
         * Relationshipt between classes and interfaces
         *
         * - class extends class
         * - class implements interface
         * - inteface extends interface
         *
         * Multiple inheritance
         * - class implements interface, interface
         * - interface extends interace, interface
         */
        Printable doc = new Document(); // Polymorphism
        doc.print();


        /*
         * Extend interface
         *
         *
         * Interface can extend another interface
         * Class which implements child interface MUST provide
         * implementation for parent interface too
         */

        /*
         * Default Method
         *
         *
         * Since Java 8, we can have method body in interface, check Printable interface
         * If you need to Override default method think about your Design
         */

        /*
         * Static Method
         *
         *
         * Since Java 8, we can have static method in interface.
         */

        /*
         * Interface vs Abstract Class
         *
         *
         * Abstract class                       Interface
         * - Abstract class doesn't             - Interface supports multiple inheritance
         * support multiple inheritance.        - Interface can have only abstract methods,
         * - Abstract class can have            Since Java 8, it can have default and static
         * abstract and non-abstract            methods also
         * methods.                             - Interface has only static and final
         * - Abstract class can have final,     variables.
         * non-final, static and non-static
         * variables.
         */
    }
}



