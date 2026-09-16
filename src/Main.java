import model.Student;
import service.StudentService;
import model.Marks;
import model.Attendance;
import service.AttendanceService;
import service.MarksService;
import exception.InvalidInputException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        MarksService marksService = new MarksService();
        AttendanceService attendanceService = new AttendanceService();
        while (true) {

            System.out.println("\n==============================");
            System.out.println("   STUDENT MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Add Marks");
            System.out.println("7. View Marks");
            System.out.println("8. Search Marks");
            System.out.println("9.Add Attendance");
            System.out.println("10. View Attendance");
            System.out.println("11. Search Attendance");
            System.out.println("12. Exit");
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
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();

                    if (!studentService.studentExists(studentId)) {
                        System.out.println("Student ID does not exist.");
                        break;
                    }

                    System.out.print("Enter Java marks: ");

                    System.out.print("Enter Java marks: ");
                    double javaMarks = scanner.nextDouble();

                    System.out.print("Enter DSA marks: ");
                    double dsaMarks = scanner.nextDouble();

                    System.out.print("Enter DBMS marks: ");
                    double dbmsMarks = scanner.nextDouble();

                    System.out.print("Enter OS marks: ");
                    double osMarks = scanner.nextDouble();

                    System.out.print("Enter Maths marks: ");
                    double mathsMarks = scanner.nextDouble();

                    Marks marks = new Marks(
                            studentId,
                            javaMarks,
                            dsaMarks,
                            dbmsMarks,
                            osMarks,
                            mathsMarks
                    );

                    try {
                        marksService.addMarks(marks);
                        System.out.println("Marks added successfully.");
                    } catch (InvalidInputException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("\n----- MARKS -----");
                    marksService.viewMarks();
                    break;
                case 8:
                    System.out.print("Enter student ID to search marks: ");
                    int marksStudentId = scanner.nextInt();

                    marksService.searchMarks(marksStudentId);
                    break;
                case 9:
                    System.out.print("Enter Student ID: ");
                    int attendanceStudentId = scanner.nextInt();

                    if (!studentService.studentExists(attendanceStudentId)) {
                        System.out.println("Student not found.");
                        break;
                    }

                    System.out.print("Enter total classes: ");
                    int totalClasses = scanner.nextInt();

                    System.out.print("Enter attended classes: ");
                    int attendedClasses = scanner.nextInt();

                    try {
                        Attendance attendance = new Attendance(
                                attendanceStudentId,
                                totalClasses,
                                attendedClasses
                        );

                        attendanceService.addAttendance(attendance);

                    } catch (InvalidInputException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 10:
                    attendanceService.viewAttendance();
                    break;
                case 11:
                    System.out.print("Enter Student ID to search attendance: ");
                    int searchAttendanceId = scanner.nextInt();

                    Attendance foundAttendance =
                            attendanceService.searchAttendance(searchAttendanceId);

                    if (foundAttendance != null) {
                        System.out.println(foundAttendance);
                    } else {
                        System.out.println("Attendance record not found.");
                    }
                    break;
                case 12:
                    System.out.println("Thank you");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}