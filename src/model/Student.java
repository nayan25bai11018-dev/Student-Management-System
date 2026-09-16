package model;

public class Student {

    private int id;
    private String name;
    private int age;
    private String branch;
    private int semester;

    public Student(int id, String name, int age, String branch, int semester) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.semester = semester;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBranch() {
        return branch;
    }

    public int getSemester() {
        return semester;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Branch: " + branch +
                ", Semester: " + semester;
    }
}