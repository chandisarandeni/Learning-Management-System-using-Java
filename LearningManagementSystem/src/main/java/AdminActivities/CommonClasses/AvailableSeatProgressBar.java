/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminActivities.CommonClasses;

import java.sql.*;
import javax.swing.JProgressBar;

public class AvailableSeatProgressBar {

    public static void updateProgressBar(JProgressBar progressBar, String courseID) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
        String user = "root";
        String password = "";

        String courseQuery = "SELECT maximumNumberOfStudents FROM Course WHERE courseID = ?";
        String studentCountQuery = "SELECT COUNT(*) FROM Student WHERE courseID = ?";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            // Get the maximum number of students for the course
            PreparedStatement courseStmt = conn.prepareStatement(courseQuery);
            courseStmt.setString(1, courseID);
            ResultSet courseRs = courseStmt.executeQuery();
            int maxSeats = 0;
            if (courseRs.next()) {
                maxSeats = courseRs.getInt("maximumNumberOfStudents");
            }

            // Get the total number of students registered for the course
            PreparedStatement studentStmt = conn.prepareStatement(studentCountQuery);
            studentStmt.setString(1, courseID);
            ResultSet studentRs = studentStmt.executeQuery();
            int totalStudents = 0;
            if (studentRs.next()) {
                totalStudents = studentRs.getInt(1);
            }

            // Calculate available seats
            int availableSeats = maxSeats - totalStudents;

            // Calculate the progress as a percentage
            int progress = (int) ((double) availableSeats / maxSeats * 100);

            // Set progress on the JProgressBar
            progressBar.setValue(progress);

            // Optionally, you can update the label to display the progress as well
            // lbl_AvailableSeatCount.setText("Available Seats: " + availableSeats);

            courseRs.close();
            courseStmt.close();
            studentRs.close();
            studentStmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
