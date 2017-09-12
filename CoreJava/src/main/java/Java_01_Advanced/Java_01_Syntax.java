package Java_01_Advanced;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Java Syntax Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Java_01_Syntax
{

    public static void main(String[] args)
    {
       // Scanner
       Scanner sc = new Scanner(System.in);
       //sc.nextLine(); reads a whole line

       // Formated printing
       String name = "Rex%n";
       System.out.printf("Name: %s", name);

       double someFloating = 41.23;
       System.out.printf("%nFloat: %f", someFloating);

       System.out.printf("%nFloat with 2 digit precision: ", someFloating);
       System.out.printf("%n"); // prints new line

       // BigDecimal
       BigDecimal bigF = new BigDecimal("0.33");
       BigDecimal bigD = new BigDecimal("1.67");
       BigDecimal sum = bigF.add(bigD);
       System.out.println(sum);

       // Object -> the base type of all other. It can hold any value.
       Object obj = 5;
       System.out.println("The value of obj is: " + obj);
       obj = "pesho";
       System.out.println("The value of obj is: " + obj);

       // Null values
       Integer i = 5;
       i = i + 1;
       System.out.println("Value of i is: " + i);
       i = null;
       System.out.println("The value of obj is: " + i);
       //i = i + 1; NullPointerException
       i = 123;
       System.out.println("The value of obj is: " + i);


       // Type conversion
       float someOtherfloat = 1.74f; // explicit conversion
       System.out.println("Float to explicitly convert: " + someOtherfloat);
       double someDouble = (double) someOtherfloat;// explicit
       System.out.println("Explicitly converted float to double: " + someDouble);
       byte dataLoss = (byte) 12345; // explicit
       System.out.println("Number 12345 explicitly converted to byte(data loss): " + dataLoss);
       double otherDouble = someOtherfloat; //implicit
       System.out.println("Implicitly converted float to double: " + otherDouble);

       // Conditional statements if-else
       int num1 = 5;
       int num2 = 6;
       if (num1 > num2)
       {
           System.out.println("Num1 is bigger and has value of: " + num1);
       }
       else
       {

       }

       if (num1 < num2)
       {
           System.out.println("Num2 is bigger and has value of: " + num2);
       }
       else if(num1 == num2)
       {
           System.out.println("Num1 is equal to Num2 and they have a value of: " + num1);
       }
       else
       {
           System.out.println("Num1 is bigger and has value of: " + num1);
       }


       // Conditional statements switch
       String dayOfWeek = "Friday";
       switch (dayOfWeek)
       {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("There is no such weekday: " + dayOfWeek);
                break;
       }

       // Loops - while
       int num3 = 1;
       while (num3 <= 10)
       {
           System.out.println("Current value of num3 is: " + num3);
           num3++;
       }

       // Loops - do-while -> executed atleast once
       int num4 = 1;
       do
       {
           System.out.println("Current value of num4 is: " + num4);
       } while(num4 < 1);

       // Loops - for
       for (int k = 1; k <= 10; k++)
       {
           System.out.println("Current value of k is: " + k);
       }

       // continue operator
       for (int j = 1; j <= 10; j++)
       {
           if (j % 2 != 0) // if its odd dont print it
           {
               continue;
           }
           System.out.println("Current value of j is: " + j);
       }

       // break operator -> exits loop
       int num5 = 1;
       while (num5 <= 10)
       {
           if (num5 == 5) // if num5 == 5 exit loop
           {
               break;
           }
           System.out.println("Current value of num5 is: " + num5);
           num5++;
       }

       // for-each loop
       String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                        "Staurday", "Sunday"
       };
       for (String day : days)
       {
           System.out.println("Current itarattion is working with day: " + day);
       }

    }

}



