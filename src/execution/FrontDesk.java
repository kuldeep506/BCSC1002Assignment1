/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private Student currentStudentDetails;
    private static final int ISSUE_NEW_BOOK=1;
    private static final int RETURN_BOOK=2;
    private static final int SHOW_ALL_ISSUED_BOOKS=3;
    private static final int EXIT=3;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int customerInput;
        Book bookName =new Book();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.\n");
            System.out.println("3. Show me all my issues books.\n");
            System.out.println("4. Exit.\n");
            customerInput=scanner.nextInt();
         switch (customerInput){
            case ISSUE_NEW_BOOK:
                System.out.println("Enter a book name you want");
                scanner.nextLine();
                bookName=scanner.nextLine();

        }
        }
        while (customerInput!=EXIT);
        scanner.close();
    }
}
