package Java_03_02_OOP_Advanced_Generics;

/**
 * Java Generics Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Box<T>
{
    private T element;

    public Box(T element)
    {
        this.element = element;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        String typeOfData = this.element.getClass().toString();
        sb.append(typeOfData.substring(6) + ": " + this.element);
        return sb.toString();
    }
}




