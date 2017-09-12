package Java_02_04_OOP_Polymorphism;

/**
 * Java Polymorphism Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Person extends Mammal implements Animal
{
    private String sex;

    public Person(String typeOfMammal, String sex)
    {
        this(typeOfMammal, Mammal.DEFAULT_AGE, sex);
    }

    public Person(String typeOfMammal, int age, String sex)
    {
        super(typeOfMammal, age);
        this.setSex(sex);
    }

    private void setSex(String sex)
    {
        // validation...
        this.sex = sex;
    }

    public String getSex()
    {
        return this.sex;
    }

    @Override
    public void feed()
    {
        System.out.println(this.getTypeOfMammal() + " is feeding.");
    }

    @Override
    public void sleep(int hoursToSleep)
    {
        System.out.println(this.getTypeOfMammal() + " will sleep for " + hoursToSleep + " hours.");
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getTypeOfMammal() + " " + this.sex);
        return sb.toString();
    }

}



