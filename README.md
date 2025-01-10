# Student Management System
<p align="center">
  <img src="https://github.com/user-attachments/assets/ccf75b72-d775-4b47-b9d7-cd96a50b5d71" width="400" />
  <img src="https://github.com/user-attachments/assets/50986718-f55b-4ad5-b35c-95eeb6c0deb7" width="400" />
</p>

## Overview

This project is a Student Management System that allows managing various aspects of student data, including courses, subjects, examination results, and lecturer information. It allows both students and lecturers to view and update their data, and it includes features for generating reports related to student courses and grades.

## Technologies Used

- **Java**: Core programming language used for the application.
- **MySQL**: Database management system for storing and retrieving student, course, and lecturer data.
- **JasperReports**: Reporting library used to generate reports based on SQL queries.
- **Swing**: Java library for building graphical user interfaces (GUIs).

## Database Schema

### Tables

1. **Student**
   ```sql
   CREATE TABLE Student (
       studentID VARCHAR(20) PRIMARY KEY,
       studentName VARCHAR(100),
       studentNIC VARCHAR(15),
       studentEmail VARCHAR(100),
       studentPassword VARCHAR(50),
       studentDateOfBirth DATE,
       studentAddress VARCHAR(255),
       studentContact VARCHAR(15),
       studentGender VARCHAR(10),
       courseID VARCHAR(20),
       FOREIGN KEY (courseID) REFERENCES Course(courseID)
   );
   ```

2. **Course**
   ```sql
   CREATE TABLE Course (
       courseID VARCHAR(20) PRIMARY KEY,
       courseName VARCHAR(100),
       maximumNumberOfStudents INT
   );
   ```

3. **Lecturer**
   ```sql
   CREATE TABLE Lecturer (
       lecturerID VARCHAR(20) PRIMARY KEY,
       lecturerName VARCHAR(100),
       lecturerNIC VARCHAR(15),
       lecturerContact VARCHAR(15),
       lecturerEmail VARCHAR(100),
       lecturerAddress VARCHAR(255)
   );
   ```

4. **Examination**
   ```sql
   CREATE TABLE Examination (
       studentID VARCHAR(20),
       subjectName VARCHAR(100),
       Marks INT,
       Grade VARCHAR(5),
       GPA_Points DOUBLE,
       FOREIGN KEY (studentID) REFERENCES Student(studentID)
   );
   ```

## Setup and Installation

1. **Clone the repository**:
   ```bash
   git clone <https://github.com/chandisarandeni/Learning-Management-System-using-Java>
   ```

2. **Database Setup**:
   - Create a MySQL database named `LMS` or any other name.
   - Create the tables based on the schema provided above.
   - Configure the database connection in the Java code (`StudentManagementSystem.java`).

3. **Dependencies**:
   - Install **JDBC** and **JasperReports** libraries for database connection and report generation.

4. **Run the Application**:
   - Compile and run the `StudentManagementSystem` class to launch the GUI application.

