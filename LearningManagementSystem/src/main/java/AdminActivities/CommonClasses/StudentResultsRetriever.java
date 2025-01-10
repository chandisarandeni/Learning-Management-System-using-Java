/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminActivities.CommonClasses;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentResultsRetriever {

    public static void retrieveResults(JTextField txt_studentID, JLabel lbl_showStudentID, JLabel lbl_showStudentName, JTable tbl_Results) {
        String studentID = txt_studentID.getText(); // Get student ID from text field
        String url = "jdbc:mysql://localhost:3306/LMS"; // Your database URL
        String user = "root"; // Your database username
        String password = ""; // Your database password

        String studentQuery = "SELECT studentName FROM Student WHERE studentID = ?";
        String resultsQuery = "SELECT subjectName, Grade, GPA_Points FROM Examination WHERE studentID = ?";

        DefaultTableModel model = (DefaultTableModel) tbl_Results.getModel();
        model.setRowCount(0); // Clear existing rows

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Retrieve student data (name)
            PreparedStatement pstmtStudent = conn.prepareStatement(studentQuery);
            pstmtStudent.setString(1, studentID);
            ResultSet rsStudent = pstmtStudent.executeQuery();

            if (rsStudent.next()) {
                String studentName = rsStudent.getString("studentName");
                lbl_showStudentID.setText(studentID);
                lbl_showStudentName.setText(studentName);
            } else {
                JOptionPane.showMessageDialog(null, "Student not found!");
                return;
            }

            // Retrieve student's examination results
            PreparedStatement pstmtResults = conn.prepareStatement(resultsQuery);
            pstmtResults.setString(1, studentID);
            ResultSet rsResults = pstmtResults.executeQuery();

            while (rsResults.next()) {
                String subjectName = rsResults.getString("subjectName");
                String grade = rsResults.getString("Grade");
                double gpaPoints = rsResults.getDouble("GPA_Points");

                model.addRow(new Object[]{subjectName, grade, gpaPoints});
            }

            rsStudent.close();
            rsResults.close();
            pstmtStudent.close();
            pstmtResults.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error retrieving data.");
        }
    }
}