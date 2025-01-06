/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  chand
 * Created: Jan 6, 2025
 */

CREATE TABLE Lecturer (
    lecturerID VARCHAR(20) PRIMARY KEY,
    lecturerName VARCHAR(100),
    lecturerNIC VARCHAR(15),
    lecturerPassword VARCHAR(50),
    lecturerContact VARCHAR(15),
    lecturerEmail VARCHAR(100),
    lecturerAddress VARCHAR(255)
);
