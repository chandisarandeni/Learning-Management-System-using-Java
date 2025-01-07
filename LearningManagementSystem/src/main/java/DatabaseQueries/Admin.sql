/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  chand
 * Created: Jan 6, 2025
 */

CREATE TABLE Admin (
    adminID VARCHAR(20) PRIMARY KEY,
    adminName VARCHAR(100),
    adminNIC VARCHAR(15),
    adminUsername VARCHAR(100),
    adminPassword VARCHAR(50)
);
