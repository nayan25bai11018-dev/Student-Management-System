package service;

import model.Student ;
import util.FileManager;
import java.util.ArrayList;

public class StudentService{
    public void addStudent(Student student) {
        students.add(student);
        FileManager.saveStudents(students);
    }
    private ArrayList<Student> students = FileManager.loadStudents();

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
                FileManager.saveStudents(students);
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
                FileManager.saveStudents(students);
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
    public boolean studentExists(int id) {

        for (Student student : students) {
            if (student.getId() == id) {
                return true;
            }
        }

        return false;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
}
