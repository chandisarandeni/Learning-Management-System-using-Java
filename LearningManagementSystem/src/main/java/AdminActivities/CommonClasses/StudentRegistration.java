/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminActivities.CommonClasses;

import java.sql.*;
import javax.swing.*;

public class StudentRegistration {

    public static String generateStudentID() {
        String url = "jdbc:mysql://localhost:3306/LMS";
        String user = "root";
        String password = "";
        String query = "SELECT COUNT(*) FROM Student";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                int count = rs.getInt(1) + 1; // Increment count for the new student
                return String.format("S-%04d", count); // Format ID as S-0001, S-0002, etc.
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "S-0001"; // Default if query fails
    }

    public static String generateStudentEmail(String courseID) {
        String url = "jdbc:mysql://localhost:3306/LMS";
        String user = "root";
        String password = "";
        String query = "SELECT COUNT(*) FROM Student WHERE courseID = ?";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, courseID);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int count = rs.getInt(1) + 1; // Increment count for the new email
                return courseID.toLowerCase() + "-" + String.format("%03d", count) + "@student.ru.lk";
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courseID.toLowerCase() + "-001@student.ru.lk"; // Default if query fails
    }

    public static void registerStudent(
            String studentID,
            String studentName,
            String studentNIC,
            String studentContact,
            String studentEmail,
            String studentPassword,
            String courseID,
            String studentAddress
    ) {
        String url = "jdbc:mysql://localhost:3306/LMS";
        String user = "root";
        String password = "";
        String query = "INSERT INTO Student (studentID, studentName, studentNIC, studentContact, studentEmail, studentPassword, courseID, studentAddress) "
                     + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, studentID);
            pstmt.setString(2, studentName);
            pstmt.setString(3, studentNIC);
            pstmt.setString(4, studentContact);
            pstmt.setString(5, studentEmail);
            pstmt.setString(6, studentPassword);
            pstmt.setString(7, courseID);
            pstmt.setString(8, studentAddress);

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Student registered successfully with ID: " + studentID);
            }

            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error registering student: " + e.getMessage());
        }
    }
}
