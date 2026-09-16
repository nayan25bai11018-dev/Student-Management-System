package model;

public class Attendance {

    private int studentId;
    private int totalClasses;
    private int attendedClasses;

    public Attendance(int studentId, int totalClasses, int attendedClasses) {
        this.studentId = studentId;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public int getAttendedClasses() {
        return attendedClasses;
    }

    public double getAttendancePercentage() {
        return ((double) attendedClasses / totalClasses) * 100;
    }

    public boolean isEligible() {
        return getAttendancePercentage() >= 75;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
                ", Total Classes: " + totalClasses +
                ", Attended: " + attendedClasses +
                ", Attendance: " + String.format("%.2f", getAttendancePercentage()) + "%" +
                ", Eligible: " + (isEligible() ? "Yes" : "No");
    }
}