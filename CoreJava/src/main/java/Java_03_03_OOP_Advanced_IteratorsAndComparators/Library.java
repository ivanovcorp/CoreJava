package Java_03_03_OOP_Advanced_IteratorsAndComparators;

import java.util.Iterator;

/**
 * Java Iterators and Comparators Practical Examples
 *
 * @author Ivan Ivanov(whoami)
 */
public class Library<Book> implements Iterable<Book>
{
    private Book[] books;

    public Library(Book...books)
    {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator()
    {
        return new LibIterator();
    }

    private final class LibIterator implements Iterator<Book>
    {
        private int index = 0;

        public LibIterator()
        {
            this.index = 0;
        }

        @Override
        public boolean hasNext()
        {
            return this.index < books.length;
        }

        @Override
        public Book next()
        {
            return books[this.index++];
        }

    }

}



