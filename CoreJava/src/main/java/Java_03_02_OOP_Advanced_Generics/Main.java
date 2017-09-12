package Java_03_02_OOP_Advanced_Generics;

import java.util.ArrayList;
import java.util.List;

import Java_02_04_OOP_Polymorphism.Person;

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
         * Generics
         *
         *
         * Generics are also known as Parameterized types or template types
         * Generics allow defining parameterized classes that process data of unknown(generic) type
         * The class instantiated(specialized) with different particular types.
         * Example: List<T> -> List<int> / List<String> / List<DateTime> / List<Student>
         * Commonly used for creation of different data structures.
         *
         * Allow processing data of unknown (generic) type
         * Generics allow container classes to be effectively decoupled from the concrete type they are storing.
         * This makes it possible to create a template class that works with every possible type.
         *
         * The inclusion of <> makes the code to be self documenting, showing what a
         * class is storing.
         *
         * Generics add compile time type safety, which means that the programmer is
         * protected from making some obvious mistakes like inserting incompatible type
         * in a collection. This is done compile time, which means that this process
         * is free in runtime.
         *
         * Generic classes are mostly used to create containers which can store
         * unspecified types.
         */
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(22.54));
        boxes.add(new Box(50));
        boxes.add(new Box("Sex"));
        boxes.add(new Box(new Person("Ivan", "male")));

        for (Box box : boxes)
        {
            System.out.println("Print box: " + box.toString());
        }

        /*
         * Generic Interfaces - add flexibility
         * Using a generified interfaces broaden the scope in which we can use them.
         *
         * Generi Methods
         * Can take generic input and return generic output.
         */

        /*
         * Generics in Java
         *
         * TYPE ERASURE - basically means that information about type parameters is lost during
         * runtime.
         * This causes some problems as not being able to use T for creation of objects,
         * arrays or checking if it is instance of some concrete type.
         * Most of those have a workaround which is not so straightforward.
         *
         * TYPE PARAMETER BOUNDS
         * Type parameter bounds are bounds on the type parameter which tells us its upper or lower bound.
         * Bounds are created using the "extends" keyword.
         */

        /*
         * Wildcards - allow covariance and contravariance
         */

    }

    public static <T> List<T> swapElementsAtGivenPosition(List<T> input, int position1, int position2) {
        T element = input.get(position1);
        T element2 = input.get(position2);
        List<T> result = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            if (i == position1) {
                result.add(i, element2);
            } else if (i == position2) {
                result.add(position2, element);
            } else {
                result.add(input.get(i));
            }
        }


        return result;
    }
}



