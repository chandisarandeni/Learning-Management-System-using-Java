package AdminActivities.CommonClasses;

import java.sql.*;
import javax.swing.*;

public class SubjectLoader {

    public static void loadSubjectNames(JComboBox<String> comboBox, String courseID) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
        String user = "root";
        String password = "";
        String query = "SELECT subjectName FROM Subject WHERE courseID = ?";

        comboBox.removeAllItems(); // Clear existing items

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, courseID);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String subjectName = rs.getString("subjectName");
                comboBox.addItem(subjectName); // Add each subject name to the combo box
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading subjects: " + e.getMessage());
        }
    }
}
