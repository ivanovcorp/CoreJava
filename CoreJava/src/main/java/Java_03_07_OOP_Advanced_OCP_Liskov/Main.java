package Java_03_07_OOP_Advanced_OCP_Liskov;

/**
 * Java Open-Closed and Liskov Principles Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Main
{
    public static void maint(String[] args)
    {
        /*
         * What is OCP
         *
         * Software entities like classes, modules and functions should be open for
         * extension but closed for modifications.
         */

        /*
         * Extensibility
         *
         * - Implementation takes future growth into consideration
         * - Extensible system is one whose internal structure and data flow
         * are minimally or not affected by new or modified functionality.
         */

        /*
         * Reusability
         *
         * - Software reusability more specifically refers to design features
         * of a software element that enhance its suitability for reuse
         * - Modularity
         * - Low coupling
         * - High cohesion
         */


        /*
         * OCP
         *
         *
         * Design and writing of the code should be done in a way that
         * new functionality should be added with minimum changes in
         * the existing code.
         *
         * Changes to source code are not required.
         */


        /*
         * OCP Violations
         *
         *
         * Cascading changes through modules
         * Each change requires re-testing
         * Logic depends on conditional statements
         */

        /*
         * OCP Solutions
         *
         *
         * Inheritance / Abstraction
         * Inheritance / Template Method pattern
         * Composition / Strategy patterns
         */

        /*
         * Liskov Substitution Principle
         *
         *
         * Derived types must be completely substitutable for their base types
         *
         *
         * LSP
         *
         *
         *  Reference to the base class can be replaced with a derived class without
         *  affecting the functionality of the program module.
         *
         *  Derived classes just extend without replacing the functionality of old classes.
         */

        /*
         * - OOP Inheritance
         *      Student IS-A Person
         * - Plus LSP
         *      Student IS-SUBSTITUTED-FOR Person
         *
         *
         * LSP is just an extension of the OCP and it means that we must make sure
         * that new derived classes are extending the base classes without changing
         * their behavior.
         */

        /*
         * LSP - Violations
         *
         *
         * Type checking
         * Overriden methods say "I am not implemented"
         * Base class depends on its subtypes
         */
    }
}



