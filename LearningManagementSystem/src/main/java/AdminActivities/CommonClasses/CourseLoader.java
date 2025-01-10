/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminActivities.CommonClasses;

import java.sql.*;
import javax.swing.*;

public class CourseLoader {

    public static void loadCourses(JComboBox<String> comboBox_Courses) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
        String user = "root";
        String password = "";
        String query = "SELECT courseID FROM Course";

        comboBox_Courses.removeAllItems(); // Clear existing items

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String courseID = rs.getString("courseID");
                comboBox_Courses.addItem(courseID); // Add courseID to the comboBox
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading courses: " + e.getMessage());
        }
    }
}
