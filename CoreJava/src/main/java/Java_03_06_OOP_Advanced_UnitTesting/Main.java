package Java_03_06_OOP_Advanced_UnitTesting;

import junit.framework.Assert;

/**
 * Java Unit Testing Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Main
{
    public static void main(String[] args)
    {
        /*
         * Manual Testing
         *
         *
         * Not structured
         * Not repeatable
         * Can't cover all of the code
         * Not as easy to do as it should be
         * We need a structured approach that:
         *  - Allows refactoring
         *  - Reduces the cost of change
         *  - Decreases the number of defects in the code
         * Bonus
         *  - Improves design
         */

        /*
         * Automated Testing
         *
         *
         * System tests - the whole system
         * Integration tests - a single module
         * Unit tests - a single class
         */

        /*
         * JUnit
         *
         *
         * The first popular unit testing framework
         * Most popular for Java development
         *
         * Check BankAccountTests for example JUnit test.
         */


        /*
         * 3A pattern
         *
         *
         * Arrange - preconditions
         * Act - Test a SINGLE behavior
         * Assert - postconditions
         *
         * Sometimes throwing an exception is the expected behavior - check BankAccountTests
         */

        /*
         * Assertions
         *
         *
         * assertTrue() vs assertEquals()
         *
         * When using assertEquals -> better description when expecting value
         *
         *
         * Assertions can show messages
         *  - Helps with diagnostics
         *
         *
         * Avoid using magic numbers. Check BankAccountTests.
         */


        /*
         * Mocking
         *
         *
         * Mock objects simulate behavior of real objects.
         *  - supplies data exclusively for the test - e.g. network data, random
         *  data, big data(database), etc.
         *
         *
         *  Mockito
         *
         *  Framework for mocking objects.
         */
    }

}



