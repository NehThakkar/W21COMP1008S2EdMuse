package models;

import java.time.LocalDate;
import java.util.TreeMap;

public class Student extends Person{
    private int studentNum;
    private TreeMap<String, Integer> grades;

    public Student(String firstName, String lastName, String address, LocalDate birthday, int studentNum) {
        super(firstName, lastName, address, birthday);
        setStudentNum(studentNum);
        grades = new TreeMap<>();
    }

    public int getStudentNum() {
        return studentNum;
    }

    private void setStudentNum(int studentNum) {
        if (studentNum>=100000000)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("student number must be greater than 100000000");
    }

    public TreeMap<String, Integer> getGrades() {
        return grades;
    }

    /**
     * This method will validate that a courseCRN is valid and that the grade is in the range
     * of 0-100.  If the validation passes, it will add it to the list of grades
     * @param courseCRN
     * @param grade
     */
    public void addGrade(String courseCRN, int grade)
    {

    }
}
