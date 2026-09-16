package model;

public class Marks {

    private int studentId;
    private double javaMarks;
    private double dsaMarks;
    private double dbmsMarks;
    private double osMarks;
    private double mathsMarks;

    public Marks(int studentId, double javaMarks, double dsaMarks,
                 double dbmsMarks, double osMarks, double mathsMarks) {

        this.studentId = studentId;
        this.javaMarks = javaMarks;
        this.dsaMarks = dsaMarks;
        this.dbmsMarks = dbmsMarks;
        this.osMarks = osMarks;
        this.mathsMarks = mathsMarks;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getJavaMarks() {
        return javaMarks;
    }

    public double getDsaMarks() {
        return dsaMarks;
    }

    public double getDbmsMarks() {
        return dbmsMarks;
    }

    public double getOsMarks() {
        return osMarks;
    }

    public double getMathsMarks() {
        return mathsMarks;
    }

    public double getTotal() {
        return javaMarks + dsaMarks + dbmsMarks + osMarks + mathsMarks;
    }

    public double getPercentage() {
        return getTotal() / 5;
    }

    public String getGrade() {
        double percentage = getPercentage();

        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}