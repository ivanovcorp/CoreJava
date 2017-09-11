package Java_Advanced_01;

/**
 * Java String Processing Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Java_05_ManualStringProcessing
{
	public static void main(String[] args)
	{
	    /*
	     * Strings are represented by java.lang.String objects in Java.
	     */
	    String str = "This is a string";

	    /*
	     * String objects contain an immutable(read-only) sequence of
	     * characters.
	     *
	     * Before initialization, a String has null value.
	     */

	    /*
	     * String.format() provides a format language to which we
	     * add variables.
	     */
	    String str2 = String.format("One: %1$d Two: %2$d", 10, 20);
	    System.out.println("Formated string -> " + str2);

	    System.out.println();
	    String trimWhitespace = "     trimmed   ";
	    System.out.println("Using trim to remove whitespaces: " + trimWhitespace.trim());


	    System.out.println();
        String startsWith = "I love Java";
        System.out.println("Current string is: " + startsWith);
        System.out.println("Using startsWith to check if string starts with 'I': " + startsWith.startsWith("I")); //true

        System.out.println();
        String endWith = "I love Java!";
        System.out.println("Current string is: " + startsWith);
        System.out.println("Using startsWith to check if string ends with '?': " + startsWith.endsWith("?")); //false

        System.out.println();
        String email = "ivanovcorp0@gmail.com";
        int firstIndex = email.indexOf("@gmail.com"); // 11, returns -1 if no match
        System.out.println("First index of @gmail.com is: " + firstIndex);

        System.out.println();
        String text = "This is a test for lastIndexOf";
        int lastIndex = text.lastIndexOf("for"); // 15
        System.out.println("Last index of for is: " + lastIndex);

        System.out.println();
        String text2 = "This is a test for substring";
        String substringed = text2.substring(2, 7);
        System.out.println("Current string is: " + text2);
        System.out.println("Substring from 2 to 7: " + substringed);

        System.out.println();
        String text3 = "This is a test for substring";
        String substringed2 = text2.substring(10);
        System.out.println("Current string is: " + text3);
        System.out.println("Substring from 10: " + substringed2);

        System.out.println();
        String text4 = "a,b,c,d,e,f,g";
        String[] singleSplit = text4.split(",");
        System.out.println("Current string is: " + text4);
        System.out.println("Here is the splitted string as array with for:");
        for (int i = 0; i < singleSplit.length; i++)
        {
            System.out.printf("singleSplit[%d] = %s%n", i, singleSplit[i]);
        }


        System.out.println();
        String text5 = "a;b,c;d,e,f:g";
        String[] multipleSplit = text5.split("[,;:]");
        System.out.println("Current string is: " + text5);
        System.out.println("Here is the splitted string as array with for:");
        for (int i = 0; i < multipleSplit.length; i++)
        {
            System.out.printf("multipleSplit[%d] = %s%n", i, multipleSplit[i]);
        }


        System.out.println();
        String alpha = "aBcDeFg";
        String lowerAlpha = alpha.toLowerCase();
        String upperAlpha = alpha.toUpperCase();
        System.out.println("Current string is: " + alpha);
        System.out.println("Current string to lower is: " + lowerAlpha);
        System.out.println("Current string to upper is: " + upperAlpha);

        System.out.println();
        String text6 = "BMW + AUDI + MERCEDES are best.";
        String replacedCars = text6.replace("+", "and");
        System.out.println("Current string is: " + text6);
        System.out.println("Current replaced string is: " + replacedCars);

        System.out.println();
        String text7 = "This 1231 is 124 a 666 String!";
        String replaceAllNumbers = text7.replaceAll("[0-9]+", "");
        System.out.println("Current string is: " + text7);
        System.out.println("Current replace all string is: " + replaceAllNumbers);

        System.out.println();
        String a = "Ivan";
        String b = "Ivan";
        String c = "Gosho";
        System.out.printf("Current strings are: %s, %s, %s%n", a, b, c);
        System.out.println("Are Ivan and Ivan equal -> " + a.equals(b));
        System.out.println("Are Ivan and Gosho equal -> " + a.equals(c));
        b ="iVaN";
        System.out.println("Are Ivan and iVaN equal -> " + a.equals(b));
        System.out.println("Are Ivan and iVaN equal ignored case -> " + a.equalsIgnoreCase(b));

        System.out.println();
        int resultOfCompare = a.compareToIgnoreCase(b);
        System.out.println("Compare Ivan and iVaN with ignore case: " + resultOfCompare);
        resultOfCompare = a.compareTo(b);
        System.out.println("Compare Ivan and iVaN: " + resultOfCompare);
        resultOfCompare = b.compareTo(a);
        System.out.println("Compare iVaN and Ivan: " + resultOfCompare);

        System.out.println();
        System.out.println("Different ways of concatenating strings.");
        String text8 = "Ivan";
        String strToConcat = " Ivanov";
        text8 = text8.concat(strToConcat);
        System.out.println("Combined string with concat: " + text8);
        text8 += " . Kazanlak";
        System.out.println("Combined string with +=: " + text8);
        String name = "Ivan";
        int age = 25;
        String result = name + " " + age; // any object can be appended to a String
        System.out.println("Appending different data type to string: " + result);


        /*
         * StringBuilder keeps a buffer memory, allocated in advance
         *  - most operations use the buffer memory and do not allocate new objects.
         * Use the java.lang.StringBuilder class for modifiable Strings of characters.
         * Use StringBuilder if you need to keep adding characters to a String or when
         * you have to print to the console many times.
         */
        System.out.println();
        System.out.println("StringBuilder");
        System.out.println();
        System.out.println();
        StringBuilder sb = new StringBuilder("123456"); // initialization
        System.out.println("Current StringBuilder: " + sb);
        sb.insert(3, "pass");
        System.out.println("Current StringBuilder: " + sb);
        sb.delete(3, 7);
        System.out.println("Current StringBuilder: " + sb);
        sb = new StringBuilder("123456");
        sb.replace(3, 7, "woo");
        System.out.println("Current StringBuilder: " + sb);
        sb = new StringBuilder("123456");
        sb.reverse();
        System.out.println("Current StringBuilder: " + sb);
	}
}
