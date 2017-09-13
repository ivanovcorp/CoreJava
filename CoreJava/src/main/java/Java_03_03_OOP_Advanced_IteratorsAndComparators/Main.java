package Java_03_03_OOP_Advanced_IteratorsAndComparators;

import java.util.ArrayList;
import java.util.List;

/**
 * Java Iterators and Comparators Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Main
{
    public static void main(String[] args)
    {
        /*
         * Variable Arguments(varargs)
         *
         * Allow the method to accept zero or multiple arguments
         */
        System.out.println("Printing names using method with varargs");
        printNames("Ivan");
        printNames("Peter", "Gergana", "Polina");

        /*
         * Variable Arguments Rules
         *
         *
         * There can be only one variable argument in the method.
         * Variable argument must be the last argument.
         */
        System.out.println();
        System.out.println("Varargs and another variable");
        printNameAndIDForCoruse(1123, "Ivan", "Geri");

        /*
         * Iterable<T>
         *
         *
         * Root interface of the Java collection classes.
         * A class that implements the Iterable<T> can be used with the new for-loop.
         */

        /*
         * Iterator<T>
         *
         *
         * Enables you to cycle through a collection.
         * Don't implement both Iterable<T> and Iterator<T>
         */

        // Library Practical Exampl
        System.out.println();
        System.out.println("Library Practical Example.");
        System.out.println();
        Book b1 = new Book("Abc", 1992, "Ivan Ivanov");
        Book b2 = new Book("BcDeF", 2017, "Gosho ot Pochivka");
        Book b3 = new Book("BMW", 2005, "BMW AG", "Top Gear");
        Book b4 = new Book("Apple Inside", 1985, "Ian O'reily", "Steve Jobs");
        Book b5 = new Book("Game of Thrones", 2001, "George R.R. Martin");

        Library<Book> lib = new Library<Book>(b1, b2, b3, b4, b5);
        lib.forEach(book -> System.out.println("Book with title: " + book.getTitle()));

        /*
         * Comparable<T> vs Comparator<T>
         *
         *
         * Comparator provides a way for you to provide custom comparison
         * logic for types that you have no control over.
         *  - multiple sorting sequence
         *  - doesn't affect the original class
         *  - compare() method
         *
         * Comparable allows you to specify how objects taht you are implementing get
         * compared.
         *  - single sorting sequence
         *  - affects the original class
         *  - compareTo() method
         */


        /*
         * Comparable<E>
         *
         * Allows you to specify how objects that you are implementing get compared.
         */
        System.out.println();
        System.out.println("Student Practical Example");
        System.out.println();
        Student st1 = new Student("Geri", 23);
        Student st2 = new Student("Pesho", 13);
        Student st3 = new Student("Asq", 43);
        Student st4 = new Student("Nikol", 33);
        Student st5 = new Student("Greta", 28);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println(st1.compareTo(st2));
    }

    static void printNames(String...names)
    {
        for (String name : names)
        {
            System.out.println("Hello, " + name + "!");
        }
    }

    static void printNameAndIDForCoruse(int id, String...names)
    {
        for (String name : names)
        {
            System.out.println(name + " is from course with ID: " + id);
        }
    }

}



