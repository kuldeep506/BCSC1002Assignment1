/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    private Book[] availableBooks;

    public Library(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public Library() {
        Book book1 = new Book("java fundamental", "Tom Moody", "12453584AB123");
        Book book2 = new Book("python fundamental", "Karl beast", "12453584AB126");
        Book book3 = new Book("C fundamental", "Mike Jackson", "12453584AB128");
        Book book4 = new Book("C++ fundamental", "Vinod tharu", "12453584AB154");
        Book[] books = new Book[]{book1, book2, book3, book4};
        this.availableBooks = books;
    }

    public Book[] getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "availableBooks=" + Arrays.toString(availableBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(getAvailableBooks(), library.getAvailableBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAvailableBooks());
    }
}
