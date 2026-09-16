package service;

import model.Marks;
import exception.InvalidInputException;
import java.util.ArrayList;

public class MarksService {

    private ArrayList<Marks> marksList = new ArrayList<>();



    public void viewMarks() {
        for (Marks marks : marksList) {
            System.out.println("Student ID: " + marks.getStudentId());
            System.out.println("Java: " + marks.getJavaMarks());
            System.out.println("DSA: " + marks.getDsaMarks());
            System.out.println("DBMS: " + marks.getDbmsMarks());
            System.out.println("OS: " + marks.getOsMarks());
            System.out.println("Maths: " + marks.getMathsMarks());
            System.out.println("Total: " + marks.getTotal());
            System.out.println("Percentage: " + marks.getPercentage() + "%");
            System.out.println("Grade: " + marks.getGrade());
            System.out.println("----------------------------");
        }
    }
    public void searchMarks(int studentId) {

        for (Marks marks : marksList) {

            if (marks.getStudentId() == studentId) {
                System.out.println("Marks found:");
                System.out.println("Java: " + marks.getJavaMarks());
                System.out.println("DSA: " + marks.getDsaMarks());
                System.out.println("DBMS: " + marks.getDbmsMarks());
                System.out.println("OS: " + marks.getOsMarks());
                System.out.println("Maths: " + marks.getMathsMarks());
                System.out.println("Total: " + marks.getTotal());
                System.out.println("Percentage: " + marks.getPercentage() + "%");
                System.out.println("Grade: " + marks.getGrade());
                return;
            }
        }

        System.out.println("Marks not found for this student.");
    }
    private void validateMarks(double marks) {

        if (marks < 0 || marks > 100) {
            throw new InvalidInputException(
                    "Marks must be between 0 and 100."
            );
        }
    }
    public void addMarks(Marks marks) {

        validateMarks(marks.getJavaMarks());
        validateMarks(marks.getDsaMarks());
        validateMarks(marks.getDbmsMarks());
        validateMarks(marks.getOsMarks());
        validateMarks(marks.getMathsMarks());

        marksList.add(marks);
    }
}