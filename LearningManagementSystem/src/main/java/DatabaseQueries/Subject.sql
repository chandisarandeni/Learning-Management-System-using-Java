/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  chand
 * Created: Jan 10, 2025
 */

CREATE TABLE Subject (
    subjectName VARCHAR(100),
    courseID VARCHAR(20),
    creditCount INT,
    subjectStatus VARCHAR(50),
    FOREIGN KEY (courseID) REFERENCES Course(courseID)
);
