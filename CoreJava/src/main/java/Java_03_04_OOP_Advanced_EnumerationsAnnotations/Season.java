package Java_03_04_OOP_Advanced_EnumerationsAnnotations;

/**
 * Java Enumerations and Annotations Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public enum Season
{
    SPRING(28), SUMMER(44), AUTUMN(22), WINTER(4);

    private int max;

    Season (int maxTemp)
    {
        this.max = maxTemp;
    }

    public int getMaxTemp()
    {
        return this.max;
    }

    /*@Override
    public String toString()
    {
        return super.name().toLowerCase();
    }*/
}



