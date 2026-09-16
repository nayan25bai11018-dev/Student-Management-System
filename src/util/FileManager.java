package util;

import model.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    private static final String STUDENT_FILE = "students.txt";

    public static void saveStudents(ArrayList<Student> students) {

        try {
            FileWriter writer = new FileWriter(STUDENT_FILE);

            for (Student student : students) {
                writer.write(
                        student.getId() + "," +
                                student.getName() + "," +
                                student.getAge() + "," +
                                student.getBranch() + "," +
                                student.getSemester() + "\n"
                );
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Error saving student data.");
        }
    }
    public static ArrayList<Student> loadStudents() {

        ArrayList<Student> students = new ArrayList<>();

        try {
            java.io.File file = new java.io.File(STUDENT_FILE);

            if (!file.exists()) {
                return students;
            }

            java.util.Scanner scanner = new java.util.Scanner(file);

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                String[] data = line.split(",");

                if (data.length == 5) {

                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    int age = Integer.parseInt(data[2]);
                    String branch = data[3];
                    int semester = Integer.parseInt(data[4]);

                    Student student = new Student(
                            id, name, age, branch, semester
                    );

                    students.add(student);
                }
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("Error loading student data.");
        }

        return students;
    }
}
