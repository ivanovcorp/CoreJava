package Java_02_04_OOP_Polymorphism;

/**
 * Java Polymorphism Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public abstract class Mammal
{
    protected static final int DEFAULT_AGE = 1;

    private String typeOfMammal;
    private int age;

    public Mammal(String typeOfMammal, int age)
    {
        this.setTypeOfMammal(typeOfMammal);
        this.setAge(age);
    }

    public Mammal(String typeOfMammal)
    {
        this(typeOfMammal, DEFAULT_AGE);
    }

    private void setTypeOfMammal(String typeOfMammal)
    {
        // validation...
        this.typeOfMammal = typeOfMammal;
    }

    public String getTypeOfMammal()
    {
        return this.typeOfMammal;
    }

    private void setAge(int age)
    {
        // validation...
        this.age = age;
    }

    public int getAge()
    {
        return this.age;
    }
}



