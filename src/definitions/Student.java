/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
private String studentFullName;
private long universityRollNumber;
private int numberOfBooksIssuedToStudent;
private Book[] nameOfBooksIssuedToStudent;

    public Student(String studentFullName, long universityRollNumber, int numberOfBooksIssuedToStudent, Book[] nameOfBooksIssuedToStudent) {
        this.studentFullName = studentFullName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssuedToStudent = numberOfBooksIssuedToStudent;
        this.nameOfBooksIssuedToStudent = nameOfBooksIssuedToStudent;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssuedToStudent() {
        return numberOfBooksIssuedToStudent;
    }

    public void setNumberOfBooksIssuedToStudent(int numberOfBooksIssuedToStudent) {
        this.numberOfBooksIssuedToStudent = numberOfBooksIssuedToStudent;
    }

    public Book[] getNameOfBooksIssuedToStudent() {
        return nameOfBooksIssuedToStudent;
    }

    public void setNameOfBooksIssuedToStudent(Book[] nameOfBooksIssuedToStudent) {
        this.nameOfBooksIssuedToStudent = nameOfBooksIssuedToStudent;
    }

}
