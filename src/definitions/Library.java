/*  Created by IntelliJ IDEA.
 *  User: kuldeep Singh (kuldeep506)
 *  Date: 26/08/20
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

    public void issueBook(String studentName, long universityRollNumber, String bookNames,String authorName,String ISBNNumber) {
        Book book = new Book(bookNames,authorName,ISBNNumber);
        Book[] issuedBooks = {book};
        Student student = new Student(studentName, universityRollNumber, issuedBooks.length, issuedBooks);
        System.out.println("Book Name \"" + book.getBookName() + "\" assigned to You");
        student.setNameOfBooksIssuedToStudent(issuedBooks);
    }

    public void returnBook() {
        String bookName;
        System.out.println("Enter the name which you want to return");
        Scanner scanner = new Scanner(System.in);
        bookName = scanner.nextLine();
        System.out.println("Thank you for returning book: \"" +bookName+"\"");
    }

    public static void main(String[] args) {
        Book book = new Book("helen","Billy bordan","12453584AB154");
        Book[] issuedBooks = {book};
        Student student = new Student("kuldeep", 123456, issuedBooks.length, issuedBooks);

    }
}
