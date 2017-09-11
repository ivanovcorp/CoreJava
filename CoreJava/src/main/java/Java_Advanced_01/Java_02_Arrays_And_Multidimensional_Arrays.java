package Java_Advanced_01;

import java.util.Arrays;

/**
 * Java Arrays and Multidimensional Arrays Practical Examples
 *
 * @author Ivan Ivanov(cryptex)
 */
public class Java_02_Arrays_And_Multidimensional_Arrays
{
    public static void main(String[] args)
    {
        // Arrays -> it is sequence of elements. All elements are same type. Has fixed size.
        int[] numbers = new int[10]; // creating array of 10 elements of type int.Empty.

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i + 1;
        }

        System.out.println("numbers[4] = " + numbers[4]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[9] = " + numbers[9]);

        System.out.println("Print all numbers with foreach.");
        for (int num : numbers)
        {
            System.out.println("Current iterattion is working with value: " + num + " of numbers array." );
        }

        // Multidimensional arrays
        int[][] multiNumbers = new int[3][4];
        for(int row = 0; row < multiNumbers.length; row++)
        {
            for (int col = 0; col < multiNumbers[0].length; col++)
            {
                multiNumbers[row][col] = row + col;
            }
        }

        // values must be equal to the sum of the indexes
        System.out.println("multiNumbers[2][3] = " + multiNumbers[2][3]);
        System.out.println("multiNumbers[1][2] = " + multiNumbers[1][2]);
        System.out.println("multiNumbers[0][1] = " + multiNumbers[0][1]);

        // jagged arrays
        int[][] jaggedNumbers = new int[3][];
        jaggedNumbers[0] = new int[4];
        jaggedNumbers[1] = new int[1];
        jaggedNumbers[2] = new int[3];

    }
}



