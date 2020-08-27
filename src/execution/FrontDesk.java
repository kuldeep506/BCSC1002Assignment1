/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_NEW_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int SHOW_ALL_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        Student student = new Student();
        String studentName;
        long universityRollNumber;
        String returningBookName;
        int numberOfBooks;
        int customerInput;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.\n");
            System.out.println("3. Show me all my issues books.\n");
            System.out.println("4. Exit.\n");
            System.out.println("enter your choice from choice from 1-4");
            customerInput = scanner.nextInt();
            switch (customerInput) {
                case ISSUE_NEW_BOOK:
                    System.out.println("enter your name");
                    studentName = scanner.nextLine();
                    student.setStudentFullName(studentName);
                    scanner.nextLine();
                    System.out.println("enter your university roll number");
                    universityRollNumber = scanner.nextLong();
                    student.setUniversityRollNumber(universityRollNumber);
                    System.out.println("enter number of books issues to "+studentName);
                    numberOfBooks=scanner.nextInt();
                    student.setNumberOfBooksIssuedToStudent(numberOfBooks);
                    library.issueBook();
                    break;

                case RETURN_BOOK:
                    System.out.println("enter the name of book you want to return");
                    returningBookName = scanner.nextLine();
                    library.returnBook(returningBookName);
                    break;
                case SHOW_ALL_ISSUED_BOOKS:
                    student.getNameOfBooksIssuedToStudent();
                    break;
                default:
                    break;

            }
        }
        while (customerInput != EXIT);
        scanner.close();
    }
}
