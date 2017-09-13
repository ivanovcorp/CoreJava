package Java_03_03_OOP_Advanced_IteratorsAndComparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Java Iterators and Comparators Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Book
{
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors)
    {
        this.setAuthors(authors);
        this.setTitle(title);
        this.setYear(year);
    }

    private void setTitle(String title)
    {
        this.title = title;
    }

    private void setYear(int year)
    {
        this.year = year;
    }

    private void setAuthors(String... authors)
    {
        if (authors.length == 0)
        {
            this.authors = new ArrayList<>();
        }
        else
        {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    public String getTitle()
    {
        return title;
    }

    public int getYear()
    {
        return year;
    }

    public List<String> getAuthors()
    {
        return authors;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getTitle() + " " + this.getYear() + " " + this.getAuthors());
        return sb.toString();
    }
}



