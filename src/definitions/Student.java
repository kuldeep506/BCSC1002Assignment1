/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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
    public Student(Book[] nameOfBooksIssuedToStudent){
        Book[] books=new Book[3];

    }

    public Student() {
        this.nameOfBooksIssuedToStudent = new Book[3];
        for (int i = 0; i < nameOfBooksIssuedToStudent.length; i++) {
            nameOfBooksIssuedToStudent[i] = new Book("Video " + (i + 1));
        }
    }

    public Student(String studentFullName, long universityRollNumber) {
        this.studentFullName = studentFullName;
        this.universityRollNumber = universityRollNumber;
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
        return nameOfBooksIssuedToStudent.clone();
    }

    public void setNameOfBooksIssuedToStudent(Book[] nameOfBooksIssuedToStudent) {
        this.nameOfBooksIssuedToStudent = nameOfBooksIssuedToStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentFullName='" + studentFullName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssuedToStudent=" + numberOfBooksIssuedToStudent +
                ", nameOfBooksIssuedToStudent=" + Arrays.toString(nameOfBooksIssuedToStudent) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBooksIssuedToStudent() == student.getNumberOfBooksIssuedToStudent() &&
                Objects.equals(getStudentFullName(), student.getStudentFullName()) &&
                Arrays.equals(getNameOfBooksIssuedToStudent(), student.getNameOfBooksIssuedToStudent());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentFullName(), getUniversityRollNumber(), getNumberOfBooksIssuedToStudent());
        result = 31 * result + Arrays.hashCode(getNameOfBooksIssuedToStudent());
        return result;
    }
}
