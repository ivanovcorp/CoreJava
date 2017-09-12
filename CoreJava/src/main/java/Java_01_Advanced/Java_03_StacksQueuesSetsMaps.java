package Java_01_Advanced;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Java Fundamental Data Structures Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Java_03_StacksQueuesSetsMaps
{
	public static void main(String[] args)
	{
		System.out.println("STACKS");
		System.out.println();
		// stacks -> first in, last out
		ArrayDeque<Integer> stack = new ArrayDeque<>();

		stack.push(2); // .push -> adds element to the stack.
		System.out.println("Added number 2"
				+ " to the stack and now peek: "
				+ stack.peek()); // .peek -> look at the last added element
		stack.push(5);
		System.out.println("Added number 5 to the stack "
				+ "and now peeK: " + stack.peek());
		int removed = stack.pop(); // .pop -> removes last added element
		System.out.println("Removed number 5 and peek now: " + stack.peek());

		System.out.println("Size of the stack is: " + stack.size());
		System.out.println("Is the stack empty: " + stack.isEmpty());
		System.out.println("Does stack contains number 2: " + stack.contains(2));

		System.out.println();
		System.out.println();
		System.out.println("QUEUES");
		System.out.println();
		// Queues -> first in, first out
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		queue.add(5); // throws exception if queue is full
		queue.offer(10); // returns false if queue is full
		System.out.println("First element in the queue is: " + queue.peek());

		int num1 = queue.remove(); // throws exception if queue is full
		int num2 = queue.poll(); // returns null if queue is empty


		System.out.println();
		System.out.println();
		System.out.println("SETS");
		System.out.println();
		// sets keep unique elements
		HashSet<String> uniqueNames = new HashSet<>();

		System.out.println("Current HashSet size is: " + uniqueNames.size());
		System.out.println("Is the HashSet empty: " + uniqueNames.isEmpty());

		System.out.println();
		System.out.println("Most used Sets are: HashSet, LinkedHashSet and TreeSet.");

		uniqueNames.add("Ivan");
		uniqueNames.add("Pesho");
		uniqueNames.add("Gosho");
		uniqueNames.add("Ivan");

		System.out.println();
		System.out.println("Print all unique names using HashSet."
				+ "Names were added in order: Ivan, Pesho, Gosho and Ivan");
		for (String name : uniqueNames)
		{
			System.out.println("Name: " + name);
		}

		System.out.println();

		LinkedHashSet<String> uniqueNames1 = new LinkedHashSet<>();
		uniqueNames1.add("Ivan");
		uniqueNames1.add("Pesho");
		uniqueNames1.add("Gosho");
		uniqueNames1.add("Ivan");

		System.out.println("Print all unique names using LinkedHashSet."
				+ "Names were added in order: Ivan, Pesho, Gosho and Ivan");
		for (String name : uniqueNames1)
		{
			System.out.println("Name: " + name);
		}

		System.out.println();

		TreeSet<String> uniqueNames2 = new TreeSet<>();
		uniqueNames2.add("Ivan");
		uniqueNames2.add("Pesho");
		uniqueNames2.add("Gosho");
		uniqueNames2.add("Ivan");

		System.out.println("Print all unique names using TreeSet."
				+ "Names were added in order: Ivan, Pesho, Gosho and Ivan");
		for (String name : uniqueNames2)
		{
			System.out.println("Name: " + name);
		}

		System.out.println();
		System.out.println();
		System.out.println("MAPS");
		System.out.println();
		// Also known as associative arrays. Holds a set of <key, value>

		HashMap<String, String> phoneBook = new HashMap<>();
		phoneBook.put("Ivan", "0894011468");
		phoneBook.put("Pesho", "0893441144");
		phoneBook.put("Gosho", "0898112233");
		phoneBook.put("Ivan", "0894011468");

		System.out.printf("Print all names and phones using HashMap. "
				+ "%nRecords were added as follows: {Ivan -> 0894011468},"
				+ "{Pesho -> 0893441144}, "
				+ "{Gosho -> 0898112233} and "
				+ "{Ivan -> 0894011468}%n");
		for (String key : phoneBook.keySet())
		{
			System.out.printf("Current record: %s -> %s%n", key, phoneBook.get(key));
		}

		System.out.println();

		TreeMap<String, String> phoneBook1 = new TreeMap<>();
		phoneBook1.put("Ivan", "0894011468");
		phoneBook1.put("Pesho", "0893441144");
		phoneBook1.put("Gosho", "0898112233");
		phoneBook1.put("Ivan", "0894011468");

		System.out.printf("Print all names and phones using TreeMap. "
				+ "%nRecords were added as follows: {Ivan -> 0894011468},"
				+ "{Pesho -> 0893441144}, "
				+ "{Gosho -> 0898112233} and "
				+ "{Ivan -> 0894011468}%n");
		for (String key : phoneBook1.keySet())
		{
			System.out.printf("Current record: %s -> %s%n", key, phoneBook1.get(key));
		}

		System.out.println();

		LinkedHashMap<String, String> phoneBook2 = new LinkedHashMap<>();
		phoneBook2.put("Ivan", "0894011468");
		phoneBook2.put("Pesho", "0893441144");
		phoneBook2.put("Gosho", "0898112233");
		phoneBook2.put("Ivan", "0894011468");

		System.out.printf("Print all names and phones using LinkedHashMap. "
				+ "%nRecords were added as follows: {Ivan -> 0894011468},"
				+ "{Pesho -> 0893441144}, "
				+ "{Gosho -> 0898112233} and "
				+ "{Ivan -> 0894011468}%n");
		for (String key : phoneBook2.keySet())
		{
			System.out.printf("Current record: %s -> %s%n", key, phoneBook2.get(key));
		}

		// some of the most used methods are
		System.out.println("The size of the map phoneBook2 is: " + uniqueNames2.size());
		phoneBook2.keySet(); // returns set of the unique keys
		phoneBook2.values(); // returns all values
		phoneBook2.put("Geri", "0887871322"); // adds a record
		phoneBook2.remove("Ivan"); // removes a record by key
		System.out.println("Does the map contain Ivan? -> " + phoneBook2.containsKey("Ivan"));
		System.out.println("Does the map contain 0894011468? -> " + phoneBook2.containsValue("0894011468"));
		phoneBook2.clear(); // removes everything from the map. Map is empty.


	}
}
