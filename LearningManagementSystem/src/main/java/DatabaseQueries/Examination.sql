/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  chand
 * Created: Jan 10, 2025
 */

CREATE TABLE Examination (
    studentID VARCHAR(20),
    subjectName VARCHAR(100),
    Marks INT,
    Grade VARCHAR(5),
    GPA_Points DECIMAL(3,2),
    PRIMARY KEY (studentID, subjectName)
);