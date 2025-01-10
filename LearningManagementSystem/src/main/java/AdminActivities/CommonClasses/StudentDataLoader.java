/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminActivities.CommonClasses;

import java.sql.*;
import javax.swing.JLabel;

public class StudentDataLoader {

    public static void loadStudentDetails(String studentID, JLabel lbl_studentID, JLabel lbl_studentName, 
                                          JLabel lbl_studentNIC, JLabel lbl_studentDoB, 
                                          JLabel lbl_studentContact, JLabel lbl_studentEmail, 
                                          JLabel lbl_studentAddress) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Your database URL
        String user = "root"; // Your database username
        String password = ""; // Your database password

        String query = "SELECT studentID, studentName, studentNIC, studentDateOfBirth, " +
                       "studentContact, studentEmail, studentAddress " +
                       "FROM Student WHERE studentID = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, studentID); // Set the studentID in the query
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                lbl_studentID.setText(rs.getString("studentID"));
                lbl_studentName.setText(rs.getString("studentName"));
                lbl_studentNIC.setText(rs.getString("studentNIC"));
                lbl_studentDoB.setText(rs.getString("studentDateOfBirth"));
                lbl_studentContact.setText(rs.getString("studentContact"));
                lbl_studentEmail.setText(rs.getString("studentEmail"));
                lbl_studentAddress.setText(rs.getString("studentAddress"));
            } else {
                // Clear the labels if no student is found
                lbl_studentID.setText("N/A");
                lbl_studentName.setText("N/A");
                lbl_studentNIC.setText("N/A");
                lbl_studentDoB.setText("N/A");
                lbl_studentContact.setText("N/A");
                lbl_studentEmail.setText("N/A");
                lbl_studentAddress.setText("N/A");
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}