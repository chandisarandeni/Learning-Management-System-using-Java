package LecturerActivities.CommonClasses;

import AdminActivities.CommonClasses.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CourseDataLoader {

    public static void loadCourseIDs(JComboBox<String> comboBox) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
        String user = "root";
        String password = "";
        String query = "SELECT courseID FROM Course";

        comboBox.removeAllItems(); // Clear existing items

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String courseID = rs.getString("courseID");
                comboBox.addItem(courseID); // Add each courseID to the combo box
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Load subject names and their status based on the selected courseID
    public static void loadSubjectStatusData(JTable table, String courseID) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
        String user = "root";
        String password = "";
        String query = "SELECT subjectName, subjectStatus FROM Subject WHERE courseID = ?";

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, courseID);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String subjectName = rs.getString("subjectName");
                String subjectStatus = rs.getString("subjectStatus");

                model.addRow(new Object[]{subjectName, subjectStatus});
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
