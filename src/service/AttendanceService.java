package service;

import exception.InvalidInputException;
import model.Attendance;

import java.util.ArrayList;

public class AttendanceService {

    private ArrayList<Attendance> attendanceList = new ArrayList<>();

    public void addAttendance(Attendance attendance) {

        if (attendance.getTotalClasses() <= 0) {
            throw new InvalidInputException("Total classes must be greater than 0.");
        }

        if (attendance.getAttendedClasses() < 0 ||
                attendance.getAttendedClasses() > attendance.getTotalClasses()) {
            throw new InvalidInputException(
                    "Attended classes cannot be negative or greater than total classes."
            );
        }

        attendanceList.add(attendance);
        System.out.println("Attendance added successfully.");
    }

    public void viewAttendance() {

        if (attendanceList.isEmpty()) {
            System.out.println("No attendance records found.");
            return;
        }

        for (Attendance attendance : attendanceList) {
            System.out.println(attendance);
        }
    }

    public Attendance searchAttendance(int studentId) {

        for (Attendance attendance : attendanceList) {
            if (attendance.getStudentId() == studentId) {
                return attendance;
            }
        }

        return null;
    }
}