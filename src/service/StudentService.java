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
    public void searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student found:");
                System.out.println(student);
                return;
            }
        }

        System.out.println("Student not found");
    }
    public void updateStudent(int id, String name, int age, String branch, int semester) {

        for (Student student : students) {

            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                student.setBranch(branch);
                student.setSemester(semester);
                System.out.println("Student updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
    public void deleteStudent(int id) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}
