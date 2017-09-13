package Java_03_03_OOP_Advanced_IteratorsAndComparators;

/**
 * Java Iterators and Comparators Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Student implements Comparable<Student>
{
    private String name;
    private int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student st)
    {
        if (this.age == st.age)
        {
            return 0;
        }
        else if (this.age > st.age)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

}