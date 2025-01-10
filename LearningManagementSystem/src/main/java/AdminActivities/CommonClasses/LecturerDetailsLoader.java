/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminActivities.CommonClasses;

import java.sql.*;

public class LecturerDetailsLoader {

    // Method to retrieve lecturer details based on lecturerID
    public static String[] getLecturerDetails(String lecturerID) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Your database URL
        String user = "root"; // Your database username
        String password = ""; // Your database password

        String query = "SELECT lecturerID, lecturerName, lecturerNIC, lecturerContact, lecturerEmail " +
                       "FROM Lecturer WHERE lecturerID = ?";
        String[] lecturerDetails = new String[5]; // To store lecturer details

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, lecturerID); // Set the lecturerID
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                lecturerDetails[0] = rs.getString("lecturerID");
                lecturerDetails[1] = rs.getString("lecturerName");
                lecturerDetails[2] = rs.getString("lecturerNIC");
                lecturerDetails[3] = rs.getString("lecturerContact");
                lecturerDetails[4] = rs.getString("lecturerEmail");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lecturerDetails;
    }
}