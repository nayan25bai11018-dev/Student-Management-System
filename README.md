# Student Management System

## Overview

The Student Management System is a Java-based command-line application designed to manage basic student academic information.

The system allows users to manage student details, marks, and attendance through a simple menu-driven interface.

## Features

### 1. Student Management
- Add a student
- View all students
- Search for a student
- Update student details
- Delete a student

### 2. Marks Management
- Add marks for a student
- View marks
- Search marks by student ID
- Calculate total marks
- Calculate percentage
- Calculate grade

### 3. Attendance Management
- Add attendance records
- View attendance records
- Search attendance by student ID
- Calculate attendance percentage
- Check attendance eligibility

## Technologies Used

- Java
- JDK 21
- IntelliJ IDEA
- Git
- GitHub
- ArrayList
- File Handling
- Exception Handling

## Project Structure

```text
src/
├── exception/
│   └── InvalidInputException.java
│
├── model/
│   ├── Attendance.java
│   ├── Marks.java
│   └── Student.java
│
├── service/
│   ├── AttendanceService.java
│   ├── MarksService.java
│   └── StudentService.java
│
├── util/
│   └── FileManager.java
│
└── Main.java

students.txt
statement.md
README.md

## How to Run

1. Install JDK 21 or later.
2. Open the project in IntelliJ IDEA.
3. Make sure the project SDK is set to JDK 21.
4. Open `src/Main.java`.
5. Run the `Main` class.
6. Use the menu options displayed in the terminal to manage student, marks, and attendance records.

## Testing

The application can be tested through the command-line interface.

- Add a student and verify that the student record is displayed.
- Search for an existing student using the student ID.
- Update and delete a student record.
- Add valid marks and verify total marks, percentage, and grade.
- Enter marks outside the range of 0–100 and verify that an error message is displayed.
- Add attendance information and verify the attendance percentage and eligibility.
- Enter invalid attendance values and verify that the system handles the input correctly.