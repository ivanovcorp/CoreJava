package Java_Advanced_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Java Files and Streams Practical Examples
 *
 * @author Ivan Ivanov(cryptex)
 */
public class Java_04_Files_And_Streams
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("STREAMS");
		System.out.println();
		/*
		 * Streams are used to transfer data.
		 *
		 * We open a stream to:
		 * 	- read a file
		 * 	- write to a file
		 *
		 * Streams are unidirectional.
		 *
		 * There are two main types:
		 * 	- Input Stram -> reading
		 *  - Output Stream -> writing
		 */

		String path = "resources/filesToRead/test.txt";

		FileInputStream fileStream = null;
		try {
			fileStream = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int oneByte = 0;
		try {
			oneByte = fileStream.read();
			System.out.println("Here is the read one byte: " + oneByte);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// read the whole file
		while (oneByte >= 0)
		{
			System.out.println("Current byte: " + oneByte);
			oneByte = fileStream.read();
		}

		// Always close streams. To close a stram use try/catch/finally

		System.out.println();
		// Using try-with-resources
		try (InputStream in = new FileInputStream(path))
		{
			String result = "";
			int oneByte1 = in.read();
			while (oneByte1 >= 0)
			{
				result += oneByte1;
				oneByte1 = in.read();
			}
			System.out.println("The result of reading with try-with-resources is: "
					+ result);
		}
		catch (IOException ioexcp)
		{
			ioexcp.printStackTrace();
		}

		// Read from file and write to another.
		System.out.println();


		/*
		 * Read content of file.
		 * Write it to another file without punctuation characters.
		 */
		String inputPath = "resources/filesToRead/input.txt";
		String outputPath = "resources/filesToWrite/output.txt";

		ArrayList<Character> symbols = new ArrayList<>();
		Collections.addAll(symbols, '.', ',', '!', '?');

		try (InputStream in = new FileInputStream(inputPath);
				OutputStream out = new FileOutputStream(outputPath))
		{
			int oneByte2 = 0;
			while ((oneByte2 = in.read()) >= 0)
			{
				if (!symbols.contains((char)oneByte2))
				{
					out.write(oneByte2);
				}
			}
		}

		System.out.println();

		/*
		 * Read content of a file. Get all numbers which are not part of a word.
		 * Print them on the console.
		 */
		String inputPath2 = "resources/filesToRead/input2.txt";
		String outputPath2 = "resources/filesToWrite/output2.txt";
		Scanner scanner = new Scanner(new FileInputStream(inputPath2));

		PrintWriter out = new PrintWriter(new FileWriter(outputPath2));

		while (scanner.hasNext())
		{
			if (scanner.hasNextInt())
			{
				out.println(scanner.nextInt());
			}
			scanner.next();
		}


		System.out.println();
		/*
		 * Buffered streams.
		 *
		 * Reading information in chunks.
		 * Significantly boost performance.
		 */
		String inputPath3 = "resources/filesToRead/input3.txt";
		String outputPath3 = "resources/filesToWrite/output3.txt";

		try (BufferedReader in = new BufferedReader(new FileReader(inputPath3));
				PrintWriter out2 = new PrintWriter(new FileWriter(outputPath3)))
		{
			int counter = 1;
			String line = in.readLine();
			while (line != null)
			{
				if (counter % 3 == 0)
				{
					out.println(line);
				}
				counter++;
				line = in.readLine();
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("FILES AND PATHS");
		System.out.println();

		/*
		 * Path class represents the file system paths.
		 */

		/*
		 * Files provides static methods for creating streams.
		 * Provides utility methods for easy file manipulation.
		 */

		/*
		 * File class in Java provides methods for quick and easy manipulation of files.
		 */
		File file = new File("resources/filesToRead/test.txt");
		System.out.println("Does test.txt exist -> " + file.exists());
		System.out.println("The length of test.txt is -> " + file.length());
		System.out.println("Is test.txt directory -> " + file.isDirectory());
		File file1 = new File("resources/filesToRead");
		System.out.println("Is resources/filesToRead directory -> " + file1.isDirectory());

	}
}
