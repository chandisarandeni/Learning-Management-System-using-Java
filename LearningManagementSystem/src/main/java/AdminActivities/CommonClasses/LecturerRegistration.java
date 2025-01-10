/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminActivities.CommonClasses;

import java.sql.*;

public class LecturerRegistration {

    public static boolean registerLecturer(String lecturerID, String lecturerName, String lecturerNIC,
                                           String lecturerPassword, String lecturerContact, 
                                           String lecturerEmail, String lecturerAddress) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Your database URL
        String user = "root"; // Your database username
        String password = ""; // Your database password

        String query = "INSERT INTO Lecturer (lecturerID, lecturerName, lecturerNIC, lecturerPassword, " +
                       "lecturerContact, lecturerEmail, lecturerAddress) " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, lecturerID);
            pstmt.setString(2, lecturerName);
            pstmt.setString(3, lecturerNIC);
            pstmt.setString(4, lecturerPassword);
            pstmt.setString(5, lecturerContact);
            pstmt.setString(6, lecturerEmail);
            pstmt.setString(7, lecturerAddress);

            int rowsInserted = pstmt.executeUpdate();
            return rowsInserted > 0; // Return true if a row is successfully inserted
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String generateLecturerID() {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Your database URL
        String user = "root"; // Your database username
        String password = ""; // Your database password

        String query = "SELECT MAX(lecturerID) AS lastID FROM Lecturer";
        String prefix = "L-";
        String newID = prefix + "001"; // Default ID if no records exist

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next() && rs.getString("lastID") != null) {
                String lastID = rs.getString("lastID");
                int nextID = Integer.parseInt(lastID.split("-")[1]) + 1;
                newID = prefix + String.format("%03d", nextID);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return newID;
    }
}