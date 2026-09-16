import model.Student;
import service.StudentService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        while (true) {

            System.out.println("\n==============================");
            System.out.println("   STUDENT MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter branch: ");
                    String branch = scanner.nextLine();

                    System.out.print("Enter semester: ");
                    int semester = scanner.nextInt();

                    Student student = new Student(
                            id, name, age, branch, semester
                    );

                    studentService.addStudent(student);

                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.println("\n---- STUDENT LIST ----");
                    studentService.viewStudents();
                    break;
                case 3:
                    System.out.print("Enter student ID to search: ");
                    int searchId = scanner.nextInt();

                    studentService.searchStudent(searchId);
                    break;
                case 4:
                    System.out.print("Enter student ID to update: ");
                    int updateId = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter new branch: ");
                    String newBranch = scanner.nextLine();

                    System.out.print("Enter new semester: ");
                    int newSemester = scanner.nextInt();

                    studentService.updateStudent(
                            updateId,
                            newName,
                            newAge,
                            newBranch,
                            newSemester
                    );

                    break;
                case 5:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = scanner.nextInt();

                    studentService.deleteStudent(deleteId);
                    break;
                case 6:
                    System.out.println("Thank you");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}