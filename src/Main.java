import model.Student;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService= new StudentService();
        Student student1 = new Student(
                101,
                "Rahul",
                19,
                "CSE",
                2
        );
        studentService.addStudent(student1);

        System.out.println("Students:");
        studentService.viewStudents();
    }
}