package service;

import model.Student ;
import java.util.ArrayList;

public class StudentService{
    private ArrayList<Student> students = new ArrayList<>();
    public void addStudent(Student student){
        students.add(student);

    }
    public void viewStudents(){
        for(Student student : students){
            System.out.println(student);
        }
    }
}
