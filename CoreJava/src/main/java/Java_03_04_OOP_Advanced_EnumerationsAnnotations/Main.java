package Java_03_04_OOP_Advanced_EnumerationsAnnotations;

/**
 * Java Enumerations and Annotations Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Main
{
    public static void main(String[] args)
    {
        /*
         * Enumerations
         *
         *
         * Object type, limited to a set of vlaues.
         */
        Season season = Season.SUMMER;
        System.out.println("Print enum Season(summer): " + season);

        /*
         * You can use enum values in a switch-case statements.
         */
        System.out.println();
        System.out.println("Print season according to variable season.");
        switch (season)
        {
            case SPRING:
                System.out.println("Season is Spring");
                break;
            case SUMMER:
                System.out.println("Season is Summer");
                break;
            case AUTUMN:
                System.out.println("Season is Autumn");
                break;
            case WINTER:
                System.out.println("Season is Winter");
                break;
        }

        /*
         * values() - returns an array with all constants.
         */
        System.out.println();
        Season[] seasons = Season.values();
        System.out.println("Print all values of Season");
        for (Season seas : seasons)
        {
            System.out.println("Current enum value: " + seas);
        }

        /*
         * name() - gets the string representation
         *
         * toString() - can be overriden
         * name() is final
         */
        season = Season.WINTER;
        System.out.println();
        System.out.println("Printing Season.WINTER and Season.WINTER.name(): ");
        System.out.println(season);
        System.out.println(Season.WINTER.name());

        /*
         * Overriding it is considered to be a good practice.
         */
        System.out.println();
        System.out.println("Printing season name(commented by default in the enum): ");
        System.out.println(season.toString());

        /*
         * Every enum constant has a zero based order value
         */
        System.out.println();
        System.out.println(season.ordinal());
        System.out.println(Season.SUMMER.ordinal());

        /*
         * valueOf(Class, String) - gets the enum by a given class and a String
         */
        System.out.println();
        System.out.println("Using valueOf(Class, String)");
        Season spring = Season.valueOf(Season.class, "SPRING");
        System.out.println(spring);
        Season summer = Enum.valueOf(Season.class, "SUMMER");
        System.out.println(summer);

        /*
         * Comparing enums
         */
        System.out.println();
        System.out.println("Comparing nums.");
        if (spring.compareTo(summer) < 0)
        {
            System.out.printf("%s comes before %s%n", spring, summer);
        }

        /*
         * Enums in Java can have fields, methods and constructors.
         */
        System.out.println("Print max temperature: " + spring.getMaxTemp());


        /*
         * Annotation
         *
         *
         * Data holding class.
         * Describes parts of your code.
         * Applied to: Classes, Fields, Methods
         *
         * check method deprecatedMethod() below.
         */

        /*
         * Generate compiler messages or errors
         *
         * @SuppressWarning("unchecked")
         * @Deprecated
         */

        /*
         * Built-in Annotations
         *
         *
         * @Override - generates compiler error if method does not
         * override a method in a paren class
         *
         * @Deprecated - generates a compiler warning if the element is used
         *
         * @SuppressWarnings(value = "unchecked"
         *
         * @interface - used to create annotations(check below)
         */

        /*
         * Allowed types for annotation elemnts
         *
         * - Primitive types(int, long, boolean, etc)
         * - String
         * - Class
         * - Enum
         * - Annotation
         * - Arrays of any of the above
         */

        /*
         * Meta Annotations - @Target
         *
         *
         * Meta annotations annotate annotations
         * @Target - specifies where annotation is applicable
         * Available element types - CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD
         * PACKAGE, PARAMETER, TYPE
         */

        /*
         * Meta Annotations - @Retention
         *
         *
         * Meta annotations annotate annotations
         * @Rention - specifies where annotation is available
         * Available retention policies - SOURCE, CLASS, RUNTIME
         */
    }

    public @interface MyAnnotation
    {
        String myValue() default "default";
    }

    @Deprecated
    public void deprecatedMethod()
    {
      System.out.println("Deprecated!");
    }


}



