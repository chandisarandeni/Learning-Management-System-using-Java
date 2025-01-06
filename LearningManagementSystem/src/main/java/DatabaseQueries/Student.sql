/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  chand
 * Created: Jan 6, 2025
 */

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
