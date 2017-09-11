package Java_Advanced_01;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Java Functional Programming Practical Examples
 *
 * @author Ivan Ivanov(cryptex)
 */
public class Java_07_FunctionalProgramming 
{
	public static void main(String[] args) 
	{	
		/*
		 * Lambda Expressions
		 * 
		 * A lambda expression is an unnamed function with parameters and a body
		 * 
		 * Lambda syntax: (parameter) -> {body}
		 * Use the lambda operator "->"
		 * 	- Read as "goes to"
		 * Parameters can be enclosed in parentheses ()
		 * The body holds the expression or statement and can be enclosed in braces {}
		 */
		
		// Implicit lambda expression: msg -> System.out.println(msg);
		// Explicit lambda expression: (String msg) -> { System.out.println(msg); }
		// Zero parameters: () -> { System.out.println("hi"); }
		// More parameters: (int x, int y) -> { return x + y; }
		
		/*
		 * Practical problem
		 * 
		 * - Read integers from a string
		 * - Print odd numbers
		 * - Print sorted odd numbers
		 * - Use 2 lambdas
		 */
		String numbers = "4, 2, 1, 3, 5, 7, 1, 4, 2, 12";
		String[] splitNumbers = numbers.split(", ");
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 0; i < splitNumbers.length; i++) 
		{
			nums.add(Integer.parseInt(splitNumbers[i]));
		}
		
		StringBuilder sb = new StringBuilder();
		nums.removeIf(num -> num % 2 == 0);
		for (Integer num : nums)
		{
			sb.append(num);
			sb.append(", ");
		}
		sb.delete(sb.length() - 2, sb.length());
		System.out.println(sb.toString());
		nums.sort((a, b) -> a.compareTo(b));
		sb = new StringBuilder();
		for (Integer num : nums)
		{
			sb.append(num);
			sb.append(", ");
		}
		sb.delete(sb.length() - 2, sb.length());
		System.out.println(sb.toString());
		
		/*
		 * Functions 
		 * 
		 * Input and output can be different type.
		 * Input and output type must be from type which we declare them.
		 * 
		 * In Java Function<T, R> is a interface that accepts a parameter of type T and 
		 * returns type R.
		 * 
		 * We use Function with functionName.apply()
		 */
		System.out.println();
		System.out.println();
		System.out.println("FUNCTIONS, CONSUMERS, PREDICATES, SUPPLIERS, UNARYOPERATOR and BIFunct");
		System.out.println();
		
		Function<Integer, String> myFunc = n -> n.toString();
		System.out.println("Calling function to convert int 5 to string: " + myFunc.apply(5));
		
		System.out.println();
		Function<Integer, Integer> increment = n -> n +1;
		System.out.println("Using increment function with 5, result should be 6: " + increment.apply(5));
		
		System.out.println();
		/*
		 * Consumer<T>
		 * 
		 * In Java Consumer<T> is a void interface
		 */
		Consumer<String> print = message -> System.out.println(message);
		System.out.println("Calling consumer to print message 'This is a consumer test");
		print.accept("This is a consumer test.");
		
		System.out.println();
		/*
		 * Supplier<T>
		 * 
		 * In Java Consumer<T> takes no parameters.
		 */
		Supplier<Integer> genRandomNumber = () -> new Random().nextInt(51);
		System.out.println("Calling supplier to generate random number: " + genRandomNumber.get());
		
		System.out.println();
		/*
		 * Predicate<T>
		 * 
		 * In Java Predicate<T> evaluates a condition.
		 */
		Predicate<Integer> isEven = number -> number % 2 == 0;
		System.out.println("Calling predicate to check if given number"
				+ "(5 in our case) is even: " + isEven.test(5));
		
		System.out.println();
		/*
		 * UnaryOperator<T>
		 * 
		 * In Java UnaryOperator<T> is a function with same type of input/output
		 */
		UnaryOperator<String> toUpper = (x) -> x.toUpperCase();
		System.out.println("Calling UnaryOperator to transfor letter 'a' to upper case: " + toUpper.apply("a"));				
		
		
		System.out.println();
		/*
		 * BiFunction<T, U, R>
		 */
		BiFunction<Integer, Integer, String> sum = (x, y) -> "The sum of " + x + " and " + y + " is " + (x + y);
		System.out.println("Calling BiFunction to sum 2 numbers(5 and 7): " + sum.apply(5, 7));				
		
		System.out.println();
		/*
		 * BiConsumer<T, U>
		 */
		BiConsumer<String, String> printFullName = (fname, lname) -> System.out.printf("Hello, %s %s%n", fname, lname);
		System.out.print("Calling BiConsumer to print person's first and last name: ");
		printFullName.accept("Ivan", "Ivanov");				
		
		System.out.println();
		/*
		 * BiPredicate<T, U>
		 */
		BiPredicate<Integer, Integer> testEquality = (x, y) -> x == y;
		System.out.println("Calling BiPredicate to test if x == y (5 and 5): " + testEquality.test(5, 5));;
		
		/*
		 * Special functions
		 */
		System.out.println();
		System.out.println();
		System.out.println("SPECIAL FUNCTIONS");
		System.out.println();
			
		/*
		 * IntFunction<R>
		 */
		IntFunction<String> intToString = (x) -> Integer.toString(x);
		System.out.println("Calling IntFunction to convert x(5) to string: " + intToString.apply(5));
		
		/*
		 * IntToDoubleFunction<R>
		 */
		IntToDoubleFunction intToDoubleFunct = (x) -> { return Math.sin(x); };
		System.out.println("Calling IntToDoubleFunction to calculate sin of 2: " + intToDoubleFunct.applyAsDouble(2));
	}

}
