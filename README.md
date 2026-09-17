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