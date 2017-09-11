package Java_Advanced_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Java Stream API Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Java_08_StreamAPI 
{
	public static void main(String[] args) 
	{	
		/*
		 * The Stream APi 
		 * 
		 * 
		 * Querying a collection in a functional way
		 * Methods are chained together 
		 * 
		 * Stream is not a collection and don't store any data
		 * Stream iterates over a collection
		 * Does not modify data it processes
		 */
		
		/* 
		 * Practical problem
		 * 
		 * By given sequence of integers
		 * Find all unique elements ,such that 10 <= n <= 20
		 * Print only the firs 2 elements
		 */
		
		System.out.println("Solve the problem by functional and non-functional methods.");
		// non-functional way
		System.out.println("Non-functional.");
		int[] givenNums = {15, 2, 15, 14};
		LinkedHashSet<Integer> nums = new LinkedHashSet<>();		
		for (int num : givenNums)
		{
			if (nums.size() >= 2) 
				break;
			
			if (10 <= num && num <= 20)
				nums.add(num);
		}
		for (int num : nums)
		{
			System.out.println("Num: " + num);
		}
		
		// functional way
		System.out.println();
		System.out.println();
		System.out.println("Functional.");
		System.out.println();
		for (int num : givenNums)
		{
			nums.add(num);
		}
		nums.stream()
			.filter(x -> 10 <= x && x <= 20)
			.distinct()
			.limit(2)
			.forEach(n -> System.out.println("Num: " + n));
		
		/*
		 * Stream<T> Class
		 * 
		 * Gives access to Stream API funcions.
		 * Get an instance through:
		 * 	- A Collection
		 *  - An Array
		 *  - A Hash Map Collection
		 */
		// Collection
		List<Integer> list = new ArrayList<>();
		Stream<Integer> stream = list.stream();
		
		// Array
		String[] array = new String[10];
		Stream<String> stream2 = Arrays.stream(array);
		
		// HashMap 
		HashMap<String, String> map = new HashMap<>();
		Stream<HashMap.Entry<String, String>> entries = map.entrySet().stream();
		Stream<String> keys = map.keySet().stream();
		Stream<String> values = map.values().stream();
		
		/*
		 * Practical problem
		 * 
		 * By a sequence of strings
		 * Map each to upper case and print them
		 * Use the Stream API
		 */
		System.out.println();
		String[] inputNames = {"Pesho", "Gosho", "Ivan"};
		Arrays.stream(inputNames)
			.map(s -> s.toUpperCase())
			.forEach(s -> System.out.println(s));
		
		System.out.println();
		System.out.println();
		System.out.println("OPERATIONS");
		System.out.println();
		
		/*
		 * Map
		 * 
		 * Transforms the objects in the stream
		 */
		Stream<String> strStream = Stream.of("1", "2", "3");
		Stream<Integer> numStream = strStream.map(Integer::valueOf);
		
		/* 
		 * Filter
		 * 
		 * Filters objects by a given predicate
		 */
		Stream<String> strStream1 = Stream.of("one", "two", "three")
				.filter(s -> s.length() > 3);
		
		/*
		 * Reduce
		 * 
		 * Check for a given condition
		 * 	- any element matches
		 *  - all element match
		 *  - none element match
		 */
		Stream<Integer> numStream1 = Stream.of(1, 4, 8, 7, 13, 22, 25);
		Stream<Integer> numStream2 = Stream.of(1, 4, 8, 7, 13, 22, 25);
		Stream<Integer> numStream3 = Stream.of(1, 4, 8, 7, 13, 22, 25);
		boolean any = numStream1.anyMatch(x -> x % 2 == 0); // any
		
		boolean all = numStream2.allMatch(x -> x % 2 == 0); // all
		
		boolean none = numStream3.noneMatch(x -> x % 2 == 0); // none
		
		/*
		 * Find reductions
		 * 
		 * find an element
		 * 	- gets the first element of the stream
		 *  - gets any element
		 * 
		 */
		Optional<Integer> first = nums.stream().findFirst(); // first
		
		Optional<Integer> any1 = nums.stream().findAny(); // any
		
		/* 
		 * Sorting
		 * 
		 * sort by passing a comperator as lambda
		 */
		System.out.println("Sorting nums.");
		List<Integer> someNums = new ArrayList<>();
		Collections.addAll(someNums, 7, 6, 3, 4, 5);
		someNums.stream().sorted((x1, x2) -> Integer.compare(x1, x2)).forEach(System.out::println);
		
		//44 slide
	}
}
