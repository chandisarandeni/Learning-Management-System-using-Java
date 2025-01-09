package AdminActivities.CommonClasses;

import java.sql.*;
import javax.swing.*;

public class UpdateSubjectStatus {

    public static void updateSubjectStatus(String courseID, String subjectName, String newStatus) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
        String user = "root";
        String password = "";
        String query = "UPDATE Subject SET subjectStatus = ? WHERE courseID = ? AND subjectName = ?";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, newStatus);
            pstmt.setString(2, courseID);
            pstmt.setString(3, subjectName);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Subject status updated successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "No matching subject found to update.");
            }

            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error updating subject status: " + e.getMessage());
        }
    }
}
